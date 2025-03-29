package PD3;

public class MainMaquinaB {
    public static void main(String[] args) {
        Gato gato = new Gato("Oso");
        System.out.println(gato.getNombre());
        gato.maullar();
        System.out.println(gato.respondeA("Oso"));
    }
}
