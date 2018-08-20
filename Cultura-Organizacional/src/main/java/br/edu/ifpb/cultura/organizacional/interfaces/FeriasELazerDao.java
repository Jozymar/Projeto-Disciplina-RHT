package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.FeriasELazer;

/**
 *
 * @author jozimar
 */
public interface FeriasELazerDao {
    
    public void cadastrar(FeriasELazer feriasELazer);
    
    public Long consultarPorDiscordoTotalmente();
}
