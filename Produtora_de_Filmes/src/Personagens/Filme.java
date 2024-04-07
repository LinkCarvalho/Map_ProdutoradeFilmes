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
        String caracteristicas = "";
        caracteristicas += "Filme: " + nomeFilme + "\n";
        caracteristicas += "Ano de Lançamento: " + anoLancamento + "\n";

        caracteristicas += "Diretores: ";
        for (Empregado diretor : Diretores) {
            caracteristicas += diretor.getNome() + ", ";
        }
        caracteristicas += "\n";

        caracteristicas += "Roteiristas: ";
        for (Empregado roteirista : Roteiristas) {
            caracteristicas += roteirista.getNome() + ", ";
        }
        caracteristicas += "\n";

        caracteristicas += "Produtores: ";
        for (Empregado produtor : Produtores) {
            caracteristicas += produtor.getNome() + ", ";
        }
        caracteristicas += "\n";

        caracteristicas += "Atores: ";
        for (Empregado ator : Atores) {
            caracteristicas += ator.getNome() + ", ";
        }
        caracteristicas += "\n";

        caracteristicas += "Cinegrafistas: ";
        for (Empregado cinegrafista : Cinegrafista) {
            caracteristicas += cinegrafista.getNome() + ", ";
        }
        caracteristicas += "\n";

        return caracteristicas;
    }


    public String getNomeFilme() {
        return nomeFilme;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public List<Empregado> getDiretores() {
        return Diretores;
    }

    public List<Empregado> getRoteiristas() {
        return Roteiristas;
    }

    public List<Empregado> getProdutores() {
        return Produtores;
    }

    public List<Empregado> getAtores() {
        return Atores;
    }

    public List<Empregado> getCinegrafista() {
        return Cinegrafista;
    }
}
