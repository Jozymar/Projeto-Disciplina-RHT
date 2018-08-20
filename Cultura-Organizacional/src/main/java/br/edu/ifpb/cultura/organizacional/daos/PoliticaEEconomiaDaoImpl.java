package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.PoliticaEEconomia;
import br.edu.ifpb.cultura.organizacional.interfaces.PoliticaEEconomiaDao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jozimar
 */
@Stateless
public class PoliticaEEconomiaDaoImpl implements PoliticaEEconomiaDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;
    
    @Override
    public void cadastrar(PoliticaEEconomia politicaEEconomia) {
        entityManager.persist(politicaEEconomia);
    }
    
    @Override
    public Long consultarPorDiscordoTotalmente() {
        String jqpl1 = "SELECT COUNT(p) FROM PoliticaEEconomia p WHERE p.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(p) FROM PoliticaEEconomia p WHERE p.resposta2=:resposta";
        String jqpl3 = "SELECT COUNT(p) FROM PoliticaEEconomia p WHERE p.resposta3=:resposta";
        String jqpl4 = "SELECT COUNT(p) FROM PoliticaEEconomia p WHERE p.resposta4=:resposta";
        String jqpl5 = "SELECT COUNT(p) FROM PoliticaEEconomia p WHERE p.resposta5=:resposta";
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
        Long total = createQuery.getSingleResult() +
                     createQuery2.getSingleResult() +
                     createQuery3.getSingleResult() +
                     createQuery4.getSingleResult() +
                     createQuery5.getSingleResult();
        return total;
    }
}
