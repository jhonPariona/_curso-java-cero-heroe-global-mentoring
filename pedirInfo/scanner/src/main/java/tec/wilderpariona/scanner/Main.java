/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tec.wilderpariona.scanner;

import java.util.Scanner;

/**
 *
 * @author bh
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Ingrese un nombre: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); //lee una linea
        System.out.println("name = " + name);
    }
}
