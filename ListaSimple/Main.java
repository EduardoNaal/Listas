/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasimple;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args){
        ListaSimple listasimple =new ListaSimple();
        
        

        listasimple.insertar(5);
        listasimple.insertar(59);
        listasimple.insertar(91);
        listasimple.insertar(-17);
        listasimple.insertar(73);
        listasimple.insertar(34);
        listasimple.insertar(40);
       
        listasimple.eliminar(2);
        listasimple.eliminar(3);
        
        System.out.println(listasimple.obtener(3));      
               
    }
}
