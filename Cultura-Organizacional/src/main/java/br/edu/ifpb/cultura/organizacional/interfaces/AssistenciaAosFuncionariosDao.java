package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.AssistenciaAosFuncionarios;

/**
 *
 * @author jozimar
 */
public interface AssistenciaAosFuncionariosDao {

    public void cadastrar(AssistenciaAosFuncionarios assistenciaAosFuncionarios);

    public Long consultarPorDiscordoTotalmente();

    public Long consultarPorDiscordoModeradamente();

    public Long consultarPorNaoConcordoNemDiscordo();

    public Long consultarPorConcordoModeradamente();

    public Long consultarPorConcordoTotalmente();
}
