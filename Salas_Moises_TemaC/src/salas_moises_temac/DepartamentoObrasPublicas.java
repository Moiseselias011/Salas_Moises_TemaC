
package salas_moises_temac;

import java.util.ArrayList;

public class DepartamentoObrasPublicas {

    private ArrayList<Ciudadano> ciudadanos;
    private ArrayList<InformeRotura> informes;
    private ArrayList<PedidoObra> pedidos;
    private ArrayList<Brigada> brigadas;

    public DepartamentoObrasPublicas() {
        ciudadanos = new ArrayList<>();
        informes = new ArrayList<>();
        pedidos = new ArrayList<>();
        brigadas = new ArrayList<>();
    }

    public void registrarCiudadano(Ciudadano c) {
        ciudadanos.add(c);
    }

    public void informesPorCiudadano() {
    }

    public void informesSinPedidos() {
    }

    public void informeBrigadasOciosas() {
    }

    public void pedidosPorBrigada() {
    }

    public void bachesSinReparar() {
    }

    public void trabajadoresPorBrigada() {
    }

}