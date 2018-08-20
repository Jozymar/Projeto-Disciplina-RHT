package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Associacao;
import br.edu.ifpb.cultura.organizacional.entidades.Funcao;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.AssociacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.FuncaoDao;
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
public class ControladorFuncao implements Serializable {

    private Funcao funcao;

    @EJB
    private FuncaoDao funcaoDao;

    @PostConstruct
    public void instanceObjects() {
        this.funcao = new Funcao();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.funcao.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        funcaoDao.cadastrar(funcao);
        return "pagina7.xhtml";
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
}
