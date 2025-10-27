package crudjava;

public abstract class Producto implements Vendible{

    private int id;              
    private String nombre;       
    private double precio;      

    private static int contador = 1;

    public Producto(){
    }

    public Producto(String nombre, double precio) { 
        this.id = contador++;      
        this.nombre = nombre;       
        this.precio = precio;       
    }

    public int getId() {            
        return id;
    }

    public String getNombre() {    
        return nombre;
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre;
    }

    public double getPrecio() {     
        return precio;
    }

    public void setPrecio(double precio) { 
        this.precio = precio;
    }


    public abstract double calcularDescuento(); 
   // public abstract String mostrarDatos(); // Contrato a implementar en hijas

    @Override
    public String toString() {      
        return "Producto{id=" + id + ", nombre='" + nombre + "', precio=" + precio + "}";
    }
}

