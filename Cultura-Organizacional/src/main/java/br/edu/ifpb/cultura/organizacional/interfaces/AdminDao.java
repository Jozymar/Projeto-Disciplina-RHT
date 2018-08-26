package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.Admin;

/**
 *
 * @author jozimar
 */
public interface AdminDao {
    
    public void cadastrar(Admin admin);

    public Admin consultarPorEmail(String email);

    public Admin consultarPorNome(String nome);

    public Admin autenticarAdmin(String email, String senha);

    public void atualizarAdmin(Admin novoEstado);
}
