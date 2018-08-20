package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.VidaSocial;

/**
 *
 * @author jozimar
 */
public interface VidaSocialDao {
    
    public void cadastrar(VidaSocial vidaSocial);
    
    public Long consultarPorDiscordoTotalmente();
}
