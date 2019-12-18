/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

package lecturajson;

/**
 *
 * @author Usuario DAM 2
 */
public class Pelicula {

    String titulo, descripcion;

    public Pelicula(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
