package PatronState;

public class EnMarcha implements AutoState{
    private Auto auto;

    public EnMarcha(Auto auto) {
        this.auto = auto;
    }
    @Override
    public void acelerar() {
        this.auto.setVelocidad(this.auto.getVelocidad()+1.0);
        System.out.println("Acelerando...");
    }
    @Override
    public void contacto() {
        System.out.println("No se puede apagar el auto hasta que se reduzca la velocidad a 0");
    }
    @Override
    public void frenar() {
        if (auto.getVelocidad()<= 0.0){
        this.auto.setEstadoActual(new Parado(this.auto));
            System.out.println("Auto parado");
        }else {
            System.out.println("Frenando...");
            this.auto.setVelocidad(this.auto.getVelocidad()-1.0);
        }
    }
}
