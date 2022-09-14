package PatronState;

public class EnMarcha implements AutoState{
    private Auto auto;

    public EnMarcha(Auto auto) {
        this.auto = auto;
    }

    public void acelerar() {
        this.auto.setVelocidad(this.auto.getVelocidad()+0.1);
        System.out.println("Acelerando...");
    }

    public void contacto() {
        System.out.println("No se puede apagar el auto hasta que se reduzca la velocidad a 0");
    }


    public void frenar() {
        this.auto.setVelocidad(this.auto.getVelocidad()-0.1);
        System.out.println("Frenando...");
    }
}
