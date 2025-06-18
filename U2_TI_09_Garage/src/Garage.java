public class Garage{

    //Arreglo
    private Vehiculo[] espacios;

    //Constructor que recibe numero de espacios
    public Garage(int numEspacios) {
     espacios = new Vehiculo[numEspacios];
    }

    //Metodos
    public boolean estacionar(Vehiculo v) {
        for (int i = 0; i < espacios.length; i++){
            if (espacios[i]==null){
                espacios[i]=v;
                return true;
            }
        }
        return false;
    }

    public boolean retirar(String placa) {
        for (int i = 0; i < espacios.length; i++){
            if (espacios[i].getPlaca().equals(placa)){
                espacios[i]=null;
                return true;
            }
        }
        return false;
    }

    public int contarVehiculos() {
        int contador = 0;
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i]!=null){
                contador++;
            }
        }
        return contador;
    }


}