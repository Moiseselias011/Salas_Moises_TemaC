
package salas_moises_temac;


import java.util.ArrayList;

public class Brigada {

    private int numero;
    private String nombre;
    private String equipamiento;
    private String materiales;

    private JefeBrigada jefe;
    private ArrayList<Trabajador> trabajadores;

    public Brigada() {
        trabajadores = new ArrayList<>();
    }

    public Brigada(int numero, String nombre, String equipamiento, String materiales) {
        this.numero = numero;
        this.nombre = nombre;
        this.equipamiento = equipamiento;
        this.materiales = materiales;
        trabajadores = new ArrayList<>();
    }

    public void addTrabajador(Trabajador t) {
        trabajadores.add(t);
    }

    public void liberarBrigada() {
        for (Trabajador t : trabajadores) {
            t.liberar();
        }
    }
}
