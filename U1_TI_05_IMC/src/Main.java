import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        double imc;
        String clasificacion;
        Persona persona = new Persona();
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Ingresa tu nombre: ");
        persona.setNombre(scanner.next());
        System.out.print("Ingresa tu altura: ");
        persona.setAltura(scanner.nextDouble());
        System.out.print("Ingresa tu peso: ");
        persona.setPeso(scanner.nextDouble());
        imc = persona.calcularIMC();
        clasificacion= persona.clasificarIMC(imc);

        System.out.println("El IMC es: " + df.format(imc));
        System.out.println(clasificacion);
        scanner.close();
    }
}