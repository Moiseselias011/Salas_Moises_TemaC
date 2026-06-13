import org.junit.Test;
import salas_moises_temac.Ciudadano;

public class TestDelay {

    @Test(timeout = 30)
    public void testDelay() {

        Ciudadano ciudadano = new Ciudadano();

        ciudadano.delay(45);
    }
}