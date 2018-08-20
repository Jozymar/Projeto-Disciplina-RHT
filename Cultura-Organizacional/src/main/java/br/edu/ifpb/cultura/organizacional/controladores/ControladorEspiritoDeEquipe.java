package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Associacao;
import br.edu.ifpb.cultura.organizacional.entidades.EspiritoDeEquipe;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.AssociacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.EspiritoDeEquipeDao;
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
public class ControladorEspiritoDeEquipe implements Serializable {

    private EspiritoDeEquipe espiritoDeEquipe;

    @EJB
    private EspiritoDeEquipeDao espiritoDeEquipeDao;

    @PostConstruct
    public void instanceObjects() {
        this.espiritoDeEquipe = new EspiritoDeEquipe();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.espiritoDeEquipe.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        espiritoDeEquipeDao.cadastrar(espiritoDeEquipe);
        return "pagina6.xhtml";
    }

    public EspiritoDeEquipe getEspiritoDeEquipe() {
        return espiritoDeEquipe;
    }

    public void setEspiritoDeEquipe(EspiritoDeEquipe espiritoDeEquipe) {
        this.espiritoDeEquipe = espiritoDeEquipe;
    }
}
