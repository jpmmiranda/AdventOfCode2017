/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode2017;

import java.util.ArrayList;

/**
 *
 * @author João Miranda
 */
public class Day2 {

    int menu(int parte, ArrayList<String> input) {
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

    int parte1(ArrayList<String> input) {
        int length = 0, resultado = 0;
        int max, min;

        for (int i = 0; i < input.size(); i++) {
            String[] numbers = input.get(i).split("\\s+");

            length = numbers.length;
            int[] array = new int[length];
            for (int ite = 0; ite < length; ite++) {
                array[ite] = Integer.parseInt(numbers[ite]);
            }

            max = array[0];
            min = array[0];

            for (int j = 0; j < array.length; j++) {
                if (max < array[j]) {
                    max = array[j];
                } else if (min > array[j]) {
                    min = array[j];
                }
            }

            resultado += max - min;
        }

        return resultado;
    }

    int parte2(ArrayList<String> input) {
        return 0;
    }
}
