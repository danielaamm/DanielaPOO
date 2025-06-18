public class EmpleadoPorHoras extends Empleado{
    private int horasTrabajadas;

    //Constructor que acepta los 3 del padre + horasTrabajadas
    public EmpleadoPorHoras(String id, String nombre, double salarioBase, int horastrabajadas) {
        super(id, nombre, salarioBase);
        this.horasTrabajadas = horastrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    //Salariobase * horastrabajadas
    @Override
    public double calcularSalario() {
        return getSalarioBase()*horasTrabajadas;
    }
}
