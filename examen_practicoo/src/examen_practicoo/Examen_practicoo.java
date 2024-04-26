/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_practicoo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class Examen_practicoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Juego piedra,papel o tijera vs la computadora");
      Scanner captu = new Scanner(System.in);
 
      
      int eleccionCompu = (int)(Math.random() * 3) + 1;
     
      
 
      System.out.println("que eliges 1=Piedra, 2=Papel, 3=Tijera: ");
      
      int seleUsuario = captu.nextInt();
 
      
      System.out.println("La computadora eligio: ");
      switch ( eleccionCompu )
      {
         case 1:
            System.out.println("Piedra");
            switch ( seleUsuario )
            {
               case 1: System.out.println("Empate"); break;
               
               case 2: System.out.println("ganaste"); break;
               
               
               case 3: System.out.println("gano la compu"); break;
            }
            break;
         case 2:
            System.out.println("papel");
            switch ( seleUsuario )
            {
               case 1: System.out.print("gano la pc"); break;
               
               case 2: System.out.print("Empate"); break;
               
        
           
               case 3: System.out.print("ganaste"); break;
            }
            break;
         case 3:
            System.out.println("tijera");
            switch ( seleUsuario )
            {
               case 1: System.out.println("ganaste"); break;
               
               case 2: System.out.println("gano la compu"); break;
               
               
               case 3: System.out.println("Empate"); break;
            }
            break;
    }
    
      
    }
}
