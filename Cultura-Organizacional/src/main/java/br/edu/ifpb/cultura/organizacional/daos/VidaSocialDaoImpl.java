package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.VidaSocial;
import br.edu.ifpb.cultura.organizacional.interfaces.VidaSocialDao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jozimar
 */
@Stateless
public class VidaSocialDaoImpl implements VidaSocialDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;

    @Override
    public void cadastrar(VidaSocial vidaSocial) {
        entityManager.persist(vidaSocial);
    }

    @Override
    public Long consultarPorDiscordoTotalmente() {
        String jqpl1 = "SELECT COUNT(v) FROM VidaSocial v WHERE v.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(v) FROM VidaSocial v WHERE v.resposta2=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        createQuery.setParameter("resposta", "Discordo Totalmente");
        createQuery2.setParameter("resposta", "Discordo Totalmente");
        Long total = createQuery.getSingleResult()
                + createQuery2.getSingleResult();
        return total;
    }

    @Override
    public Long consultarPorDiscordoModeradamente() {
        String jqpl1 = "SELECT COUNT(v) FROM VidaSocial v WHERE v.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(v) FROM VidaSocial v WHERE v.resposta2=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        createQuery.setParameter("resposta", "Discordo Moderadamente");
        createQuery2.setParameter("resposta", "Discordo Moderadamente");
        Long total = createQuery.getSingleResult()
                + createQuery2.getSingleResult();
        return total;
    }

    @Override
    public Long consultarPorNaoConcordoNemDiscordo() {
        String jqpl1 = "SELECT COUNT(v) FROM VidaSocial v WHERE v.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(v) FROM VidaSocial v WHERE v.resposta2=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        createQuery.setParameter("resposta", "Não Concordo Nem Discordo");
        createQuery2.setParameter("resposta", "Não Concordo Nem Discordo");
        Long total = createQuery.getSingleResult()
                + createQuery2.getSingleResult();
        return total;
    }

    @Override
    public Long consultarPorConcordoModeradamente() {
        String jqpl1 = "SELECT COUNT(v) FROM VidaSocial v WHERE v.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(v) FROM VidaSocial v WHERE v.resposta2=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        createQuery.setParameter("resposta", "Concordo Moderadamente");
        createQuery2.setParameter("resposta", "Concordo Moderadamente");
        Long total = createQuery.getSingleResult()
                + createQuery2.getSingleResult();
        return total;
    }

    @Override
    public Long consultarPorConcordoTotalmente() {
        String jqpl1 = "SELECT COUNT(v) FROM VidaSocial v WHERE v.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(v) FROM VidaSocial v WHERE v.resposta2=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        createQuery.setParameter("resposta", "Concordo Totalmente");
        createQuery2.setParameter("resposta", "Concordo Totalmente");
        Long total = createQuery.getSingleResult()
                + createQuery2.getSingleResult();
        return total;
    }
}
