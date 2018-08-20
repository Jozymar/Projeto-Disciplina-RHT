package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.Imagem;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.ImagemDao;
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
public class ControladorImagem implements Serializable {

    private Imagem imagem;

    @EJB
    private ImagemDao imagemDao;

    @PostConstruct
    public void instanceObjects() {
        this.imagem = new Imagem();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.imagem.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        imagemDao.cadastrar(imagem);
        return "pagina4.xhtml";
    }

    public Imagem getImagem() {
        return imagem;
    }

    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }
}
