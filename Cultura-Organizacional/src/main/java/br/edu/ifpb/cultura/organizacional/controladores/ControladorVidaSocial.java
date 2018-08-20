package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.entidades.VidaSocial;
import br.edu.ifpb.cultura.organizacional.interfaces.VidaSocialDao;
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
public class ControladorVidaSocial implements Serializable {

    private VidaSocial vidaSocial;

    @EJB
    private VidaSocialDao vidaSocialDao;

    @PostConstruct
    public void instanceObjects() {
        this.vidaSocial = new VidaSocial();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.vidaSocial.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        vidaSocialDao.cadastrar(vidaSocial);
        return "pagina18.xhtml";
    }

    public VidaSocial getVidaSocial() {
        return vidaSocial;
    }

    public void setVidaSocial(VidaSocial vidaSocial) {
        this.vidaSocial = vidaSocial;
    }
}
