public class Automovil {
    //Declaración de atributos
    private String marca = "BMW"; //solo sire para la clase el asignar aquí
    private String modelo;
    private String color = "Verde"; //Así viene el molde.
    private int cilindraje;
    private float consumo=40;
    // Constructores
    // Geter and Setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public float getConsumo() {
        return consumo;
    }
    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }
    public void leerMarca(String marca){
        this.marca=marca; //a la propiedad marca asignarle la variable marca
    }
    public void escribirMarca(){
        this.marca = marca;
    }
    //Creación de métodos
    public String verDetalle() {
        String mark = "BMW"; //dentro de la clase no es necesario get, set o public o private
        String dv = "La marca es -> " + getMarca() + "\n" +
                "El modelo es -> " + this.modelo + "\n" +
                "El color es -> " + this.color + "\n" +
                "El cilindraje es -> " + this.cilindraje;
        return dv;
    }
    // Clase: Upper Camel Case, empiezan con mayúscula.
    // Los métodos: Lower Camel Case, la primera con minúscula y si es más de una palabra las otras empiezan con mayúsculas.
    // Es una variable a la que se asigna un valor
    // this: Toma el valor del atributo de la clase.
    // Metodo: Comportamiento del estado de los atributos    }
    // Creación de métodos con parámetros.

    public String acelerar(){
        return "El auto marca + " + this.getMarca() + "Está acelerando";
    }
    public String frenar(int kmph){
        return "El auto modelo + " + this.modelo + "Está frenando a -> " +kmph;
    }
    public float capacidadTanque(int cap, float porConsumo ){
        float cm = consumo / (cap*porConsumo);
        return cm;
    }
    public float capacidadTanque(int cap, int porConsumo ){
        float cm = consumo / (cap*(porConsumo/100));
        return cm;
    }
}
