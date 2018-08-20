package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.Estrategia;
import br.edu.ifpb.cultura.organizacional.interfaces.EstrategiaDao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jozimar
 */
@Stateless
public class EstrategiaDaoImpl implements EstrategiaDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;
    
    @Override
    public void cadastrar(Estrategia estrategia) {
        entityManager.persist(estrategia);
    }
    
    @Override
    public Long consultarPorDiscordoTotalmente() {
        String jqpl1 = "SELECT COUNT(e) FROM Estrategia e WHERE e.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(e) FROM Estrategia e WHERE e.resposta2=:resposta";
        String jqpl3 = "SELECT COUNT(e) FROM Estrategia e WHERE e.resposta3=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        TypedQuery<Long> createQuery3 = entityManager.createQuery(jqpl3, Long.class);
        createQuery.setParameter("resposta", "Discordo Totalmente");
        createQuery2.setParameter("resposta", "Discordo Totalmente");
        createQuery3.setParameter("resposta", "Discordo Totalmente");
        Long total = createQuery.getSingleResult() +
                     createQuery2.getSingleResult() +
                     createQuery3.getSingleResult();
        return total;
    }
}
