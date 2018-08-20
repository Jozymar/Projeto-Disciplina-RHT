package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Associacao;
import br.edu.ifpb.cultura.organizacional.entidades.Saude;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.AssociacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.SaudeDao;
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
public class ControladorSaude implements Serializable {

    private Saude saude;

    @EJB
    private SaudeDao saudeDao;

    @PostConstruct
    public void instanceObjects() {
        this.saude = new Saude();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.saude.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        saudeDao.cadastrar(saude);
        return "pagina19.xhtml";
    }

    public Saude getSaude() {
        return saude;
    }

    public void setSaude(Saude saude) {
        this.saude = saude;
    }
}
