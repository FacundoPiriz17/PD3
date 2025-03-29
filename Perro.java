package PD3;
public class Perro {
    private String nombre;

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

