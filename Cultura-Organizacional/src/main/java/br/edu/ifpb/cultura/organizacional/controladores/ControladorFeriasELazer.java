package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Associacao;
import br.edu.ifpb.cultura.organizacional.entidades.FeriasELazer;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.AssociacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.FeriasELazerDao;
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
public class ControladorFeriasELazer implements Serializable {

    private FeriasELazer feriasELazer;

    @EJB
    private FeriasELazerDao feriasELazerDao;

    @PostConstruct
    public void instanceObjects() {
        this.feriasELazer = new FeriasELazer();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.feriasELazer.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        feriasELazerDao.cadastrar(feriasELazer);
        return "pagina20.xhtml";
    }

    public FeriasELazer getFeriasELazer() {
        return feriasELazer;
    }

    public void setFeriasELazer(FeriasELazer feriasELazer) {
        this.feriasELazer = feriasELazer;
    }
}
