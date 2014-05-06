/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listasimpledobleenlace;

/**
 *
 * @author GeekEcuador
 */
public class ListaSimpleDobleEnlace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          ListaGenerica lg=new ListaGenerica();
       
        lg.insertar (1, 10);
        lg.insertar (2, 4);
        lg.insertar (3, 3);
        lg.insertar (4, 2);
        lg.insertar (5, 1);
        lg.imprimir ();
        System.out.println ("Luego de Borrar el primero");
        lg.borrar (1);
        lg.imprimir ();
        System.out.println ("Luego de Extraer el segundo");
        lg.extraer (2);
        lg.imprimir ();
        System.out.println ("Luego de Intercambiar el primero con el tercero");
        lg.intercambiar (1, 3);
        lg.imprimir ();
    }
    
}
