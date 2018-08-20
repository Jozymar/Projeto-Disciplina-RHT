package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.SituacaoFinanceira;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.SituacaoFinanceiraDao;
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
public class ControladorSituacaoFinanceira implements Serializable {

    private SituacaoFinanceira situacaoFinanceira;

    @EJB
    private SituacaoFinanceiraDao situacaoFinanceiraDao;

    @PostConstruct
    public void instanceObjects() {
        this.situacaoFinanceira = new SituacaoFinanceira();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.situacaoFinanceira.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        situacaoFinanceiraDao.cadastrar(situacaoFinanceira);
        return "pagina15.xhtml";
    }

    public SituacaoFinanceira getSituacaoFinanceira() {
        return situacaoFinanceira;
    }

    public void setSituacaoFinanceira(SituacaoFinanceira situacaoFinanceira) {
        this.situacaoFinanceira = situacaoFinanceira;
    }
}
