package PD3;

public class MainMaquinaB {
    public static void main(String[] args) {
        Gato gato = new Gato("Oso");
        System.out.println(gato.getNombre());
        gato.maullar();
        System.out.println(gato.respondeA("Oso"));
        Perro perro = new Perro("Firulais");
        System.out.println(perro.getNombre());
        perro.ladrar();
        System.out.println(perro.respondeA("Firulais"));
    }
}
