package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.PoliticaEEconomia;

/**
 *
 * @author jozimar
 */
public interface PoliticaEEconomiaDao {
    
    public void cadastrar(PoliticaEEconomia politicaEEconomia);
    
    public Long consultarPorDiscordoTotalmente();
}
