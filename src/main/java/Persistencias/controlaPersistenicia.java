/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencias;

import Logica.Alumno;
import Logica.Carrera;
import Logica.Materia;
import Persistencias.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danil
 */
public class controlaPersistenicia {
    AlumnoJpaController aluJpa=new AlumnoJpaController();
    CarreraJpaController carreras=new CarreraJpaController();
    MateriaJpaController materias=new MateriaJpaController();

    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

// Verifica que el elemento a eliminar este en la base de datos
    
    public void eliminAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controlaPersistenicia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(controlaPersistenicia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListAlumnos() {
        List<Alumno> listita=aluJpa.findAlumnoEntities();
        ArrayList<Alumno>listaAlumno=new ArrayList<Alumno> (listita);
        return listaAlumno;
    }

//Carrera
    public void crearCarrera(Carrera carrers) {
    carreras.create(carrers);        
    }

    public void eliminCarrera(int id) {
          try {
            carreras.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controlaPersistenicia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editCarrera(Carrera carrers) {
          try {
            carreras.edit(carrers);
        } catch (Exception ex) {
            Logger.getLogger(controlaPersistenicia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
       return carreras.findCarrera(id);
    }

    public ArrayList<Carrera> traerListCarrera() {
    List<Carrera> lista=carreras.findCarreraEntities();
    ArrayList<Carrera>listaCarrera=new ArrayList<Carrera> (lista);
        return listaCarrera;
    }
    
    //Materias
    
    public void crearMateria(Materia mate) {
    materias.create(mate);        
    }

    public void eliminMateria(int id) {
          try {
            materias.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controlaPersistenicia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editMateria(Materia mate) {
          try {
            materias.edit(mate);
        } catch (Exception ex) {
            Logger.getLogger(controlaPersistenicia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
       return materias.findMateria(id);
    }

    public ArrayList<Materia> traerListMateria() {
    List<Materia> lista=materias.findMateriaEntities();
    ArrayList<Materia>listaMateria=new ArrayList<Materia> (lista);
        return listaMateria;
    }
    
}
