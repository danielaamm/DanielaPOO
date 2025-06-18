public class Main {
    public static void main(String[] args) {

        //Objetos
        Empleado empleadoTiempocompleto = new EmpleadoTiempoCompleto("EMP-01","Daniela Araujo",1500, "Bonus para fin de año");
        Empleado empleadoPorhoras = new EmpleadoPorHoras("EMP-02", "Daniela Muñoz", 1500, 15);

        System.out.println("Empleado Tiempo completo");
        System.out.println("ID: " + empleadoTiempocompleto.getId());
        System.out.println("Nombre: " + empleadoTiempocompleto.getNombre());
        System.out.println("Beneficios: " + ((EmpleadoTiempoCompleto) empleadoTiempocompleto).getBeneficios());
        System.out.println("Salario: " + empleadoTiempocompleto.calcularSalario());
        System.out.println("---------------------------------------------");
        System.out.println("Empleado Por horas");
        System.out.println("ID: " + empleadoPorhoras.getId());
        System.out.println("Nombre: " + empleadoPorhoras.getNombre());
        System.out.println("Salario: " + empleadoPorhoras.calcularSalario());
    }
}