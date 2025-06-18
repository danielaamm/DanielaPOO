public class Coche extends Vehiculo{
    private int numPuertas;

    //Constructor
    public Coche(String placa, String modelo, int numPuertas) {
        super(placa, modelo);
        this.numPuertas = numPuertas;
    }

    //Getters y setters
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
