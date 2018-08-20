package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.Lideranca;

/**
 *
 * @author jozimar
 */
public interface LiderancaDao {

    public void cadastrar(Lideranca lideranca);

    public Long consultarPorDiscordoTotalmente();
}
