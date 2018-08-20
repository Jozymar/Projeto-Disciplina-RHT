package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.Formacao;
import br.edu.ifpb.cultura.organizacional.interfaces.FormacaoDao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jozimar
 */
@Stateless
public class FormacaoDaoImpl implements FormacaoDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;
    
    @Override
    public void cadastrar(Formacao formacao) {
        entityManager.persist(formacao);
    }
    
    @Override
    public Long consultarPorDiscordoTotalmente() {
        String jqpl1 = "SELECT COUNT(f) FROM Formacao f WHERE f.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(f) FROM Formacao f WHERE f.resposta2=:resposta";
        String jqpl3 = "SELECT COUNT(f) FROM Formacao f WHERE f.resposta3=:resposta";
        String jqpl4 = "SELECT COUNT(f) FROM Formacao f WHERE f.resposta4=:resposta";
        String jqpl5 = "SELECT COUNT(f) FROM Formacao f WHERE f.resposta5=:resposta";
        String jqpl6 = "SELECT COUNT(f) FROM Formacao f WHERE f.resposta6=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        TypedQuery<Long> createQuery3 = entityManager.createQuery(jqpl3, Long.class);
        TypedQuery<Long> createQuery4 = entityManager.createQuery(jqpl4, Long.class);
        TypedQuery<Long> createQuery5 = entityManager.createQuery(jqpl5, Long.class);
        TypedQuery<Long> createQuery6 = entityManager.createQuery(jqpl6, Long.class);
        createQuery.setParameter("resposta", "Discordo Totalmente");
        createQuery2.setParameter("resposta", "Discordo Totalmente");
        createQuery3.setParameter("resposta", "Discordo Totalmente");
        createQuery4.setParameter("resposta", "Discordo Totalmente");
        createQuery5.setParameter("resposta", "Discordo Totalmente");
        createQuery6.setParameter("resposta", "Discordo Totalmente");
        Long total = createQuery.getSingleResult() +
                     createQuery2.getSingleResult() +
                     createQuery3.getSingleResult() +
                     createQuery4.getSingleResult() +
                     createQuery5.getSingleResult() +
                     createQuery6.getSingleResult();
        return total;
    }
}