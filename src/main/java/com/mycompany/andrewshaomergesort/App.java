/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.andrewshaomergesort;

/**
 *
 * @author andrewsssmario
 */
public class App {
    public static void main(String [] args){
        //Test the sorting algorithm
        /*
        Sample Input
        [1, 4, 6, 2, 3, 7, 5] -> [1,2,3,4,5,6,7]
        */
        int[] vals = MergeSort.get_nums(7);
        vals = MergeSort.merge_sort(vals);
        System.out.println("----------------------------------");
        for (int i=0; i<vals.length; i++){
            System.out.print(String.format("%d ", vals[i]));
        }
        System.out.println();
    }
}
