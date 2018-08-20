package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Associacao;
import br.edu.ifpb.cultura.organizacional.entidades.PoliticaEEconomia;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.AssociacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.PoliticaEEconomiaDao;
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
public class ControladorPoliticaEEconomia implements Serializable {

    private PoliticaEEconomia politicaEEconomia;

    @EJB
    private PoliticaEEconomiaDao politicaEEconomiaDao;

    @PostConstruct
    public void instanceObjects() {
        this.politicaEEconomia = new PoliticaEEconomia();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.politicaEEconomia.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        politicaEEconomiaDao.cadastrar(politicaEEconomia);
        return "index.xhtml";
    }

    public PoliticaEEconomia getPoliticaEEconomia() {
        return politicaEEconomia;
    }

    public void setPoliticaEEconomia(PoliticaEEconomia politicaEEconomia) {
        this.politicaEEconomia = politicaEEconomia;
    }
}
