package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Admin;
import br.edu.ifpb.cultura.organizacional.interfaces.AdminDao;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jozimar
 */
@Named
@RequestScoped
public class ControladorAdmin implements Serializable {
    
    private Admin admin;
    private HttpSession sessao;

    @EJB
    private AdminDao adminDao;

    @PostConstruct
    public void instanceObjects() {
        this.admin = new Admin();
    }

    public String realizarlogin() {
        Admin adminLogado = adminDao.consultarPorEmail(admin.getEmail());
        if (adminLogado == null) {
            mensagemErro("Login Admin", "O Admin informado não está cadastrado!");
            return null;
        } else {
            Admin adminAutenticavel = adminDao
                    .autenticarAdmin(admin.getEmail(), admin.getSenha());
            if (adminAutenticavel == null) {
                mensagemErro("Login Admin", "Os dados informados estão incorretos!");
                return null;
            } else {
                sessao = (HttpSession) FacesContext.getCurrentInstance()
                        .getExternalContext().getSession(true);
                sessao.setAttribute("admin", adminLogado);
                sessao.setAttribute("nome", adminLogado.getNome());
                return "graficos.xhtml";
            }
        }
    }

    public String realizarLogout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "loginAdmin.xhtml";
    }

    public String getNomeSession() {
        sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        return sessao.getAttribute("nome").toString();
    }

    public void mensagemErro(String tituloPagina, String conteudo) {
        FacesMessage mensagemDeErro = new FacesMessage(conteudo);
        mensagemDeErro.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext.getCurrentInstance().addMessage(tituloPagina, mensagemDeErro);
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
