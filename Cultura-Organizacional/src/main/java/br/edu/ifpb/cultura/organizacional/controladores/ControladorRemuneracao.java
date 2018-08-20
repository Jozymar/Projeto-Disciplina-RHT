package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Associacao;
import br.edu.ifpb.cultura.organizacional.entidades.Remuneracao;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.AssociacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.RemuneracaoDao;
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
public class ControladorRemuneracao implements Serializable {

    private Remuneracao remuneracao;

    @EJB
    private RemuneracaoDao remuneracaoDao;

    @PostConstruct
    public void instanceObjects() {
        this.remuneracao = new Remuneracao();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.remuneracao.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        remuneracaoDao.cadastrar(remuneracao);
        return "pagina10.xhtml";
    }

    public Remuneracao getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(Remuneracao remuneracao) {
        this.remuneracao = remuneracao;
    }
}
