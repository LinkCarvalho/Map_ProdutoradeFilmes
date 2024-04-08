package Personagens;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class EmpregadoTest {

    private Empregado empregadoJoao;
    private Empregado empregadoMaria;
    private Empregado empregadoCarlos;
    private Filme filmeInterstellar;
    private Filme filmeAvatar;

    @Before
    public void setUp() {
        empregadoJoao = new Empregado("João", "12345678900");
        empregadoMaria = new Empregado("Maria", "98765432100");
        empregadoCarlos = new Empregado("Carlos", "55544433322");
        filmeInterstellar = new Filme("Interstellar", 2014);
        filmeAvatar = new Filme("Avatar", 2009);
    }

    @Test
    public void testAddFilme() {
        empregadoJoao.addFilme(filmeInterstellar);
        assertTrue(empregadoJoao.getFilmografia().contains(filmeInterstellar));
    }

    @Test
    public void testFilmografia() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        empregadoMaria.addFilme(filmeAvatar);
        empregadoMaria.addPapel(Papel.ATOR);
        empregadoMaria.filmografia();

        String expectedOutput = "Filme: Avatar\n\"Maria\" foi Ator\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testAddPapel() {
        empregadoCarlos.addPapel(Papel.ATOR);
        assertTrue(empregadoCarlos.getPapeis().contains(Papel.ATOR));
    }

    @Test

    public void testAddPapelExistente() {
        // Adicionar um papel duas vezes deve mostrar uma mensagem de erro
        empregadoCarlos.addPapel(Papel.ATOR);
        empregadoCarlos.addPapel(Papel.ATOR);
        // Verificar se a mensagem de erro foi impressa no console
        }

}
