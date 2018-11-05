package br.com.senaijandira.alunos;

import java.util.List;

import br.com.senaijandira.alunos.model.Aluno;

/**
 * Created by 17259230 on 29/10/2018.
 */

public interface MainView {

    void exibirBarraProgresso();
    void esconderBarraProgresso();
    void preencherLista(List<Aluno> lstAulnos);


}
