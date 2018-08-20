package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.Estrategia;

/**
 *
 * @author jozimar
 */
public interface EstrategiaDao {
    
    public void cadastrar(Estrategia estrategia);
    
    public Long consultarPorDiscordoTotalmente();
}
