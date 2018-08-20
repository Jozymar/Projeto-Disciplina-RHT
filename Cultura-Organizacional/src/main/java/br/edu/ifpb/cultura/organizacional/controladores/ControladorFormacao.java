package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Formacao;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.FormacaoDao;
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
public class ControladorFormacao implements Serializable {

    private Formacao formacao;

    @EJB
    private FormacaoDao formacaoDao;

    @PostConstruct
    public void instanceObjects() {
        this.formacao = new Formacao();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.formacao.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        formacaoDao.cadastrar(formacao);
        return "pagina11.xhtml";
    }

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }
}
