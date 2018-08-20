package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.ConvivenciaFamiliar;

/**
 *
 * @author jozimar
 */
public interface ConvivenciaFamiliarDao {
    
    public void cadastrar(ConvivenciaFamiliar convivenciaFamiliar);
    
    public Long consultarPorDiscordoTotalmente();
}
