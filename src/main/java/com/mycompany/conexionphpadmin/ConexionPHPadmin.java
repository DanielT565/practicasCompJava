/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conexionphpadmin;

import Logica.Alumno;
import Logica.Carrera;
import Logica.Materia;
import Logica.controlLogico;
import Persistencias.controlaPersistenicia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author danil
 */
public class ConexionPHPadmin {

    public static void main(String[] args) {
        
        //Crear instancia control
        controlLogico control=new controlLogico();
        
//Crea la persona en la base de datos
        /*Alumno alu=new Alumno(16,"Daniel","cxzad", new Date());
        
            control.crearAlumno(alu);     
        
        //Eliminar un dato en la base de datos
        
       /* control.eliminAlumno(10);*/
        
       //Editar un parametro de la tabla
       /*alu.setApellido("Terros");
       control.editAlumno(alu);*/
       
       //Traer el alumno deseado
      /* Alumno alum=control.traerAlumno(15);
       System.out.println("\n---------------------------Busqueda individual---------------");
       System.out.println("El alumno es: "+alum.toString()+"\n");
       System.out.println("---------------------------Busqueda Global---------------");
        ArrayList<Alumno> listAlumnos=control.traerListAlumnos();
        for(Alumno al:listAlumnos){
            System.out.println("El Alumno es: "+al.toString());
        }
         System.out.println("---------------------------------------");*/
      
      /*Bases de datos One to Many*/
      LinkedList<Materia>listMateria=new LinkedList<Materia>();
      //Crear carrera
       Carrera carre=new Carrera(20,"Software",listMateria);
       
       //Guardar Carrera
       control.crearCarrera(carre);
      
      //Crear Materia
      Materia mate1=new Materia(20,"Programación I","Semestral",carre);
      Materia mate2=new Materia(21,"Programación II","Cuatrimestral",carre);
      Materia mate3=new Materia(22,"Programación III","Por año",carre);
      
      
      //Guardar materia
      control.crearMateria(mate1);
       control.crearMateria(mate2);
        control.crearMateria(mate3);
      
      // Agragarlas lista de materias
      listMateria.add(mate1);
      listMateria.add(mate2);
      listMateria.add(mate3);
      carre.setListaMaterias(listMateria);
      control.editCarrera(carre);
              
       //Bases de datos one To one completo
      
       
       
       //Creación del alumno(con Carrera)
       Alumno alu=new Alumno(10,"Daniel","Terreros", new Date(),carre);
       
       //Guardar el alumno en la DB
       control.crearAlumno(alu);
       
       //Visualizar los resultados.
       System.out.println("\n------------------------Datos Alumno---------------");
       Alumno alum=control.traerAlumno(10);
       System.out.println("El alumno: "+alum.getNombre()+" "+alum.getApellido()+" "+"Carrera: "+alu.getCarre().getNombre());
    }

    
}
