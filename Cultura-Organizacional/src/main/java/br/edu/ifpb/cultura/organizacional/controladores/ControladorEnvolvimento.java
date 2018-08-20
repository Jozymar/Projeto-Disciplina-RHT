package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Associacao;
import br.edu.ifpb.cultura.organizacional.entidades.Envolvimento;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.AssociacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.EnvolvimentoDao;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jozimar
 */
@Named
@RequestScoped
public class ControladorEnvolvimento implements Serializable {

    private Envolvimento envolvimento;

    @EJB
    private EnvolvimentoDao envolvimentoDao;

    @PostConstruct
    public void instanceObjects() {
        this.envolvimento = new Envolvimento();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.envolvimento.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        envolvimentoDao.cadastrar(envolvimento);
        return "pagina8.xhtml";
    }

    public Envolvimento getEnvolvimento() {
        return envolvimento;
    }

    public void setEnvolvimento(Envolvimento envolvimento) {
        this.envolvimento = envolvimento;
    }
}
