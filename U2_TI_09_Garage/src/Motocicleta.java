public class Motocicleta extends Vehiculo{
    private boolean tieneCaja;

    //Constructor
    public Motocicleta(String placa, String modelo, boolean tieneCaja) {
        super(placa, modelo);
        this.tieneCaja = tieneCaja;
    }

    //Getters y setters
    public boolean isTieneCaja() {
        return tieneCaja;
    }
    public void setTieneCaja(boolean tieneCaja) {
        this.tieneCaja = tieneCaja;
    }
}
