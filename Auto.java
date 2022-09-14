package PatronState;

public class Auto {
    private AutoState estadoActual;
    private Integer combustible;
    private Double velocidad;

    public Auto(Integer combustible) {
        this.combustible = combustible;
    }
    public void setEstadoActual(AutoState estadoActual) {
        this.estadoActual = estadoActual;
    }
    public void setCombustible(Integer combustible) {
        this.combustible = combustible;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public AutoState getEstadoActual() {
        return estadoActual;
    }

    public Integer getCombustible() {
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
