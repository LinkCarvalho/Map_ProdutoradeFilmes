import Personagens.Papel;
import Personagens.Filme;
import Personagens.Empregado;

public class Main {
    public static void main(String[] args) {

        Filme scottPilgrim = new Filme("Scott Pilgrim contra o mundo", 2010);
        Empregado Edgar_Wright = new Empregado("Edgar Wright", "112.233.445-5");
        Empregado Bryan_Lee = new Empregado("Bryan Lee", "777.777.777-7");
        Empregado Michael_Bacall = new Empregado("Michael Bacall", "000.000.000-8");
        Empregado Michael_Cera = new Empregado("Michael Cera", "123.456.789-0");
        Empregado Mary_Elizabeth = new Empregado("Mary Elizabeth Winstead", "981.840.552-3");
        Empregado Ellen_Wong = new Empregado("Ellen Wong", "101.010.101-0");
        Empregado Bill_Pope = new Empregado("Bill Pope", "800.828.008-2");

        //filmes para a filmografia de um ator
        Filme barbie = new Filme("Barbie", 2023);
        Filme superbad = new Filme("Superbad", 2007);

        //Adicionando Diretores, Produtores e Roteiristas
        Edgar_Wright.addPapel(Papel.DIRETOR_DE_FILME);
        Edgar_Wright.addPapel(Papel.PRODUTOR);
        Edgar_Wright.addPapel(Papel.ROTEIRISTA);
        Edgar_Wright.addFilme(scottPilgrim);
        scottPilgrim.addDiretor(Edgar_Wright);
        scottPilgrim.addProdutor(Edgar_Wright);
        scottPilgrim.addRoteirista(Edgar_Wright);

        Bryan_Lee.addPapel(Papel.PRODUTOR);
        Bryan_Lee.addPapel(Papel.ROTEIRISTA);
        scottPilgrim.addProdutor(Bryan_Lee);
        scottPilgrim.addRoteirista(Bryan_Lee);

        Michael_Bacall.addPapel(Papel.ROTEIRISTA);
        scottPilgrim.addRoteirista(Michael_Bacall);

        // adicionando atores
        Michael_Cera.addPapel(Papel.ATOR);
        Michael_Cera.addPapel(Papel.ROTEIRISTA);
        Michael_Cera.addFilme(scottPilgrim);
        scottPilgrim.addAtor(Michael_Cera);
        scottPilgrim.addRoteirista(Michael_Cera);

        barbie.addAtor(Michael_Cera);
        superbad.addAtor(Michael_Cera);
        Michael_Cera.addFilme(barbie);
        Michael_Cera.addFilme(superbad);

        Mary_Elizabeth.addPapel(Papel.ATOR);
        Mary_Elizabeth.addPapel(Papel.PRODUTOR);
        Mary_Elizabeth.addFilme(scottPilgrim);
        scottPilgrim.addAtor(Mary_Elizabeth);
        scottPilgrim.addProdutor(Mary_Elizabeth);

        Ellen_Wong.addPapel(Papel.ATOR);
        Ellen_Wong.addFilme(scottPilgrim);
        scottPilgrim.addAtor(Ellen_Wong);


        // adicionando Cameraman
        Bill_Pope.addPapel(Papel.CINEGRAFISTA);
        Bill_Pope.addFilme(scottPilgrim);
        scottPilgrim.addCinegrafista(Bill_Pope);

        //filmografia do diretor principal e do ator principal
        Edgar_Wright.filmografia();
        System.out.println(" ");
        Michael_Cera.filmografia();

        //Creditos do filme principal
        System.out.println("Credítos");
        System.out.println(scottPilgrim.caracteristicasFilme());

    }
}