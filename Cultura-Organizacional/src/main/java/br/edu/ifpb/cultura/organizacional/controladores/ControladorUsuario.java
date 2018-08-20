package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.UsuarioDao;
import java.io.IOException;
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
public class ControladorUsuario implements Serializable {
    
    private Usuario usuario;
    private HttpSession sessao;

    @EJB
    private UsuarioDao usuarioDao;

    @PostConstruct
    public void instanceObjects() {
        this.usuario = new Usuario();
    }

    public String cadastrar() throws IOException {
        if (usuarioDao.consultarPorEmail(usuario.getEmail()) != null) {
            mensagemErro("Cadastro", "Já existe um usuário cadastrado "
                    + "com o e-mail informado!");
        } else if (usuarioDao.consultarPorNome(usuario.getNome()) != null) {
            mensagemErro("Cadastro", "Já existe um usuário cadastrado "
                    + "com o nome informado!");
        } else {
            
            //persisite o usuario no banco
            usuarioDao.cadastrar(usuario);

            return "index.xhtml";
        }
        return null;
    }

    public String realizarlogin() {
        Usuario usuarioLogado = usuarioDao.consultarPorEmail(usuario.getEmail());
        if (usuarioLogado == null) {
            mensagemErro("Login", "O usuário informado não está cadastrado!");
            return null;
        } else {
            Usuario usuarioAutenticavel = usuarioDao
                    .autenticarUsuario(usuario.getEmail(), usuario.getSenha());
            if (usuarioAutenticavel == null) {
                mensagemErro("Login", "Os dados informados estão incorretos!");
                return null;
            } else {
                sessao = (HttpSession) FacesContext.getCurrentInstance()
                        .getExternalContext().getSession(true);
                sessao.setAttribute("usuario", usuarioLogado);
                sessao.setAttribute("nome", usuarioLogado.getNome());
                return "pagina1.xhtml";
            }
        }
    }

    public String realizarLogout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index.xhtml";
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
