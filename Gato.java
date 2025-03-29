package PD3;

public class Gato implements Mamifero {
    private String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    public void maullar(){
        System.out.println("Miau");
    }

    @Override
    public boolean respondeA(String unNombre){
        return false; // NUNCA RESPONDEN !!!
    }

    @Override
    public void saltar() {
        System.out.println("El gato está saltando.");
    }

    @Override
    public void caminar() {
        System.out.println("El gato está caminando.");
    }

    @Override
    public void correr() {
        System.out.println("El gato está corriendo.");
    }
}
