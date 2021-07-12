
package peliculas.models;

public interface ICatalogoPeliculas {
    void insertarPelicula(Pelicula peliculas);
    void listarPelicula();
    void buscarPelicula(String nombre);
}
