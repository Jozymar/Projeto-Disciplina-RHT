package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.Admin;
import br.edu.ifpb.cultura.organizacional.interfaces.AdminDao;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jozimar
 */
@Stateless
public class AdminDaoImpl implements  AdminDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;
    
    @Override
    public void cadastrar(Admin admin) {
        entityManager.persist(admin);
    }

    @Override
    public Admin consultarPorEmail(String email) {
        TypedQuery<Admin> query = entityManager
                .createQuery("SELECT a FROM Admin a "
                        + "WHERE a.email=:email", Admin.class);
        query.setParameter("email", email);
        Optional<Admin> admin = query.getResultList().stream().findFirst();
        if (admin.isPresent()) {
            return admin.get();
        } else {
            return null;
        }
    }

    @Override
    public Admin consultarPorNome(String nome) {
        TypedQuery<Admin> query = entityManager
                .createQuery("SELECT a FROM Admin a "
                        + "WHERE a.nome=:nome", Admin.class);
        query.setParameter("nome", nome);
        Optional<Admin> admin = query.getResultList().stream().findFirst();
        if (admin.isPresent()) {
            return admin.get();
        } else {
            return null;
        }
    }

    @Override
    public Admin autenticarAdmin(String email, String senha) {
        TypedQuery<Admin> query = entityManager
                .createQuery("SELECT a FROM Admin a WHERE a.email=:email "
                        + "AND a.senha=:senha", Admin.class);
        query.setParameter("email", email);
        query.setParameter("senha", senha);
        Optional<Admin> admin = query.getResultList().stream().findFirst();
        if (admin.isPresent()) {
            return admin.get();
        } else {
            return null;
        }

    }

    @Override
    public void atualizarAdmin(Admin novoEstado) {
        entityManager.merge(novoEstado);
    }
}
