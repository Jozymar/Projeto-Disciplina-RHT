package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.RedesSociais;

/**
 *
 * @author jozimar
 */
public interface RedesSociaisDao {
    
    public void cadastrar(RedesSociais redesSociais);
    
    public Long consultarPorDiscordoTotalmente();
}
