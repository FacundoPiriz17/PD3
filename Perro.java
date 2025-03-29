package PD3;
public class Perro implements Mamifero{
    private String nombre;

    @Override
    public void saltar() {
        System.out.println("El perro está saltando.");
    }

    @Override
    public void caminar() {
        System.out.println("El perro está caminando.");
    }

    @Override
    public void correr() {
        System.out.println("El perro está corriendo.");
    }

    public Perro(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void ladrar(){
        System.out.println("wof");
    }
    
    public boolean respondeA(String unNombre){
        return this.nombre.equals(unNombre);
    }
    public static void main(String[] args){
        Perro p = new Perro("Firulais");
        System.out.println(p.getNombre());
        p.ladrar();
        System.out.println(p.respondeA("Firulais"));
    }
}

