
package salas_moises_temac;
import java.time.LocalDate;

public class InformeRotura {

    private int codInf;
    private LocalDate fechaInforme;
    private String problema;
    private int codigoUrgencia;

    private Ciudadano ciudadano;
    private Bache bache;
    private PedidoObra pedido;

    public InformeRotura() {
    }

    public InformeRotura(int codInf, LocalDate fechaInforme, String problema, int codigoUrgencia) {
        this.codInf = codInf;
        this.fechaInforme = fechaInforme;
        this.problema = problema;
        this.codigoUrgencia = codigoUrgencia;
    }

}