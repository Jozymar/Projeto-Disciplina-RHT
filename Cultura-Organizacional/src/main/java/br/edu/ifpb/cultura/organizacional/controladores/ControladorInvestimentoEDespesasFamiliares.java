package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.InvestimentoEDespesasFamiliares;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.InvestimentoEDespesasFamiliaresDao;
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
public class ControladorInvestimentoEDespesasFamiliares implements Serializable {

    private InvestimentoEDespesasFamiliares investimentoEDespesasFamiliares;

    @EJB
    private InvestimentoEDespesasFamiliaresDao investimentoEDespesasFamiliaresDao;

    @PostConstruct
    public void instanceObjects() {
        this.investimentoEDespesasFamiliares = new InvestimentoEDespesasFamiliares();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.investimentoEDespesasFamiliares.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        investimentoEDespesasFamiliaresDao.cadastrar(investimentoEDespesasFamiliares);
        return "pagina16.xhtml";
    }

    public InvestimentoEDespesasFamiliares getInvestimentoEDespesasFamiliares() {
        return investimentoEDespesasFamiliares;
    }

    public void setInvestimentoEDespesasFamiliares(InvestimentoEDespesasFamiliares investimentoEDespesasFamiliares) {
        this.investimentoEDespesasFamiliares = investimentoEDespesasFamiliares;
    }
}
