
package salas_moises_temac;


public class Trabajador {
 

    private int idTrabajador;
    private String nombre;
    private String puesto;
    private boolean libre;

    public Trabajador() {
    }

    public Trabajador(int idTrabajador, String nombre, String puesto, boolean libre) {
        this.idTrabajador = idTrabajador;
        this.nombre = nombre;
        this.puesto = puesto;
        this.libre = libre;
    }

    public void ocupar() {
        libre = false;
    }

    public void liberar() {
        libre = true;
    }

} 

