package PatronState;

public class Parado implements AutoState{
    private Auto auto;

    public Parado(Auto auto) {
        this.auto = auto;
    }

    public void acelerar() {
        if(this.auto.getCombustible()>0){
            System.out.println("Acelerando..");
            this.auto.setVelocidad(1.0);
            this.auto.setEstadoActual(new EnMarcha(this.auto));
        } else {
            System.out.println("Sin combustible");
            this.auto.setEstadoActual(new SinCombustible(this.auto));
        }
    }
    public void contacto() {
        System.out.println("Auto apagado");
        this.auto.setEstadoActual(new Apagado(this.auto));
    }
    public void frenar() {
        System.out.println("El auto esta parado. No se puede frenar");
    }
}
