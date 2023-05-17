
package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author danil
 */
@Entity //Convierte la clase en una entidad para la base de datos
public class Alumno implements Serializable {
    @Id //Marca automaticamente la primary key de la base de datos
    @GeneratedValue(strategy=GenerationType.AUTO) //Este ingresa valor automaticamente a la base de datos
     private int id;
    @Basic //información basica
     private String nombre;
     private String apellido;
    
     @OneToOne
      private Carrera carre;
     @Temporal(TemporalType.DATE) //Convierte el dato a dato fecha tabla
     private Date Fecha; 

     
      
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, Date Fecha, Carrera carre) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Fecha = Fecha;
        this.carre = carre;
    }

    

    public Carrera getCarre() {
        return carre;
    }

    public void setCarre(Carrera carre) {
        this.carre = carre;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", Fecha=" + Fecha + '}';
    }
     
     
}
