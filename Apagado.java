package PatronState;

public class Apagado implements AutoState{
    private Auto auto;

    public Apagado(Auto auto) {
        this.auto = auto;
    }
    public void acelerar() {
        System.out.println("No se puede acelerar");
    }
    public void contacto() {
        System.out.println("Encediste el auto");
        this.auto.setEstadoActual(new Parado(this.auto));
    }
    public void frenar() {
        System.out.println("El vehiculo esta apagado. No se puede frenar");
    }
}
