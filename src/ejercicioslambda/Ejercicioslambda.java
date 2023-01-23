
package ejercicioslambda;
import clases.Persona;
import interfaces.Operaciones;
public class Ejercicioslambda {
      public static void main(String[] args) {
          
          Persona npersona = new Persona("Pablo", "Vilches", 5);
          
          Operaciones ops = ( x, f ) -> {
              System.out.println("suma :" + (x + f));         
          };
          
          Operaciones opr = ( x, f ) -> {
              System.out.println("Resta :" + (x - f));         
          };
          
          Operaciones opm = ( x, f ) -> {
              System.out.println("Multiplicacion :" + (x * f));         
          };
          
          Operaciones opd = ( x, f ) -> {
              System.out.println("division :" + (x / f));         
          };
          
          Operaciones opan  = ( x, f ) -> {
              int anioactual = x;
              int anionacimiento =  anioactual - npersona.getEdad();
              System.out.println("año Nacimiento : " + anionacimiento );         
          };
          
          ops.operacionMatematica(10,6);
          opr.operacionMatematica(10,6);
          opm.operacionMatematica(10,6);
          opd.operacionMatematica(10,6);
          opan.operacionMatematica(2023,6);
          
          
    }
    
}
