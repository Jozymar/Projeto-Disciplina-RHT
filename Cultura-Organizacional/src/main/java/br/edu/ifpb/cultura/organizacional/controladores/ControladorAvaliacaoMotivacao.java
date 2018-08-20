package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.AvaliacaoMotivacao;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.AvaliacaoMotivacaoDao;
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
public class ControladorAvaliacaoMotivacao implements Serializable {

    private AvaliacaoMotivacao avaliacaoMotivacao;

    @EJB
    private AvaliacaoMotivacaoDao avaliacaoMotivacaoDao;

    @PostConstruct
    public void instanceObjects() {
        this.avaliacaoMotivacao = new AvaliacaoMotivacao();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.avaliacaoMotivacao.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        avaliacaoMotivacaoDao.cadastrar(avaliacaoMotivacao);
        return "pagina9.xhtml";
    }

    public AvaliacaoMotivacao getAvaliacaoMotivacao() {
        return avaliacaoMotivacao;
    }

    public void setAvaliacaoMotivacao(AvaliacaoMotivacao avaliacaoMotivacao) {
        this.avaliacaoMotivacao = avaliacaoMotivacao;
    }
}
