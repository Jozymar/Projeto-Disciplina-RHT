package br.edu.ifpb.cultura.organizacional.interfaces;

import br.edu.ifpb.cultura.organizacional.entidades.CondicoesDeTrabalho;

/**
 *
 * @author jozimar
 */
public interface CondicoesDeTrabalhoDao {

    public void cadastrar(CondicoesDeTrabalho condicoesDeTrabalho);

    public Long consultarPorDiscordoTotalmente();

    public Long consultarPorDiscordoModeradamente();

    public Long consultarPorNaoConcordoNemDiscordo();

    public Long consultarPorConcordoModeradamente();

    public Long consultarPorConcordoTotalmente();
}
