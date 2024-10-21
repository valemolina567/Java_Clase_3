public class Main {
    public static void main(String[] args) {
        Automovil bmw = new Automovil();        // Automovil() es el nombre del constructor.
        bmw.setMarca("BMW");
        bmw.setModelo("i320");
        bmw.setColor("Negro");
        bmw.setCilindraje(3);
        System.out.println("Marca: " + bmw.getMarca());
        System.out.println("Modelo: " + bmw.getModelo());
        System.out.println("Color: " + bmw.getColor());
        System.out.println("Cilindraje: " + bmw.getCilindraje());
        //get leer valor asignado
        // set asignar un valor
    }
}