package PatronState;

public class Main {
    public static void main(String[] args) {
        Auto autoLucas = new Auto(100.0);
        autoLucas.acelerar();
        System.out.println(autoLucas.getVelocidad());
        autoLucas.acelerar();
        autoLucas.acelerar();
        autoLucas.acelerar();
        autoLucas.acelerar();
        System.out.println(autoLucas.getVelocidad());
        System.out.println("---EMPIEZO A FRENAR---");
        autoLucas.frenar();
        autoLucas.frenar();
        System.out.println(autoLucas.getVelocidad());
        System.out.println("---INTENTO APAGAR MI AUTO---");
        autoLucas.contacto();
        autoLucas.frenar();
        autoLucas.frenar();
        autoLucas.frenar();
        autoLucas.frenar();
        System.out.println("---EL AUTO NO ESTA MARCHA ---");
        autoLucas.contacto();
    }
}
