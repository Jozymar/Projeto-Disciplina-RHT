package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.ConvivenciaFamiliar;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.ConvivenciaFamiliarDao;
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
public class ControladorConvivenciaFamiliar implements Serializable {

    private ConvivenciaFamiliar convivenciaFamiliar;

    @EJB
    private ConvivenciaFamiliarDao convivenciaFamiliarDao;

    @PostConstruct
    public void instanceObjects() {
        this.convivenciaFamiliar = new ConvivenciaFamiliar();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.convivenciaFamiliar.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        convivenciaFamiliarDao.cadastrar(convivenciaFamiliar);
        return "pagina17.xhtml";
    }

    public ConvivenciaFamiliar getConvivenciaFamiliar() {
        return convivenciaFamiliar;
    }

    public void setConvivenciaFamiliar(ConvivenciaFamiliar convivenciaFamiliar) {
        this.convivenciaFamiliar = convivenciaFamiliar;
    }
}
