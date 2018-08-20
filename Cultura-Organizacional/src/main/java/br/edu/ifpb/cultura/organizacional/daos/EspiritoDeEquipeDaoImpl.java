package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.EspiritoDeEquipe;
import br.edu.ifpb.cultura.organizacional.interfaces.EspiritoDeEquipeDao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jozimar
 */
@Stateless
public class EspiritoDeEquipeDaoImpl implements EspiritoDeEquipeDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;
    
    @Override
    public void cadastrar(EspiritoDeEquipe espiritoDeEquipe) {
        entityManager.persist(espiritoDeEquipe);
    }
    
    @Override
    public Long consultarPorDiscordoTotalmente() {
        String jqpl1 = "SELECT COUNT(e) FROM EspiritoDeEquipe e WHERE e.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(e) FROM EspiritoDeEquipe e WHERE e.resposta2=:resposta";
        String jqpl3 = "SELECT COUNT(e) FROM EspiritoDeEquipe e WHERE e.resposta3=:resposta";
        String jqpl4 = "SELECT COUNT(e) FROM EspiritoDeEquipe e WHERE e.resposta4=:resposta";
        String jqpl5 = "SELECT COUNT(e) FROM EspiritoDeEquipe e WHERE e.resposta5=:resposta";
        String jqpl6 = "SELECT COUNT(e) FROM EspiritoDeEquipe e WHERE e.resposta6=:resposta";
        String jqpl7 = "SELECT COUNT(e) FROM EspiritoDeEquipe e WHERE e.resposta7=:resposta";
        String jqpl8 = "SELECT COUNT(e) FROM EspiritoDeEquipe e WHERE e.resposta8=:resposta";
        String jqpl9 = "SELECT COUNT(e) FROM EspiritoDeEquipe e WHERE e.resposta9=:resposta";
        String jqpl10 = "SELECT COUNT(e) FROM EspiritoDeEquipe e WHERE e.resposta10=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        TypedQuery<Long> createQuery3 = entityManager.createQuery(jqpl3, Long.class);
        TypedQuery<Long> createQuery4 = entityManager.createQuery(jqpl4, Long.class);
        TypedQuery<Long> createQuery5 = entityManager.createQuery(jqpl5, Long.class);
        TypedQuery<Long> createQuery6 = entityManager.createQuery(jqpl6, Long.class);
        TypedQuery<Long> createQuery7 = entityManager.createQuery(jqpl7, Long.class);
        TypedQuery<Long> createQuery8 = entityManager.createQuery(jqpl8, Long.class);
        TypedQuery<Long> createQuery9 = entityManager.createQuery(jqpl9, Long.class);
        TypedQuery<Long> createQuery10 = entityManager.createQuery(jqpl10, Long.class);
        createQuery.setParameter("resposta", "Discordo Totalmente");
        createQuery2.setParameter("resposta", "Discordo Totalmente");
        createQuery3.setParameter("resposta", "Discordo Totalmente");
        createQuery4.setParameter("resposta", "Discordo Totalmente");
        createQuery5.setParameter("resposta", "Discordo Totalmente");
        createQuery6.setParameter("resposta", "Discordo Totalmente");
        createQuery7.setParameter("resposta", "Discordo Totalmente");
        createQuery8.setParameter("resposta", "Discordo Totalmente");
        createQuery9.setParameter("resposta", "Discordo Totalmente");
        createQuery10.setParameter("resposta", "Discordo Totalmente");
        Long total = createQuery.getSingleResult() +
                     createQuery2.getSingleResult() +
                     createQuery3.getSingleResult() +
                     createQuery4.getSingleResult() +
                     createQuery5.getSingleResult() +
                     createQuery6.getSingleResult() +
                     createQuery7.getSingleResult() +
                     createQuery8.getSingleResult() +
                     createQuery9.getSingleResult() +
                     createQuery10.getSingleResult();
        return total;
    }
}
