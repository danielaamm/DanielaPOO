public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;

    //Setters
    public void setCodigo(String codigo){
        if (codigo != null && !codigo.isEmpty()){
            this.codigo=codigo;
        } else {
            System.out.println("El codigo no puede estar vacio");
        }

    }

    public void setNombre(String nombre){
        if (cantidad>=0){
            this.nombre=nombre;
        } else {
            System.out.println("La cantidad no puede ser menor a cero");
        }

    }

    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }


    //Getters
    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCantidad(){
        return cantidad;
    }
}
