package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.ConvivenciaFamiliar;
import br.edu.ifpb.cultura.organizacional.interfaces.ConvivenciaFamiliarDao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jozimar
 */
@Stateless
public class ConvivenciaFamiliarDaoImpl implements ConvivenciaFamiliarDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;
    
    @Override
    public void cadastrar(ConvivenciaFamiliar convivenciaFamiliar) {
        entityManager.persist(convivenciaFamiliar);
    }
    
    @Override
    public Long consultarPorDiscordoTotalmente() {
        String jqpl1 = "SELECT COUNT(c) FROM ConvivenciaFamiliar c WHERE c.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(c) FROM ConvivenciaFamiliar c WHERE c.resposta2=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        createQuery.setParameter("resposta", "Discordo Totalmente");
        createQuery2.setParameter("resposta", "Discordo Totalmente");
        Long total = createQuery.getSingleResult() +
                     createQuery2.getSingleResult();
        return total;
    }
}
