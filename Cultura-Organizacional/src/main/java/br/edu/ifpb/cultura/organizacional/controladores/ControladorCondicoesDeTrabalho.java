package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.CondicoesDeTrabalho;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.CondicoesDeTrabalhoDao;
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
public class ControladorCondicoesDeTrabalho implements Serializable {

    private CondicoesDeTrabalho condicoesDeTrabalho;

    @EJB
    private CondicoesDeTrabalhoDao condicoesDeTrabalhoDao;

    @PostConstruct
    public void instanceObjects() {
        this.condicoesDeTrabalho = new CondicoesDeTrabalho();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.condicoesDeTrabalho.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        condicoesDeTrabalhoDao.cadastrar(condicoesDeTrabalho);
        return "pagina12.xhtml";
    }

    public CondicoesDeTrabalho getCondicoesDeTrabalho() {
        return condicoesDeTrabalho;
    }

    public void setCondicoesDeTrabalho(CondicoesDeTrabalho condicoesDeTrabalho) {
        this.condicoesDeTrabalho = condicoesDeTrabalho;
    }
}
