public class MovimientoDinero {
    private int monto;
    private String Concepto;
    private String usuario;

    public MovimientoDinero(int monto, String concepto, String usuario) {
        this.monto = monto;
        Concepto = concepto;
        this.usuario = usuario;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return Concepto;
    }

    public void setConcepto(String concepto) {
        Concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
