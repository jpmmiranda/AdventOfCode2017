/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode2017;

import java.util.Scanner;

/**
 *
 * @author João Miranda
 */
public class AdventOfCode2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = 0, parte = 0, resultado = 0;
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Choose a day!");
        menu = sc.nextInt();
        
        switch(menu){
            case 1:
                Day1 day1= new Day1();
                resultado = day1.menu();
                break;
            default:
                break;
        }
        System.out.println("O resultado é: "+resultado);
    }
    
}
