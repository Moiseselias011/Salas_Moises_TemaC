
package salas_moises_temac;


public class Bache {
     private int idBache;
    private double tamanio;
    private int prioridad;
    private String estado;

    private Interseccion ubicacion;

    public Bache() {
    }

    public Bache(int idBache, double tamanio, int prioridad, String estado, Interseccion ubicacion) {
        this.idBache = idBache;
        this.tamanio = tamanio;
        this.prioridad = prioridad;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    public void reparar() {
        estado = "Reparado";
    }

}
