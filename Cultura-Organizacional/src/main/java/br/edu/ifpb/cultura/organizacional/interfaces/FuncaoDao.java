package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.Funcao;

/**
 *
 * @author jozimar
 */
public interface FuncaoDao {
    
    public void cadastrar(Funcao funcao);
    
    public Long consultarPorDiscordoTotalmente();
}
