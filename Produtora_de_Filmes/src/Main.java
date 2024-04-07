import Personagens.Papel;
import Personagens.Pessoa;
import Personagens.Filme;
import Personagens.Empregado;

public class Main {
    public static void main(String[] args) {

        Filme scottPilgrim = new Filme("Scott Pilgrim contra o mundo", 2010);
        Empregado Michael_Cera = new Empregado("Michael Cera", "123.456.789-0");

        Michael_Cera.addPapel(Papel.ATOR);
        Michael_Cera.addFilme(scottPilgrim);
        scottPilgrim.addAtor(Michael_Cera);

        Michael_Cera.Filmografia();

    }
}