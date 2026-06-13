import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;
import salas_moises_temac.Ciudadano;

public class CiudadanoTest {

    static Ciudadano ciu;
    static int i = 1;

    @BeforeClass
    public static void antesDeTodo() {
        ciu = new Ciudadano(1, "Anonimus", "anonimus@mail.com", 1212);
        System.out.println("INGRESO de ciudadano del bien");
    }

    @AfterClass
    public static void despuesDeTodo() {
        System.out.println(LocalDate.now().minusDays(1)
                + " Baches reparados, Ciudadanos Felices");
    }

    @Before
    public void before() {
        System.out.println("----------------------");
        System.out.println("Test N° " + i++);
    }

    @After
    public void after() {
        System.out.println("----------------------");
    }

    @Test
    public void testValidarUsr() {

        boolean resultado = ciu.validarIngreso(123456);

        Assert.assertTrue(resultado);
    }

    @Test
    public void testValidarEmail() {

        String email = "test@gmail.com";

        boolean valido =
                email.contains("@")
                && email.contains(".")
                && email.length() < 20;

        Assert.assertTrue(valido);
    }

    @Test
    public void testCambioPass() {

        String newPass = "1234";

        ciu.cambioPassword(newPass);

        Assert.assertEquals(1234, ciu.getPassword());

        System.out.println("Password cambiada");
    }

    @Test
    public void testCiudadanosDiferentes() {

        Ciudadano c1 = new Ciudadano(1, "Juan", "a@a.com", 1111);
        Ciudadano c2 = new Ciudadano(2, "Pedro", "b@b.com", 2222);

        Assert.assertNotSame(c1, c2);
    }
}