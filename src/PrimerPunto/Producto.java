package PrimerPunto;

public class Producto implements Comparable<Producto> {

    private String nombre;
    private String codigo;

    public Producto(String nombre, String codigo) {
        super();
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int compareTo(Producto o) {
        return this.codigo.compareTo(o.getCodigo());
    }

}
