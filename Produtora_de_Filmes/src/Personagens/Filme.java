package Personagens;

import java.util.ArrayList;
import java.util.List;

public class Filme implements FilmeInterface{
    private String nomeFilme;
    private int anoLancamento;
    private List<Empregado> Diretores = new ArrayList<>();
    private List<Empregado> Roteiristas = new ArrayList<>();
    private List<Empregado> Produtores = new ArrayList<>();
    private List<Empregado> Atores = new ArrayList<>();
    private List<Empregado> Cinegrafista = new ArrayList<>();

    public Filme(String nomeFilme, int anoLancamento){
        this.nomeFilme = nomeFilme;
        this.anoLancamento = anoLancamento;
    }

    public Filme(){

    }

    public void addDiretor(Empregado diretor){
        Diretores.add(diretor);
    }

    public void addRoteirista(Empregado roteirista){
        Roteiristas.add(roteirista);
    }
    public void addProdutor(Empregado produtor){
        Produtores.add(produtor);
    }
    public void addAtor(Empregado ator){
        Atores.add(ator);
    }
    public void addCinegrafista(Empregado cinegrafista){
        Cinegrafista.add(cinegrafista);
    }

    @Override
    public String caracteristicasFilme() {
        return null;
    }
}
