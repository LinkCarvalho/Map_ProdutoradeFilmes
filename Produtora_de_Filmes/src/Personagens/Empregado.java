package Personagens;

import java.util.ArrayList;
import java.util.List;

public class Empregado extends Pessoa implements EmpregadoInterface{

    List<String> Papeis  = new ArrayList<>();
    List<Filme> Filmografia = new ArrayList<>();

    public Empregado(String nome, String CPF) {
        super(nome, CPF);
    }


    public Empregado() {
    }

    public void addFilme(Filme filme){
        Filmografia.add(filme);
    }

    @Override
    public void filmografia() {
        for (Filme filme : Filmografia) {
            System.out.println("Filme: " + filme.getNomeFilme());

            if (Papeis.contains(Papel.ATOR) && filme.getAtores().contains(this)) {
                System.out.println("\"" + this.getNome() + "\" foi Ator/Atriz");
            }
            if (Papeis.contains(Papel.DIRETOR_DE_FILME) && filme.getDiretores().contains(this)) {
                System.out.println("\"" + this.getNome() + "\" foi Diretor(a) do Filme");
            }
            if (Papeis.contains(Papel.CINEGRAFISTA) && filme.getCinegrafista().contains(this)) {
                System.out.println("\"" + this.getNome() + "\" foi Cameraman");
            }
            if (Papeis.contains(Papel.ROTEIRISTA) && filme.getRoteiristas().contains(this)) {
                System.out.println("\"" + this.getNome() + "\" foi Roteirista");
            }
            if (Papeis.contains(Papel.PRODUTOR) && filme.getProdutores().contains(this)) {
                System.out.println("\"" + this.getNome() + "\" foi Produtor(a)");
            }
        }
    }


    public void addPapel(String papel) {
        if (Papeis.contains(papel)) {
            System.out.println("O empregado já exerce esta função");
        }else if (papel.equals(Papel.CINEGRAFISTA) && Papeis.contains(Papel.ATOR)) {
            System.out.println("Não é possivel atuar e manusear a camera ao mesmo tempo");
        }else{
            Papeis.add(papel);
        }
    }

    public List<String> getPapeis() {
        return Papeis;
    }

    public List<Filme> getFilmografia() {
        return Filmografia;
    }
}
