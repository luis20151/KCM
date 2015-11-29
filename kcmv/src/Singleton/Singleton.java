/*
garantizando así un punto de acceso global al objeto creado.
 */
package Singleton;

/**
 *
 * @author josel
 */
public class Singleton {
// El primer paso para conseguir este patrón es bloquear la forma de generar instancias de la clase,
// esto se hace simplemente privatizando el constructor de la clase
   private Singleton(){}  
   
//    crearemos una instancia estática de la clase para que viva durante toda la vida de la aplicación.
   private static Singleton singleton = new Singleton();
//Ahora solo falta tener alguna forma de acceder a este objeto, y esto es mediante un método estático
      public static Singleton getInstance(){ 
       return Singleton.singleton; 
    } 
}
