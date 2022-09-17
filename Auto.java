package PatronState;

public class Auto {
    private AutoState estadoActual;
    private Double combustible;
    private Double velocidad;

    public Auto(Double combustible) {
        this.combustible = combustible;
        this.estadoActual = new Parado(this);
    }
    public void setEstadoActual(AutoState estadoActual) {
        this.estadoActual = estadoActual;
    }
    public void setCombustible(Double combustible) {
        this.combustible = combustible;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public AutoState getEstadoActual() {
        return estadoActual;
    }

    public Double getCombustible() {
        return combustible;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void acelerar(){
        this.estadoActual.acelerar();
    }
    public void contacto(){
        this.estadoActual.contacto();
    }
    public void frenar(){
        this.estadoActual.frenar();
    }
}
