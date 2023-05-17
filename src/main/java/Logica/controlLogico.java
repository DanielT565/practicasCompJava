/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Persistencias.controlaPersistenicia;
import java.util.ArrayList;

/**
 *
 * @author danil
 */
public class controlLogico {
    
    controlaPersistenicia contrPersist=new controlaPersistenicia();
    
    public void crearAlumno(Alumno alu){
        contrPersist.crearAlumno(alu);
    }
    
    //Metodo para eliminar un dato.
    public void eliminAlumno(int id){
        contrPersist.eliminAlumno(id);
    }
    
    public void editAlumno(Alumno alu){
        contrPersist.editAlumno(alu);
    }
    
    public  Alumno traerAlumno(int id){
        return contrPersist.traerAlumno(id);
    }
 
    public ArrayList<Alumno>traerListAlumnos(){
        return contrPersist.traerListAlumnos();
    }
    
    //Carrera
    
     public void crearCarrera(Carrera carrers){
        contrPersist.crearCarrera(carrers);
    }
    
    //Metodo para eliminar un dato.
    public void eliminCarrera(int id){
        contrPersist.eliminCarrera(id);
    }
    
    public void editCarrera(Carrera carrers){
        contrPersist.editCarrera(carrers);
    }
    
    public  Carrera traerCarrera(int id){
        return contrPersist.traerCarrera(id);
    }
 
    public ArrayList<Carrera>traerListCarrera(){
        return contrPersist.traerListCarrera();
    }
    
    
//Materias
    
    public void crearMateria(Materia mate){
        contrPersist.crearMateria(mate);
    }
    
    public void eliminMateria(int id){
        contrPersist.eliminMateria(id);
    }
    
    public void editMateria(Materia mate){
        contrPersist.editMateria(mate);
    }
    
    public  Materia traerMateria(int id){
        return contrPersist.traerMateria(id);
    }
 
    public ArrayList<Materia>traerListMateria(){
        return contrPersist.traerListMateria();
    }
}
