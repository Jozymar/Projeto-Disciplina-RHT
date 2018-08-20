package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.entidades.AssistenciaAosFuncionarios;
import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.AssistenciaAosFuncionariosDao;
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
public class ControladorAssistenciaAosFuncionarios implements Serializable {

    private AssistenciaAosFuncionarios assistenciaAosFuncionarios;

    @EJB
    private AssistenciaAosFuncionariosDao assistenciaAosFuncionariosDao;

    @PostConstruct
    public void instanceObjects() {
        this.assistenciaAosFuncionarios = new AssistenciaAosFuncionarios();
        HttpSession sessao = (HttpSession) FacesContext.getCurrentInstance()
                .getExternalContext().getSession(true);
        this.assistenciaAosFuncionarios.setUsuario((Usuario) sessao.getAttribute("usuario"));
    }

    public String cadastrar() {
        assistenciaAosFuncionariosDao.cadastrar(assistenciaAosFuncionarios);
        return "pagina13.xhtml";
    }

    public AssistenciaAosFuncionarios getAssistenciaAosFuncionarios() {
        return assistenciaAosFuncionarios;
    }

    public void setAssistenciaAosFuncionarios(AssistenciaAosFuncionarios assistenciaAosFuncionarios) {
        this.assistenciaAosFuncionarios = assistenciaAosFuncionarios;
    }
}
