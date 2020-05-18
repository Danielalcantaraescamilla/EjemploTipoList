/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotipolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex0
 */
public class EjemplotipoList {
public EjemplotipoList(){

}
public void principal(){
List <Datos> lista = new ArrayList <> ();
Datos datos = new Datos();

datos.setNombre("Daniel");
datos.setEdad(23);

lista.add(datos);

datos = new Datos();

datos.setNombre("Miguel");
datos.setEdad(20);

lista.add(datos);
datos = new Datos();
datos.setNombre("Anna");
datos.setEdad(35);

lista.add(datos);
lista.forEach(elemtos -> {
    System.out.println("Nombre" + elemento.getNombre());
    System.out.println("Edad" + elemto.getEdad());
    
    System.out.println("\n\notra forma de recorrer");

    for (Datos contenido : lista){
    System.out.println("Nombre" + contenido.getNombre());
    System.out.println("Edad" + contenido.getEdad());

}

Datos = new Datos();

datos.setNombre("Gustavo");
datos.setEdad(18);

lista.add(datos);

System.out.println("\n\ntercer forma de vizulisar el contenido");

lista.stream().forEach(valores) -> {
System.out.println("Nombre" + valores.getNombre());
System.out.println("Edad" + valores.getEdad());

if(valores.getNombre().equals("Daniel")){
System.out.println("Se encontro el dato...");
}

}           
});
}




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new EjemplotipoList();
    }
    
}
