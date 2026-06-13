
package salas_moises_temac;

public class Ciudadano {




    private int idCiudadano;
    private String nombre;
    private String email;
    private int password;

    public Ciudadano() {
    }

    public Ciudadano(int idCiudadano, String nombre, String email, int password) {
        this.idCiudadano = idCiudadano;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public boolean validarIngreso(int psw) {
        return this.password == psw;
    }

    public void cambioPassword(String newPass) {
        this.password = Integer.parseInt(newPass);
    }

    public void delay(int mili) {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos");
        }
    }

    public boolean ciudadanosDiferentes(Ciudadano c2) {
        return !this.equals(c2);
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

}

