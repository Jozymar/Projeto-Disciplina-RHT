package br.edu.ifpb.cultura.organizacional.controladores;

import br.edu.ifpb.cultura.organizacional.interfaces.AssistenciaAosFuncionariosDao;
import br.edu.ifpb.cultura.organizacional.interfaces.AssociacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.AvaliacaoMotivacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.CondicoesDeTrabalhoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.ConvivenciaFamiliarDao;
import br.edu.ifpb.cultura.organizacional.interfaces.EnvolvimentoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.EspiritoDeEquipeDao;
import br.edu.ifpb.cultura.organizacional.interfaces.EstrategiaDao;
import br.edu.ifpb.cultura.organizacional.interfaces.FeriasELazerDao;
import br.edu.ifpb.cultura.organizacional.interfaces.FormacaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.FuncaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.ImagemDao;
import br.edu.ifpb.cultura.organizacional.interfaces.InvestimentoEDespesasFamiliaresDao;
import br.edu.ifpb.cultura.organizacional.interfaces.LiderancaDao;
import br.edu.ifpb.cultura.organizacional.interfaces.PoliticaEEconomiaDao;
import br.edu.ifpb.cultura.organizacional.interfaces.RedesSociaisDao;
import br.edu.ifpb.cultura.organizacional.interfaces.RemuneracaoDao;
import br.edu.ifpb.cultura.organizacional.interfaces.SaudeDao;
import br.edu.ifpb.cultura.organizacional.interfaces.SituacaoFinanceiraDao;
import br.edu.ifpb.cultura.organizacional.interfaces.VidaSocialDao;
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

    private PieChartModel pieModel5;

    private PieChartModel pieModel6;

    private PieChartModel pieModel7;

    private PieChartModel pieModel8;

    private PieChartModel pieModel9;

    private PieChartModel pieModel10;

    private PieChartModel pieModel11;

    private PieChartModel pieModel12;

    private PieChartModel pieModel13;

    private PieChartModel pieModel14;

    private PieChartModel pieModel15;

    private PieChartModel pieModel16;

    private PieChartModel pieModel17;

    private PieChartModel pieModel18;

    private PieChartModel pieModel19;

    private PieChartModel pieModel20;

    @EJB
    private AssistenciaAosFuncionariosDao assistenciaAosFuncionariosDao;

    @EJB
    private AssociacaoDao associacaoDao;

    @EJB
    private AvaliacaoMotivacaoDao avaliacaoMotivacaoDao;

    @EJB
    private CondicoesDeTrabalhoDao condicoesDeTrabalhoDao;

    @EJB
    private ConvivenciaFamiliarDao convivenciaFamiliarDao;

    @EJB
    private EnvolvimentoDao envolvimentoDao;

    @EJB
    private EspiritoDeEquipeDao espiritoDeEquipeDao;

    @EJB
    private EstrategiaDao estrategiaDao;

    @EJB
    private FeriasELazerDao feriasELazerDao;

    @EJB
    private FormacaoDao formacaoDao;

    @EJB
    private FuncaoDao funcaoDao;

    @EJB
    private ImagemDao imagemDao;

    @EJB
    private InvestimentoEDespesasFamiliaresDao investimentoEDespesasFamiliaresDao;

    @EJB
    private LiderancaDao liderancaDao;

    @EJB
    private PoliticaEEconomiaDao politicaEEconomiaDao;

    @EJB
    private RedesSociaisDao redesSociaisDao;

    @EJB
    private RemuneracaoDao remuneracaoDao;

    @EJB
    private SaudeDao saudeDao;

    @EJB
    private SituacaoFinanceiraDao situacaoFinanceiraDao;

    @EJB
    private VidaSocialDao vidaSocialDao;

    private Long total1;

    private Long total2;

    private Long total3;

    private Long total4;

    private Long total5;

    private Long total6;

    private Long total7;

    private Long total8;

    private Long total9;

    private Long total10;

    private Long total11;

    private Long total12;

    private Long total13;

    private Long total14;

    private Long total15;

    private Long total16;

    private Long total17;

    private Long total18;

    private Long total19;

    private Long total20;

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

    public PieChartModel getPieModel5() {
        return pieModel5;
    }

    public PieChartModel getPieModel6() {
        return pieModel6;
    }

    public PieChartModel getPieModel7() {
        return pieModel7;
    }

    public PieChartModel getPieModel8() {
        return pieModel8;
    }

    public PieChartModel getPieModel9() {
        return pieModel9;
    }

    public PieChartModel getPieModel10() {
        return pieModel10;
    }

    public PieChartModel getPieModel11() {
        return pieModel11;
    }

    public PieChartModel getPieModel12() {
        return pieModel12;
    }

    public PieChartModel getPieModel13() {
        return pieModel13;
    }

    public PieChartModel getPieModel14() {
        return pieModel14;
    }

    public PieChartModel getPieModel15() {
        return pieModel15;
    }

    public PieChartModel getPieModel16() {
        return pieModel16;
    }

    public PieChartModel getPieModel17() {
        return pieModel17;
    }

    public PieChartModel getPieModel18() {
        return pieModel18;
    }

    public PieChartModel getPieModel19() {
        return pieModel19;
    }

    public PieChartModel getPieModel20() {
        return pieModel20;
    }

    private void createPieModels() {
        createPieModel1();
        createPieModel2();
        createPieModel3();
        createPieModel4();
        createPieModel5();
        createPieModel6();
        createPieModel7();
        createPieModel8();
        createPieModel9();
        createPieModel10();
        createPieModel11();
        createPieModel12();
        createPieModel13();
        createPieModel14();
        createPieModel15();
        createPieModel16();
        createPieModel17();
        createPieModel18();
        createPieModel19();
        createPieModel20();
    }

    private void createPieModel1() {
        pieModel1 = new PieChartModel();

        pieModel1.set("Discordo Totalmente", assistenciaAosFuncionariosDao.consultarPorDiscordoTotalmente());
        pieModel1.set("Discordo Moderadamente", assistenciaAosFuncionariosDao.consultarPorDiscordoModeradamente());
        pieModel1.set("Não Concordo Nem Discordo", assistenciaAosFuncionariosDao.consultarPorNaoConcordoNemDiscordo());
        pieModel1.set("Concordo Moderadamente", assistenciaAosFuncionariosDao.consultarPorConcordoModeradamente());
        pieModel1.set("Concordo Totalmente", assistenciaAosFuncionariosDao.consultarPorConcordoTotalmente());

        pieModel1.setTitle("Assistência aos Funcionários");
        pieModel1.setLegendPosition("e");
        pieModel1.setShadow(false);
        pieModel1.setShowDataLabels(true);
        pieModel1.setExtender("ext");
    }

    public boolean resultadoPieModel1() {
        total1 = assistenciaAosFuncionariosDao.consultarPorDiscordoTotalmente()
                + assistenciaAosFuncionariosDao.consultarPorDiscordoModeradamente()
                + assistenciaAosFuncionariosDao.consultarPorNaoConcordoNemDiscordo()
                + assistenciaAosFuncionariosDao.consultarPorConcordoModeradamente()
                + assistenciaAosFuncionariosDao.consultarPorConcordoTotalmente();
        if (((assistenciaAosFuncionariosDao.consultarPorDiscordoTotalmente() * 100) / total1) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel2() {
        pieModel2 = new PieChartModel();

        pieModel2.set("Discordo Totalmente", associacaoDao.consultarPorDiscordoTotalmente());
        pieModel2.set("Discordo Moderadamente", associacaoDao.consultarPorDiscordoModeradamente());
        pieModel2.set("Não Concordo Nem Discordo", associacaoDao.consultarPorNaoConcordoNemDiscordo());
        pieModel2.set("Concordo Moderadamente", associacaoDao.consultarPorConcordoModeradamente());
        pieModel2.set("Concordo Totalmente", associacaoDao.consultarPorDiscordoTotalmente());

        pieModel2.setTitle("Associação / Vida Profissional / Compromisso / Empenhamento");
        pieModel2.setLegendPosition("e");
        pieModel2.setShadow(false);
        pieModel2.setShowDataLabels(true);
        pieModel2.setExtender("ext");
    }

    public boolean resultadoPieModel2() {
        total2 = associacaoDao.consultarPorDiscordoTotalmente()
                + associacaoDao.consultarPorDiscordoModeradamente()
                + associacaoDao.consultarPorNaoConcordoNemDiscordo()
                + associacaoDao.consultarPorConcordoModeradamente()
                + associacaoDao.consultarPorDiscordoTotalmente();
        if (((associacaoDao.consultarPorDiscordoTotalmente() * 100) / total2) >= 30) {
            return true;
        } else {
            return false;
        }
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

    public boolean resultadoPieModel3() {
        total3 = avaliacaoMotivacaoDao.consultarPorDiscordoTotalmente()
                + avaliacaoMotivacaoDao.consultarPorDiscordoModeradamente()
                + avaliacaoMotivacaoDao.consultarPorNaoConcordoNemDiscordo()
                + avaliacaoMotivacaoDao.consultarPorConcordoModeradamente()
                + avaliacaoMotivacaoDao.consultarPorConcordoTotalmente();
        if (((avaliacaoMotivacaoDao.consultarPorDiscordoTotalmente() * 100) / total3) >= 30) {
            return true;
        } else {
            return false;
        }
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

    public boolean resultadoPieModel4() {
        total4 = condicoesDeTrabalhoDao.consultarPorDiscordoTotalmente()
                + condicoesDeTrabalhoDao.consultarPorDiscordoModeradamente()
                + condicoesDeTrabalhoDao.consultarPorNaoConcordoNemDiscordo()
                + condicoesDeTrabalhoDao.consultarPorConcordoModeradamente()
                + condicoesDeTrabalhoDao.consultarPorConcordoTotalmente();
        if (((condicoesDeTrabalhoDao.consultarPorDiscordoTotalmente() * 100) / total4) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel5() {
        pieModel5 = new PieChartModel();

        pieModel5.set("Discordo Totalmente", convivenciaFamiliarDao.consultarPorDiscordoTotalmente());
        pieModel5.set("Discordo Moderadamente", convivenciaFamiliarDao.consultarPorDiscordoModeradamente());
        pieModel5.set("Não Concordo Nem Discordo", convivenciaFamiliarDao.consultarPorNaoConcordoNemDiscordo());
        pieModel5.set("Concordo Moderadamente", convivenciaFamiliarDao.consultarPorConcordoModeradamente());
        pieModel5.set("Concordo Totalmente", convivenciaFamiliarDao.consultarPorConcordoTotalmente());

        pieModel5.setTitle("Convivência Familiar");
        pieModel5.setLegendPosition("e");
        pieModel5.setShadow(false);
        pieModel5.setShowDataLabels(true);
        pieModel5.setExtender("ext");
    }

    public boolean resultadoPieModel5() {
        total5 = convivenciaFamiliarDao.consultarPorDiscordoTotalmente()
                + convivenciaFamiliarDao.consultarPorDiscordoModeradamente()
                + convivenciaFamiliarDao.consultarPorNaoConcordoNemDiscordo()
                + convivenciaFamiliarDao.consultarPorConcordoModeradamente()
                + convivenciaFamiliarDao.consultarPorConcordoTotalmente();
        if (((convivenciaFamiliarDao.consultarPorDiscordoTotalmente() * 100) / total5) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel6() {
        pieModel6 = new PieChartModel();

        pieModel6.set("Discordo Totalmente", envolvimentoDao.consultarPorDiscordoTotalmente());
        pieModel6.set("Discordo Moderadamente", envolvimentoDao.consultarPorDiscordoModeradamente());
        pieModel6.set("Não Concordo Nem Discordo", envolvimentoDao.consultarPorNaoConcordoNemDiscordo());
        pieModel6.set("Concordo Moderadamente", envolvimentoDao.consultarPorConcordoModeradamente());
        pieModel6.set("Concordo Totalmente", envolvimentoDao.consultarPorConcordoTotalmente());

        pieModel6.setTitle("Envolvimento");
        pieModel6.setLegendPosition("e");
        pieModel6.setShadow(false);
        pieModel6.setShowDataLabels(true);
        pieModel6.setExtender("ext");
    }

    public boolean resultadoPieModel6() {
        total6 = envolvimentoDao.consultarPorDiscordoTotalmente()
                + envolvimentoDao.consultarPorDiscordoModeradamente()
                + envolvimentoDao.consultarPorNaoConcordoNemDiscordo()
                + envolvimentoDao.consultarPorConcordoModeradamente()
                + envolvimentoDao.consultarPorConcordoTotalmente();
        if (((envolvimentoDao.consultarPorDiscordoTotalmente() * 100) / total6) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel7() {
        pieModel7 = new PieChartModel();

        pieModel7.set("Discordo Totalmente", espiritoDeEquipeDao.consultarPorDiscordoTotalmente());
        pieModel7.set("Discordo Moderadamente", espiritoDeEquipeDao.consultarPorDiscordoModeradamente());
        pieModel7.set("Não Concordo Nem Discordo", espiritoDeEquipeDao.consultarPorNaoConcordoNemDiscordo());
        pieModel7.set("Concordo Moderadamente", espiritoDeEquipeDao.consultarPorConcordoModeradamente());
        pieModel7.set("Concordo Totalmente", espiritoDeEquipeDao.consultarPorConcordoTotalmente());

        pieModel7.setTitle("Espírito de Equipe");
        pieModel7.setLegendPosition("e");
        pieModel7.setShadow(false);
        pieModel7.setShowDataLabels(true);
        pieModel7.setExtender("ext");
    }

    public boolean resultadoPieModel7() {
        total7 = espiritoDeEquipeDao.consultarPorDiscordoTotalmente()
                + espiritoDeEquipeDao.consultarPorDiscordoModeradamente()
                + espiritoDeEquipeDao.consultarPorNaoConcordoNemDiscordo()
                + espiritoDeEquipeDao.consultarPorConcordoModeradamente()
                + espiritoDeEquipeDao.consultarPorConcordoTotalmente();
        if (((espiritoDeEquipeDao.consultarPorDiscordoTotalmente() * 100) / total7) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel8() {
        pieModel8 = new PieChartModel();

        pieModel8.set("Discordo Totalmente", estrategiaDao.consultarPorDiscordoTotalmente());
        pieModel8.set("Discordo Moderadamente", estrategiaDao.consultarPorDiscordoModeradamente());
        pieModel8.set("Não Concordo Nem Discordo", estrategiaDao.consultarPorNaoConcordoNemDiscordo());
        pieModel8.set("Concordo Moderadamente", estrategiaDao.consultarPorConcordoModeradamente());
        pieModel8.set("Concordo Totalmente", estrategiaDao.consultarPorConcordoTotalmente());

        pieModel8.setTitle("Estratégia");
        pieModel8.setLegendPosition("e");
        pieModel8.setShadow(false);
        pieModel8.setShowDataLabels(true);
        pieModel8.setExtender("ext");
    }

    public boolean resultadoPieModel8() {
        total8 = estrategiaDao.consultarPorDiscordoTotalmente()
                + estrategiaDao.consultarPorDiscordoModeradamente()
                + estrategiaDao.consultarPorNaoConcordoNemDiscordo()
                + estrategiaDao.consultarPorConcordoModeradamente()
                + estrategiaDao.consultarPorConcordoTotalmente();
        if (((estrategiaDao.consultarPorDiscordoTotalmente() * 100) / total8) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel9() {
        pieModel9 = new PieChartModel();

        pieModel9.set("Discordo Totalmente", feriasELazerDao.consultarPorDiscordoTotalmente());
        pieModel9.set("Discordo Moderadamente", feriasELazerDao.consultarPorDiscordoModeradamente());
        pieModel9.set("Não Concordo Nem Discordo", feriasELazerDao.consultarPorNaoConcordoNemDiscordo());
        pieModel9.set("Concordo Moderadamente", feriasELazerDao.consultarPorConcordoModeradamente());
        pieModel9.set("Concordo Totalmente", feriasELazerDao.consultarPorConcordoTotalmente());

        pieModel9.setTitle("Férias e Lazer");
        pieModel9.setLegendPosition("e");
        pieModel9.setShadow(false);
        pieModel9.setShowDataLabels(true);
        pieModel9.setExtender("ext");
    }

    public boolean resultadoPieModel9() {
        total9 = feriasELazerDao.consultarPorDiscordoTotalmente()
                + feriasELazerDao.consultarPorDiscordoModeradamente()
                + feriasELazerDao.consultarPorNaoConcordoNemDiscordo()
                + feriasELazerDao.consultarPorConcordoModeradamente()
                + feriasELazerDao.consultarPorConcordoTotalmente();
        if (((feriasELazerDao.consultarPorDiscordoTotalmente() * 100) / total9) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel10() {
        pieModel10 = new PieChartModel();

        pieModel10.set("Discordo Totalmente", formacaoDao.consultarPorDiscordoTotalmente());
        pieModel10.set("Discordo Moderadamente", formacaoDao.consultarPorDiscordoModeradamente());
        pieModel10.set("Não Concordo Nem Discordo", formacaoDao.consultarPorNaoConcordoNemDiscordo());
        pieModel10.set("Concordo Moderadamente", formacaoDao.consultarPorConcordoModeradamente());
        pieModel10.set("Concordo Totalmente", formacaoDao.consultarPorConcordoTotalmente());

        pieModel10.setTitle("Formação");
        pieModel10.setLegendPosition("e");
        pieModel10.setShadow(false);
        pieModel10.setShowDataLabels(true);
        pieModel10.setExtender("ext");
    }

    public boolean resultadoPieModel10() {
        total10 = formacaoDao.consultarPorDiscordoTotalmente()
                + formacaoDao.consultarPorDiscordoModeradamente()
                + formacaoDao.consultarPorNaoConcordoNemDiscordo()
                + formacaoDao.consultarPorConcordoModeradamente()
                + formacaoDao.consultarPorConcordoTotalmente();
        if (((formacaoDao.consultarPorDiscordoTotalmente() * 100) / total10) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel11() {
        pieModel11 = new PieChartModel();

        pieModel11.set("Discordo Totalmente", funcaoDao.consultarPorDiscordoTotalmente());
        pieModel11.set("Discordo Moderadamente", funcaoDao.consultarPorDiscordoModeradamente());
        pieModel11.set("Não Concordo Nem Discordo", funcaoDao.consultarPorNaoConcordoNemDiscordo());
        pieModel11.set("Concordo Moderadamente", funcaoDao.consultarPorConcordoModeradamente());
        pieModel11.set("Concordo Totalmente", funcaoDao.consultarPorConcordoTotalmente());

        pieModel11.setTitle("Função");
        pieModel11.setLegendPosition("e");
        pieModel11.setShadow(false);
        pieModel11.setShowDataLabels(true);
        pieModel11.setExtender("ext");
    }

    public boolean resultadoPieModel11() {
        total11 = funcaoDao.consultarPorDiscordoTotalmente()
                + funcaoDao.consultarPorDiscordoModeradamente()
                + funcaoDao.consultarPorNaoConcordoNemDiscordo()
                + funcaoDao.consultarPorConcordoModeradamente()
                + funcaoDao.consultarPorConcordoTotalmente();
        if (((funcaoDao.consultarPorDiscordoTotalmente() * 100) / total11) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel12() {
        pieModel12 = new PieChartModel();

        pieModel12.set("Discordo Totalmente", imagemDao.consultarPorDiscordoTotalmente());
        pieModel12.set("Discordo Moderadamente", imagemDao.consultarPorDiscordoModeradamente());
        pieModel12.set("Não Concordo Nem Discordo", imagemDao.consultarPorNaoConcordoNemDiscordo());
        pieModel12.set("Concordo Moderadamente", imagemDao.consultarPorConcordoModeradamente());
        pieModel12.set("Concordo Totalmente", imagemDao.consultarPorConcordoTotalmente());

        pieModel12.setTitle("Imagem");
        pieModel12.setLegendPosition("e");
        pieModel12.setShadow(false);
        pieModel12.setShowDataLabels(true);
        pieModel12.setExtender("ext");
    }

    public boolean resultadoPieModel12() {
        total12 = imagemDao.consultarPorDiscordoTotalmente()
                + imagemDao.consultarPorDiscordoModeradamente()
                + imagemDao.consultarPorNaoConcordoNemDiscordo()
                + imagemDao.consultarPorConcordoModeradamente()
                + imagemDao.consultarPorConcordoTotalmente();
        if (((imagemDao.consultarPorDiscordoTotalmente() * 100) / total12) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel13() {
        pieModel13 = new PieChartModel();

        pieModel13.set("Discordo Totalmente", investimentoEDespesasFamiliaresDao.consultarPorDiscordoTotalmente());
        pieModel13.set("Discordo Moderadamente", investimentoEDespesasFamiliaresDao.consultarPorDiscordoModeradamente());
        pieModel13.set("Não Concordo Nem Discordo", investimentoEDespesasFamiliaresDao.consultarPorNaoConcordoNemDiscordo());
        pieModel13.set("Concordo Moderadamente", investimentoEDespesasFamiliaresDao.consultarPorConcordoModeradamente());
        pieModel13.set("Concordo Totalmente", investimentoEDespesasFamiliaresDao.consultarPorConcordoTotalmente());

        pieModel13.setTitle("Investimento e Despesas Familiares");
        pieModel13.setLegendPosition("e");
        pieModel13.setShadow(false);
        pieModel13.setShowDataLabels(true);
        pieModel13.setExtender("ext");
    }

    public boolean resultadoPieModel13() {
        total13 = investimentoEDespesasFamiliaresDao.consultarPorDiscordoTotalmente()
                + investimentoEDespesasFamiliaresDao.consultarPorDiscordoModeradamente()
                + investimentoEDespesasFamiliaresDao.consultarPorNaoConcordoNemDiscordo()
                + investimentoEDespesasFamiliaresDao.consultarPorConcordoModeradamente()
                + investimentoEDespesasFamiliaresDao.consultarPorConcordoTotalmente();
        if (((investimentoEDespesasFamiliaresDao.consultarPorDiscordoTotalmente() * 100) / total13) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel14() {
        pieModel14 = new PieChartModel();

        pieModel14.set("Discordo Totalmente", liderancaDao.consultarPorDiscordoTotalmente());
        pieModel14.set("Discordo Moderadamente", liderancaDao.consultarPorDiscordoModeradamente());
        pieModel14.set("Não Concordo Nem Discordo", liderancaDao.consultarPorNaoConcordoNemDiscordo());
        pieModel14.set("Concordo Moderadamente", liderancaDao.consultarPorConcordoModeradamente());
        pieModel14.set("Concordo Totalmente", liderancaDao.consultarPorConcordoTotalmente());

        pieModel14.setTitle("Liderança");
        pieModel14.setLegendPosition("e");
        pieModel14.setShadow(false);
        pieModel14.setShowDataLabels(true);
        pieModel14.setExtender("ext");
    }

    public boolean resultadoPieModel14() {
        total14 = liderancaDao.consultarPorDiscordoTotalmente()
                + liderancaDao.consultarPorDiscordoModeradamente()
                + liderancaDao.consultarPorNaoConcordoNemDiscordo()
                + liderancaDao.consultarPorConcordoModeradamente()
                + liderancaDao.consultarPorConcordoTotalmente();
        if (((liderancaDao.consultarPorDiscordoTotalmente() * 100) / total14) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel15() {
        pieModel15 = new PieChartModel();

        pieModel15.set("Discordo Totalmente", politicaEEconomiaDao.consultarPorDiscordoTotalmente());
        pieModel15.set("Discordo Moderadamente", politicaEEconomiaDao.consultarPorDiscordoModeradamente());
        pieModel15.set("Não Concordo Nem Discordo", politicaEEconomiaDao.consultarPorNaoConcordoNemDiscordo());
        pieModel15.set("Concordo Moderadamente", politicaEEconomiaDao.consultarPorConcordoModeradamente());
        pieModel15.set("Concordo Totalmente", politicaEEconomiaDao.consultarPorConcordoTotalmente());

        pieModel15.setTitle("Política e Economia");
        pieModel15.setLegendPosition("e");
        pieModel15.setShadow(false);
        pieModel15.setShowDataLabels(true);
        pieModel15.setExtender("ext");
    }

    public boolean resultadoPieModel15() {
        total15 = politicaEEconomiaDao.consultarPorDiscordoTotalmente()
                + politicaEEconomiaDao.consultarPorDiscordoModeradamente()
                + politicaEEconomiaDao.consultarPorNaoConcordoNemDiscordo()
                + politicaEEconomiaDao.consultarPorConcordoModeradamente()
                + politicaEEconomiaDao.consultarPorConcordoTotalmente();
        if (((politicaEEconomiaDao.consultarPorDiscordoTotalmente() * 100) / total15) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel16() {
        pieModel16 = new PieChartModel();

        pieModel16.set("Discordo Totalmente", redesSociaisDao.consultarPorDiscordoTotalmente());
        pieModel16.set("Discordo Moderadamente", redesSociaisDao.consultarPorDiscordoModeradamente());
        pieModel16.set("Não Concordo Nem Discordo", redesSociaisDao.consultarPorNaoConcordoNemDiscordo());
        pieModel16.set("Concordo Moderadamente", redesSociaisDao.consultarPorConcordoModeradamente());
        pieModel16.set("Concordo Totalmente", redesSociaisDao.consultarPorConcordoTotalmente());

        pieModel16.setTitle("Redes Sociais");
        pieModel16.setLegendPosition("e");
        pieModel16.setShadow(false);
        pieModel16.setShowDataLabels(true);
        pieModel16.setExtender("ext");
    }

    public boolean resultadoPieModel16() {
        total16 = redesSociaisDao.consultarPorDiscordoTotalmente()
                + redesSociaisDao.consultarPorDiscordoModeradamente()
                + redesSociaisDao.consultarPorNaoConcordoNemDiscordo()
                + redesSociaisDao.consultarPorConcordoModeradamente()
                + redesSociaisDao.consultarPorConcordoTotalmente();
        if (((redesSociaisDao.consultarPorDiscordoTotalmente() * 100) / total16) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel17() {
        pieModel17 = new PieChartModel();

        pieModel17.set("Discordo Totalmente", remuneracaoDao.consultarPorDiscordoTotalmente());
        pieModel17.set("Discordo Moderadamente", remuneracaoDao.consultarPorDiscordoModeradamente());
        pieModel17.set("Não Concordo Nem Discordo", remuneracaoDao.consultarPorNaoConcordoNemDiscordo());
        pieModel17.set("Concordo Moderadamente", remuneracaoDao.consultarPorConcordoModeradamente());
        pieModel17.set("Concordo Totalmente", remuneracaoDao.consultarPorConcordoTotalmente());

        pieModel17.setTitle("Remuneração");
        pieModel17.setLegendPosition("e");
        pieModel17.setShadow(false);
        pieModel17.setShowDataLabels(true);
        pieModel17.setExtender("ext");
    }

    public boolean resultadoPieModel17() {
        total17 = remuneracaoDao.consultarPorDiscordoTotalmente()
                + remuneracaoDao.consultarPorDiscordoModeradamente()
                + remuneracaoDao.consultarPorNaoConcordoNemDiscordo()
                + remuneracaoDao.consultarPorConcordoModeradamente()
                + remuneracaoDao.consultarPorConcordoTotalmente();
        if (((remuneracaoDao.consultarPorDiscordoTotalmente() * 100) / total17) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel18() {
        pieModel18 = new PieChartModel();

        pieModel18.set("Discordo Totalmente", saudeDao.consultarPorDiscordoTotalmente());
        pieModel18.set("Discordo Moderadamente", saudeDao.consultarPorDiscordoModeradamente());
        pieModel18.set("Não Concordo Nem Discordo", saudeDao.consultarPorNaoConcordoNemDiscordo());
        pieModel18.set("Concordo Moderadamente", saudeDao.consultarPorConcordoModeradamente());
        pieModel18.set("Concordo Totalmente", saudeDao.consultarPorConcordoTotalmente());

        pieModel18.setTitle("Saúde");
        pieModel18.setLegendPosition("e");
        pieModel18.setShadow(false);
        pieModel18.setShowDataLabels(true);
        pieModel18.setExtender("ext");
    }

    public boolean resultadoPieModel18() {
        total18 = saudeDao.consultarPorDiscordoTotalmente()
                + saudeDao.consultarPorDiscordoModeradamente()
                + saudeDao.consultarPorNaoConcordoNemDiscordo()
                + saudeDao.consultarPorConcordoModeradamente()
                + saudeDao.consultarPorConcordoTotalmente();
        if (((saudeDao.consultarPorDiscordoTotalmente() * 100) / total18) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel19() {
        pieModel19 = new PieChartModel();

        pieModel19.set("Discordo Totalmente", situacaoFinanceiraDao.consultarPorDiscordoTotalmente());
        pieModel19.set("Discordo Moderadamente", situacaoFinanceiraDao.consultarPorDiscordoModeradamente());
        pieModel19.set("Não Concordo Nem Discordo", situacaoFinanceiraDao.consultarPorNaoConcordoNemDiscordo());
        pieModel19.set("Concordo Moderadamente", situacaoFinanceiraDao.consultarPorConcordoModeradamente());
        pieModel19.set("Concordo Totalmente", situacaoFinanceiraDao.consultarPorConcordoTotalmente());

        pieModel19.setTitle("Situação Financeira");
        pieModel19.setLegendPosition("e");
        pieModel19.setShadow(false);
        pieModel19.setShowDataLabels(true);
        pieModel19.setExtender("ext");
    }

    public boolean resultadoPieModel19() {
        total19 = situacaoFinanceiraDao.consultarPorDiscordoTotalmente()
                + situacaoFinanceiraDao.consultarPorDiscordoModeradamente()
                + situacaoFinanceiraDao.consultarPorNaoConcordoNemDiscordo()
                + situacaoFinanceiraDao.consultarPorConcordoModeradamente()
                + situacaoFinanceiraDao.consultarPorConcordoTotalmente();
        if (((situacaoFinanceiraDao.consultarPorDiscordoTotalmente() * 100) / total19) >= 30) {
            return true;
        } else {
            return false;
        }
    }

    private void createPieModel20() {
        pieModel20 = new PieChartModel();

        pieModel20.set("Discordo Totalmente", vidaSocialDao.consultarPorDiscordoTotalmente());
        pieModel20.set("Discordo Moderadamente", vidaSocialDao.consultarPorDiscordoModeradamente());
        pieModel20.set("Não Concordo Nem Discordo", vidaSocialDao.consultarPorNaoConcordoNemDiscordo());
        pieModel20.set("Concordo Moderadamente", vidaSocialDao.consultarPorConcordoModeradamente());
        pieModel20.set("Concordo Totalmente", vidaSocialDao.consultarPorConcordoTotalmente());

        pieModel20.setTitle("Vida Social");
        pieModel20.setLegendPosition("e");
        pieModel20.setShadow(false);
        pieModel20.setShowDataLabels(true);
        pieModel20.setExtender("ext");
    }

    public boolean resultadoPieModel20() {
        total20 = vidaSocialDao.consultarPorDiscordoTotalmente()
                + vidaSocialDao.consultarPorDiscordoModeradamente()
                + vidaSocialDao.consultarPorNaoConcordoNemDiscordo()
                + vidaSocialDao.consultarPorConcordoModeradamente()
                + vidaSocialDao.consultarPorConcordoTotalmente();
        if (((vidaSocialDao.consultarPorDiscordoTotalmente() * 100) / total20) >= 30) {
            return true;
        } else {
            return false;
        }
    }
}
