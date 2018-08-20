package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.AssistenciaAosFuncionarios;
import br.edu.ifpb.cultura.organizacional.interfaces.AssistenciaAosFuncionariosDao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jozimar
 */
@Stateless
public class AssistenciaAosFuncionariosDaoImpl implements AssistenciaAosFuncionariosDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;

    @Override
    public void cadastrar(AssistenciaAosFuncionarios assistenciaAosFuncionarios) {
        entityManager.persist(assistenciaAosFuncionarios);
    }

    @Override
    public Long consultarPorDiscordoTotalmente() {
        String jqpl1 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta2=:resposta";
        String jqpl3 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta3=:resposta";
        String jqpl4 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta4=:resposta";
        String jqpl5 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta5=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        TypedQuery<Long> createQuery3 = entityManager.createQuery(jqpl3, Long.class);
        TypedQuery<Long> createQuery4 = entityManager.createQuery(jqpl4, Long.class);
        TypedQuery<Long> createQuery5 = entityManager.createQuery(jqpl5, Long.class);
        createQuery.setParameter("resposta", "Discordo Totalmente");
        createQuery2.setParameter("resposta", "Discordo Totalmente");
        createQuery3.setParameter("resposta", "Discordo Totalmente");
        createQuery4.setParameter("resposta", "Discordo Totalmente");
        createQuery5.setParameter("resposta", "Discordo Totalmente");
        Long total = createQuery.getSingleResult()
                + createQuery2.getSingleResult()
                + createQuery3.getSingleResult()
                + createQuery4.getSingleResult()
                + createQuery5.getSingleResult();
        return total;
    }

    @Override
    public Long consultarPorDiscordoModeradamente() {
        String jqpl1 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta2=:resposta";
        String jqpl3 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta3=:resposta";
        String jqpl4 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta4=:resposta";
        String jqpl5 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta5=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        TypedQuery<Long> createQuery3 = entityManager.createQuery(jqpl3, Long.class);
        TypedQuery<Long> createQuery4 = entityManager.createQuery(jqpl4, Long.class);
        TypedQuery<Long> createQuery5 = entityManager.createQuery(jqpl5, Long.class);
        createQuery.setParameter("resposta", "Discordo Moderadamente");
        createQuery2.setParameter("resposta", "Discordo Moderadamente");
        createQuery3.setParameter("resposta", "Discordo Moderadamente");
        createQuery4.setParameter("resposta", "Discordo Moderadamente");
        createQuery5.setParameter("resposta", "Discordo Moderadamente");
        Long total = createQuery.getSingleResult()
                + createQuery2.getSingleResult()
                + createQuery3.getSingleResult()
                + createQuery4.getSingleResult()
                + createQuery5.getSingleResult();
        return total;
    }

    @Override
    public Long consultarPorNaoConcordoNemDiscordo() {
        String jqpl1 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta2=:resposta";
        String jqpl3 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta3=:resposta";
        String jqpl4 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta4=:resposta";
        String jqpl5 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta5=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        TypedQuery<Long> createQuery3 = entityManager.createQuery(jqpl3, Long.class);
        TypedQuery<Long> createQuery4 = entityManager.createQuery(jqpl4, Long.class);
        TypedQuery<Long> createQuery5 = entityManager.createQuery(jqpl5, Long.class);
        createQuery.setParameter("resposta", "Não Concordo Nem Discordo");
        createQuery2.setParameter("resposta", "Não Concordo Nem Discordo");
        createQuery3.setParameter("resposta", "Não Concordo Nem Discordo");
        createQuery4.setParameter("resposta", "Não Concordo Nem Discordo");
        createQuery5.setParameter("resposta", "Não Concordo Nem Discordo");
        Long total = createQuery.getSingleResult()
                + createQuery2.getSingleResult()
                + createQuery3.getSingleResult()
                + createQuery4.getSingleResult()
                + createQuery5.getSingleResult();
        return total;
    }

    @Override
    public Long consultarPorConcordoModeradamente() {
        String jqpl1 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta2=:resposta";
        String jqpl3 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta3=:resposta";
        String jqpl4 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta4=:resposta";
        String jqpl5 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta5=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        TypedQuery<Long> createQuery3 = entityManager.createQuery(jqpl3, Long.class);
        TypedQuery<Long> createQuery4 = entityManager.createQuery(jqpl4, Long.class);
        TypedQuery<Long> createQuery5 = entityManager.createQuery(jqpl5, Long.class);
        createQuery.setParameter("resposta", "Concordo Moderadamente");
        createQuery2.setParameter("resposta", "Concordo Moderadamente");
        createQuery3.setParameter("resposta", "Concordo Moderadamente");
        createQuery4.setParameter("resposta", "Concordo Moderadamente");
        createQuery5.setParameter("resposta", "Concordo Moderadamente");
        Long total = createQuery.getSingleResult()
                + createQuery2.getSingleResult()
                + createQuery3.getSingleResult()
                + createQuery4.getSingleResult()
                + createQuery5.getSingleResult();
        return total;
    }

    @Override
    public Long consultarPorConcordoTotalmente() {
        String jqpl1 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta2=:resposta";
        String jqpl3 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta3=:resposta";
        String jqpl4 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta4=:resposta";
        String jqpl5 = "SELECT COUNT(a) FROM AssistenciaAosFuncionarios a WHERE a.resposta5=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        TypedQuery<Long> createQuery3 = entityManager.createQuery(jqpl3, Long.class);
        TypedQuery<Long> createQuery4 = entityManager.createQuery(jqpl4, Long.class);
        TypedQuery<Long> createQuery5 = entityManager.createQuery(jqpl5, Long.class);
        createQuery.setParameter("resposta", "Concordo Totalmente");
        createQuery2.setParameter("resposta", "Concordo Totalmente");
        createQuery3.setParameter("resposta", "Concordo Totalmente");
        createQuery4.setParameter("resposta", "Concordo Totalmente");
        createQuery5.setParameter("resposta", "Concordo Totalmente");
        Long total = createQuery.getSingleResult()
                + createQuery2.getSingleResult()
                + createQuery3.getSingleResult()
                + createQuery4.getSingleResult()
                + createQuery5.getSingleResult();
        return total;
    }
}
