package Personagens;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilmeTest {

    private Filme filmeMatrix;
    private Filme filmeTitanic;
    private Filme filmeInception;
    private Empregado diretorMatrix;
    private Empregado diretorTitanic;
    private Empregado roteiristaTitanic;
    private Empregado atorTitanic;
    private Empregado cinegrafistaInception;

    @Before
    public void setUp() {
        filmeMatrix = new Filme("Matrix", 1999);
        filmeTitanic = new Filme("Titanic", 1997);
        filmeInception = new Filme("Inception", 2010);

        diretorMatrix = new Empregado("Lana Wachowski", "123456789");
        diretorTitanic = new Empregado("James Cameron", "987654321");
        roteiristaTitanic = new Empregado("James Cameron", "987654321");
        atorTitanic = new Empregado("Leonardo DiCaprio", "123456789");
        cinegrafistaInception = new Empregado("Wally Pfister", "555666777");
    }

    @Test
    public void testAddDiretor() {
        filmeMatrix.addDiretor(diretorMatrix);
        assertTrue(filmeMatrix.getDiretores().contains(diretorMatrix));
    }

    @Test
    public void testCaracteristicasFilme() {
        filmeTitanic.addDiretor(diretorTitanic);
        filmeTitanic.addRoteirista(roteiristaTitanic);
        filmeTitanic.addAtor(atorTitanic);

        String expectedCaracteristicas = "Filme: Titanic\n" +
                "Ano de Lançamento: 1997\n" +
                "Diretores: James Cameron, \n" +
                "Roteiristas: James Cameron, \n" +
                "Produtores: \n" +
                "Atores: Leonardo DiCaprio, \n" +
                "Cinegrafistas: \n";
        assertEquals(expectedCaracteristicas, filmeTitanic.caracteristicasFilme());
    }

    @Test
    public void testAddCinegrafista() {
        filmeInception.addCinegrafista(cinegrafistaInception);
        assertTrue(filmeInception.getCinegrafista().contains(cinegrafistaInception));
    }
}
