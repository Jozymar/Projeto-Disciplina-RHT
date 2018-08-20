package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.Usuario;

/**
 *
 * @author jozimar
 */
public interface UsuarioDao {
    
    public void cadastrar(Usuario usuario);

    public Usuario consultarPorEmail(String email);

    public Usuario consultarPorNome(String nome);

    public Usuario autenticarUsuario(String email, String senha);

    public void atualizarUsuario(Usuario novoEstado);
}
