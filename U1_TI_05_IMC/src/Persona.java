public class Persona {
    private String nombre;
    private double altura;
    private double peso;

    //Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Altura
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Peso
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Calcular IMC
    public double calcularIMC(){
        return peso/(altura*altura);
    }

    //Clasificar IMC
    public String clasificarIMC(double imc){
        String clasificacion = "";

        if(imc<18.5)
        {
            clasificacion = "El IMC es: Bajo de peso";
        } else if (imc>=18.5 && imc<=24.9)
        {
            clasificacion = "El IMC es: Normal";
        } else if (imc>=25.0 && imc<=29.9)
        {
            clasificacion = "El IMC es: Sobrepeso";
        } else if (imc>=30)
        {
            clasificacion = "El IMC es: Obesidad";
        }
        return clasificacion;
    }
}