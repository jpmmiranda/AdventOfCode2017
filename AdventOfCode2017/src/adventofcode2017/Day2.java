/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode2017;

/**
 *
 * @author João Miranda
 */
public class Day2 {

    int menu(int parte, String input) {
        int resultado = 0;
        switch (parte) {
            case 1:
                resultado = parte1(input);
                break;
            case 2:
                resultado = parte2(input);
                break;
            default:
                break;
        }
        return resultado;
    }

    int parte1(String input) {
        int length = 0, resultado = 0;
        int max, min;
        
        String[] split = input.split("\\s+");

        length = split.length;
        int[] array = new int[length];

        for (int i = 0; i < length - 1; i++) {
            array[i] = Integer.parseInt(split[i]);
        }
        
        max = array[0];
        min = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (min > array[i]) {
                min = array[i];
            }
        }

        resultado = max - min;
        
        return resultado;
    }

    int parte2(String input) {
        return 0;
    }
}
