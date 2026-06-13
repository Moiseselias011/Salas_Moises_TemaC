
package salas_moises_temac;


import java.time.LocalDate;

public class PedidoObra {

    private int nroPedido;
    private LocalDate fechaCreacion;
    private LocalDate fechaReparacion;
    private String observaciones;

    private Brigada brigada;
    private Interseccion ubicacion;

    public PedidoObra() {
    }

    public PedidoObra(int nroPedido, LocalDate fechaCreacion) {
        this.nroPedido = nroPedido;
        this.fechaCreacion = fechaCreacion;
    }

    public void finalizarObra() {
        fechaReparacion = LocalDate.now();
    }
}
