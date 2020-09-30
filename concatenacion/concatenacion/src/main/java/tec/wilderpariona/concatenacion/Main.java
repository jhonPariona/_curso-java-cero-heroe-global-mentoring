/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tec.wilderpariona.concatenacion;

/**
 *
 * @author bh
 */
public class Main {
    public static void main(String[] args) {
        String cadena = "hello";
        String name = "wilder";
        //concatenación
        System.out.println(cadena + " " + name);
        
        int num = 1;
        int num2 = 2;
        //suma
        System.out.println(num + num2);
        
        //contexto string
        System.out.println(cadena + num + num2); //hello12
        
        //primero ponemos numeros
        System.out.println(num + num2 + cadena); //3hello
        
        //
        System.out.println(num + cadena + num2); //1hello2
    }
}
