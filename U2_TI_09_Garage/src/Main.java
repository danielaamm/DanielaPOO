//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Garage g = new Garage(4);
        Vehiculo v1 = new Coche("ABC01", "Toyata", 4);
        Vehiculo v2 = new Motocicleta("DEF02", "Honda", true);
        Vehiculo v3 = new Coche("GHI03", "Tesla", 4);
        Vehiculo v4 = new Motocicleta("JKL04", "Ferrari", false);

        g.estacionar(v1);
        g.estacionar(v2);
        g.estacionar(v3);
        g.estacionar(v4);
        g.retirar("ABC0111");
        g.retirar("ABC01");

        System.out.println("Vehiculos en el garage: " + g.contarVehiculos());

    }
}