package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Associacao;
import br.edu.ifpb.cultura.organizacional.entidades.Estrategia;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.AssociacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.EstrategiaDao;
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
public class ControladorEstrategia implements Serializable {

    private Estrategia estrategia;

    @EJB
    private EstrategiaDao estrategiaDao;

    @PostConstruct
    public void instanceObjects() {
        this.estrategia = new Estrategia();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.estrategia.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        estrategiaDao.cadastrar(estrategia);
        return "pagina3.xhtml";
    }

    public Estrategia getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
}
