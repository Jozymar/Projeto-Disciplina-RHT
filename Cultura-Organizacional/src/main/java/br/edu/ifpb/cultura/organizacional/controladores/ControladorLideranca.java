package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Associacao;
import br.edu.ifpb.cultura.organizacional.entidades.Lideranca;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.AssociacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.LiderancaDao;
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
public class ControladorLideranca implements Serializable {

    private Lideranca lideranca;

    @EJB
    private LiderancaDao liderancaDao;

    @PostConstruct
    public void instanceObjects() {
        this.lideranca = new Lideranca();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.lideranca.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        liderancaDao.cadastrar(lideranca);
        return "pagina5.xhtml";
    }

    public Lideranca getLideranca() {
        return lideranca;
    }

    public void setLideranca(Lideranca lideranca) {
        this.lideranca = lideranca;
    }
}
