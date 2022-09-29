/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.cubo;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class ProyectoCubo {
    static Scanner lado = new Scanner(System.in);
    static cubo c=new cubo();
    
    public static void main(String[] args) {
        System.out.println("\tCALCULAR VOLUMEN CUBO");
        System.out.println("\t=====================\n");
        lados();
        
    }
    
    public static void lados(){
        int larg;
        int anch;
        int prof;
        System.out.print("Introduzca la altura del cubo: ");
        larg=lado.nextInt();
        System.out.print("Introduzca la anchura del cubo: ");
        anch=lado.nextInt();
        System.out.print("Introduzca la profundidad del cubo: ");
        prof=lado.nextInt();
        c.volumen(larg, anch, prof);
    }
    
}
