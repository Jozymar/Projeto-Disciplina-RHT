package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.SituacaoFinanceira;
import br.edu.ifpb.cultura.organizacional.interfaces.SituacaoFinanceiraDao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jozimar
 */
@Stateless
public class SituacaoFinanceiraDaoImpl implements SituacaoFinanceiraDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;
    
    @Override
    public void cadastrar(SituacaoFinanceira situacaoFinanceira) {
        entityManager.persist(situacaoFinanceira);
    }
    
    @Override
    public Long consultarPorDiscordoTotalmente() {
        String jqpl1 = "SELECT COUNT(s) FROM SituacaoFinanceira s WHERE s.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(s) FROM SituacaoFinanceira s WHERE s.resposta2=:resposta";
        String jqpl3 = "SELECT COUNT(s) FROM SituacaoFinanceira s WHERE s.resposta3=:resposta";
        String jqpl4 = "SELECT COUNT(s) FROM SituacaoFinanceira s WHERE s.resposta4=:resposta";
        String jqpl5 = "SELECT COUNT(s) FROM SituacaoFinanceira s WHERE s.resposta5=:resposta";
        String jqpl6 = "SELECT COUNT(s) FROM SituacaoFinanceira s WHERE s.resposta6=:resposta";
        String jqpl7 = "SELECT COUNT(s) FROM SituacaoFinanceira s WHERE s.resposta7=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        TypedQuery<Long> createQuery3 = entityManager.createQuery(jqpl3, Long.class);
        TypedQuery<Long> createQuery4 = entityManager.createQuery(jqpl4, Long.class);
        TypedQuery<Long> createQuery5 = entityManager.createQuery(jqpl5, Long.class);
        TypedQuery<Long> createQuery6 = entityManager.createQuery(jqpl6, Long.class);
        TypedQuery<Long> createQuery7 = entityManager.createQuery(jqpl7, Long.class);
        createQuery.setParameter("resposta", "Discordo Totalmente");
        createQuery2.setParameter("resposta", "Discordo Totalmente");
        createQuery3.setParameter("resposta", "Discordo Totalmente");
        createQuery4.setParameter("resposta", "Discordo Totalmente");
        createQuery5.setParameter("resposta", "Discordo Totalmente");
        createQuery6.setParameter("resposta", "Discordo Totalmente");
        createQuery7.setParameter("resposta", "Discordo Totalmente");
        Long total = createQuery.getSingleResult() +
                     createQuery2.getSingleResult() +
                     createQuery3.getSingleResult() +
                     createQuery4.getSingleResult() +
                     createQuery5.getSingleResult() +
                     createQuery6.getSingleResult() +
                     createQuery7.getSingleResult();
        return total;
    }
}
