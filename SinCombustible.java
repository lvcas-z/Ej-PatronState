package PatronState;

public class SinCombustible implements AutoState{
    private Auto auto;

    public SinCombustible(Auto auto) {
        this.auto = auto;
    }

    public void acelerar() {
        System.out.println("No se puede acelerar no hay combustible");
    }
    public void contacto() {
        System.out.println("No se puede encender no hay combustible");
    }

    public void frenar() {
        System.out.println("No se frenar. El auto no esta en marcha");
    }
}
