/*
 * nombre, imagen, peliculas relacionadas
 */
package com.disneyfilms.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Genero implements Serializable {
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id; 
    private String nombre;
     @OneToOne
    private Imagen imagen;
    @OneToMany
    private PeliculaSerie peliculas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public PeliculaSerie getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(PeliculaSerie peliculas) {
        this.peliculas = peliculas;
    }
    
}
