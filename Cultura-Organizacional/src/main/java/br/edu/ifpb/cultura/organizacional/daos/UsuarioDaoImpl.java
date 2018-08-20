package br.edu.ifpb.cultura.organizacional.daos;

import br.edu.ifpb.cultura.organizacional.entidades.Usuario;
import br.edu.ifpb.cultura.organizacional.interfaces.UsuarioDao;
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
public class UsuarioDaoImpl implements UsuarioDao {

    @PersistenceContext(unitName = "persistencia")
    EntityManager entityManager;
    
    @Override
    public void cadastrar(Usuario usuario) {
        entityManager.persist(usuario);
    }

    @Override
    public Usuario consultarPorEmail(String email) {
        TypedQuery<Usuario> query = entityManager
                .createQuery("SELECT usuario FROM Usuario usuario "
                        + "WHERE usuario.email=:email", Usuario.class);
        query.setParameter("email", email);
        Optional<Usuario> usuario = query.getResultList().stream().findFirst();
        if (usuario.isPresent()) {
            return usuario.get();
        } else {
            return null;
        }
    }

    @Override
    public Usuario consultarPorNome(String nome) {
        TypedQuery<Usuario> query = entityManager
                .createQuery("SELECT usuario FROM Usuario usuario "
                        + "WHERE usuario.nome=:nome", Usuario.class);
        query.setParameter("nome", nome);
        Optional<Usuario> usuario = query.getResultList().stream().findFirst();
        if (usuario.isPresent()) {
            return usuario.get();
        } else {
            return null;
        }
    }

    @Override
    public Usuario autenticarUsuario(String email, String senha) {
        TypedQuery<Usuario> query = entityManager
                .createQuery("SELECT u FROM Usuario u WHERE u.email=:email "
                        + "AND u.senha=:senha", Usuario.class);
        query.setParameter("email", email);
        query.setParameter("senha", senha);
        Optional<Usuario> usuario = query.getResultList().stream().findFirst();
        if (usuario.isPresent()) {
            return usuario.get();
        } else {
            return null;
        }

    }

    @Override
    public void atualizarUsuario(Usuario novoEstado) {
        entityManager.merge(novoEstado);
    }
}
