
package peliculas.models;

import java.util.ArrayList;

public class ImplementacionCatalogoPelicula implements ICatalogoPeliculas {
    private final ArrayList<String> listaPeliculas;
    
    public ImplementacionCatalogoPelicula(){
        this.listaPeliculas = new ArrayList<>();
    }

    @Override
    public void insertarPelicula(Pelicula pelicula) {
        this.listaPeliculas.add(pelicula.toString());
    }

    @Override
    public void listarPelicula() {
        this.listaPeliculas.forEach(pelicula -> {
            System.out.println(pelicula);
        });
    }

    @Override
    public void buscarPelicula(String nombre) {
        String resultado = null;
        for(var pelicula: this.listaPeliculas){
            if(pelicula.equals(nombre)){
                resultado = pelicula;
                break;
            } 
        }
        
        System.out.println(resultado);
        
    }
    
}
