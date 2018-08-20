package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.Remuneracao;

/**
 *
 * @author jozimar
 */
public interface RemuneracaoDao {
    
    public void cadastrar(Remuneracao remuneracao);
    
    public Long consultarPorDiscordoTotalmente();
}
