package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.Saude;

/**
 *
 * @author jozimar
 */
public interface SaudeDao {
    
    public void cadastrar(Saude saude);
    
    public Long consultarPorDiscordoTotalmente();
}
