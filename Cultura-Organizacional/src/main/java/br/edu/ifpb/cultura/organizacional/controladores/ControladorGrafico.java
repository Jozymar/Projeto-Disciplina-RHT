package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.interfaces.AssistenciaAosFuncionariosDao;
import br.edu.ifpb.cultura.organizacional.interfaces.AssociacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.AvaliacaoMotivacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.CondicoesDeTrabalhoDao;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author jozimar
 */

@ManagedBean
public class ControladorGrafico implements Serializable {
 
    private PieChartModel pieModel1;
    
    private PieChartModel pieModel2;
    
    private PieChartModel pieModel3;
    
    private PieChartModel pieModel4;
    
    @EJB
    private AssociacaoDao associacaoDao;
    
    @EJB
    private AssistenciaAosFuncionariosDao assistenciaAosFuncionariosDao;
    
    @EJB
    private AvaliacaoMotivacaoDao avaliacaoMotivacaoDao;
    
    @EJB
    private CondicoesDeTrabalhoDao condicoesDeTrabalhoDao;

    @PostConstruct
    public void init() {
        createPieModels();
    }
 
    public PieChartModel getPieModel1() {
        return pieModel1;
    }
    
    public PieChartModel getPieModel2() {
        return pieModel2;
    }
    
    public PieChartModel getPieModel3() {
        return pieModel3;
    }
    
    public PieChartModel getPieModel4() {
        return pieModel4;
    }
     
    private void createPieModels() {
        createPieModel1();
        createPieModel2();
        createPieModel3();
        createPieModel4();
    }
 
    private void createPieModel1() {
        pieModel1 = new PieChartModel();
         
        pieModel1.set("Discordo Totalmente", associacaoDao.consultarPorDiscordoTotalmente());
        pieModel1.set("Discordo Moderadamente", associacaoDao.consultarPorDiscordoModeradamente());
        pieModel1.set("Não Concordo Nem Discordo", associacaoDao.consultarPorNaoConcordoNemDiscordo());
        pieModel1.set("Concordo Moderadamente", associacaoDao.consultarPorConcordoModeradamente());
        pieModel1.set("Concordo Totalmente", associacaoDao.consultarPorDiscordoTotalmente());
         
        pieModel1.setTitle("Associação / Vida Profissional / Compromisso / Empenhamento");
        pieModel1.setLegendPosition("e");
        pieModel1.setShadow(false);
        pieModel1.setShowDataLabels(true);
        pieModel1.setExtender("ext");
    }
    
    private void createPieModel2() {
        pieModel2 = new PieChartModel();
         
        pieModel2.set("Discordo Totalmente", assistenciaAosFuncionariosDao.consultarPorDiscordoTotalmente());
        pieModel2.set("Discordo Moderadamente", assistenciaAosFuncionariosDao.consultarPorDiscordoModeradamente());
        pieModel2.set("Não Concordo Nem Discordo", assistenciaAosFuncionariosDao.consultarPorNaoConcordoNemDiscordo());
        pieModel2.set("Concordo Moderadamente", assistenciaAosFuncionariosDao.consultarPorConcordoModeradamente());
        pieModel2.set("Concordo Totalmente", assistenciaAosFuncionariosDao.consultarPorConcordoTotalmente());
         
        pieModel2.setTitle("Assistência aos Funcionários");
        pieModel2.setLegendPosition("e");
        pieModel2.setShadow(false);
        pieModel2.setShowDataLabels(true);
        pieModel2.setExtender("ext");
    }   
    
    private void createPieModel3() {
        pieModel3 = new PieChartModel();
         
        pieModel3.set("Discordo Totalmente", avaliacaoMotivacaoDao.consultarPorDiscordoTotalmente());
        pieModel3.set("Discordo Moderadamente", avaliacaoMotivacaoDao.consultarPorDiscordoModeradamente());
        pieModel3.set("Não Concordo Nem Discordo", avaliacaoMotivacaoDao.consultarPorNaoConcordoNemDiscordo());
        pieModel3.set("Concordo Moderadamente", avaliacaoMotivacaoDao.consultarPorConcordoModeradamente());
        pieModel3.set("Concordo Totalmente", avaliacaoMotivacaoDao.consultarPorConcordoTotalmente());
         
        pieModel3.setTitle("Avaliação / Motivação");
        pieModel3.setLegendPosition("e");
        pieModel3.setShadow(false);
        pieModel3.setShowDataLabels(true);
        pieModel3.setExtender("ext");
    } 
    
    private void createPieModel4() {
        pieModel4 = new PieChartModel();
         
        pieModel4.set("Discordo Totalmente", condicoesDeTrabalhoDao.consultarPorDiscordoTotalmente());
        pieModel4.set("Discordo Moderadamente", condicoesDeTrabalhoDao.consultarPorDiscordoModeradamente());
        pieModel4.set("Não Concordo Nem Discordo", condicoesDeTrabalhoDao.consultarPorNaoConcordoNemDiscordo());
        pieModel4.set("Concordo Moderadamente", condicoesDeTrabalhoDao.consultarPorConcordoModeradamente());
        pieModel4.set("Concordo Totalmente", condicoesDeTrabalhoDao.consultarPorConcordoTotalmente());
         
        pieModel4.setTitle("Condições de Trabalho");
        pieModel4.setLegendPosition("e");
        pieModel4.setShadow(false);
        pieModel4.setShowDataLabels(true);
        pieModel4.setExtender("ext");
    } 
}
