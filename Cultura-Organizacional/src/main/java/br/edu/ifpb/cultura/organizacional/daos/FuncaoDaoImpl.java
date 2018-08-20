package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.Funcao;
import br.edu.ifpb.cultura.organizacional.interfaces.FuncaoDao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jozimar
 */
@Stateless
public class FuncaoDaoImpl implements FuncaoDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;
    
    @Override
    public void cadastrar(Funcao funcao) {
        entityManager.persist(funcao);
    }
    
    @Override
    public Long consultarPorDiscordoTotalmente() {
        String jqpl1 = "SELECT COUNT(f) FROM Funcao f WHERE f.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(f) FROM Funcao f WHERE f.resposta2=:resposta";
        String jqpl3 = "SELECT COUNT(f) FROM Funcao f WHERE f.resposta3=:resposta";
        String jqpl4 = "SELECT COUNT(f) FROM Funcao f WHERE f.resposta4=:resposta";
        TypedQuery<Long> createQuery = entityManager.createQuery(jqpl1, Long.class);
        TypedQuery<Long> createQuery2 = entityManager.createQuery(jqpl2, Long.class);
        TypedQuery<Long> createQuery3 = entityManager.createQuery(jqpl3, Long.class);
        TypedQuery<Long> createQuery4 = entityManager.createQuery(jqpl4, Long.class);
        createQuery.setParameter("resposta", "Discordo Totalmente");
        createQuery2.setParameter("resposta", "Discordo Totalmente");
        createQuery3.setParameter("resposta", "Discordo Totalmente");
        createQuery4.setParameter("resposta", "Discordo Totalmente");
        Long total = createQuery.getSingleResult() +
                     createQuery2.getSingleResult() +
                     createQuery3.getSingleResult() +
                     createQuery4.getSingleResult();
        return total;
    }
}
