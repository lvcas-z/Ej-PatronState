package PatronState;

public class SinCombustible implements AutoState{
    private Auto auto;

    public SinCombustible(Auto auto) {
        this.auto = auto;
    }
    @Override
    public void acelerar() {
        System.out.println("No se puede acelerar no hay combustible");
    }
    @Override
    public void contacto() {
        System.out.println("No se puede encender no hay combustible");
    }
    @Override
    public void frenar() {
        System.out.println("No se puede frenar. El auto no tiene combustible");
    }
}
