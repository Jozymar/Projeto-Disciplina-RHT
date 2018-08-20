package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.InvestimentoEDespesasFamiliares;
import br.edu.ifpb.cultura.organizacional.interfaces.InvestimentoEDespesasFamiliaresDao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jozimar
 */
@Stateless
public class InvestimentoEDespesasFamiliaresDaoImpl implements InvestimentoEDespesasFamiliaresDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;
    
    @Override
    public void cadastrar(InvestimentoEDespesasFamiliares investimentoEDespesasFamiliares) {
        entityManager.persist(investimentoEDespesasFamiliares);
    }
    
    @Override
    public Long consultarPorDiscordoTotalmente() {
        String jqpl1 = "SELECT COUNT(i) FROM InvestimentoEDespesasFamiliares i WHERE i.resposta1=:resposta";
        String jqpl2 = "SELECT COUNT(i) FROM InvestimentoEDespesasFamiliares i WHERE i.resposta2=:resposta";
        String jqpl3 = "SELECT COUNT(i) FROM InvestimentoEDespesasFamiliares i WHERE i.resposta3=:resposta";
        String jqpl4 = "SELECT COUNT(i) FROM InvestimentoEDespesasFamiliares i WHERE i.resposta4=:resposta";
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
