package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.FeriasELazer;
import br.edu.ifpb.cultura.organizacional.interfaces.FeriasELazerDao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jozimar
 */
@Stateless
public class FeriasELazerDaoImpl implements FeriasELazerDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;
    
    @Override
    public void cadastrar(FeriasELazer feriasELazer) {
        entityManager.persist(feriasELazer);
    }
    
    @Override
    public Long consultarPorDiscordoTotalmente() {
        String jqpl1 = "SELECT COUNT(f) FROM FeriasELazer f WHERE f.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(f) FROM FeriasELazer f WHERE f.resposta2=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        createQuery.setParameter("resposta", "Discordo Totalmente");
        createQuery2.setParameter("resposta", "Discordo Totalmente");
        Long total = createQuery.getSingleResult() +
                     createQuery2.getSingleResult();
        return total;
    }
}
