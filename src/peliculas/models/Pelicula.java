
package peliculas.models;

public class Pelicula {
    public String nombre;
    
    public Pelicula(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
