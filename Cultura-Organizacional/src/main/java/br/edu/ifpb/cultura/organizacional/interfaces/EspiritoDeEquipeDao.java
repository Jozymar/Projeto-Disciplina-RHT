package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.EspiritoDeEquipe;

/**
 *
 * @author jozimar
 */
public interface EspiritoDeEquipeDao {
    
    public void cadastrar(EspiritoDeEquipe espiritoDeEquipe);
    
    public Long consultarPorDiscordoTotalmente();
}
