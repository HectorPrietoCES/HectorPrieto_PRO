package Ejercicio2;

public class Alumno {
     private Asignatura Asignatura1;
     private Asignatura Asignatura2;
     private Asignatura Asignatura3;

     public Alumno (Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3){
          this.Asignatura1=asignatura1;
          this.Asignatura2=asignatura2;
          this.Asignatura3=asignatura3;

     }
     public Asignatura getAsignatura1() {
          return Asignatura1;
     }

     public Asignatura getAsignatura2() {
          return Asignatura2;
     }

     public Asignatura getAsignatura3() {
          return Asignatura3;
     }
}
