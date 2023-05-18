package paquete04;

public class Colegio {

    private String nombre;
    private String ciudad;

    public Colegio(String n, String c) {
        nombre = n;
        ciudad = c;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(String c) {
        ciudad = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

}
