package PD3;

public class MainMaquinaB {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");
        System.out.println(perro.getNombre());
        perro.ladrar();
        System.out.println(perro.respondeA("Firulais"));
    }
}
