package pe.edu.pucp.dovah.RRHH.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
/*
 * Nombre del archivo: CoordinadorDeTesis
 * Fecha de creación: 20/09/2022 , 18:00
 * Autor: Lloyd Castillo Ramos
 * Descripción: Clase CoordinadorDeTesis
 */
@Entity
public class CoordinadorTesis extends Usuario {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private boolean activo;

    protected CoordinadorTesis() {}

    public CoordinadorTesis(String nombre, String apellido, char genero, String codigoPUCP, String correo) {

        super(nombre, apellido, genero, codigoPUCP, correo);
        this.activo = true;

    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
