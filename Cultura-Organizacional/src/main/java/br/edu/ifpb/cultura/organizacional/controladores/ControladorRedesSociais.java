package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.RedesSociais;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.RedesSociaisDao;
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
public class ControladorRedesSociais implements Serializable {

    private RedesSociais redesSociais;

    @EJB
    private RedesSociaisDao redesSociaisDao;

    @PostConstruct
    public void instanceObjects() {
        this.redesSociais = new RedesSociais();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.redesSociais.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        redesSociaisDao.cadastrar(redesSociais);
        return "pagina14.xhtml";
    }

    public RedesSociais getRedesSociais() {
        return redesSociais;
    }

    public void setRedesSociais(RedesSociais redesSociais) {
        this.redesSociais = redesSociais;
    }
}
