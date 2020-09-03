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
import java.util.*;
public class MergeSort {
    public static int[] merge_sort(int[] cur_state){
      if (cur_state.length == 1){
          return cur_state;
      }
      else{
          //Recursively Get Left Sorted
          int [] left = merge_sort(Arrays.copyOfRange(cur_state, 0, cur_state.length/2));
          //Integer Division makes that last line possible when length is odd
          
          //Get Right Side
          int [] right = merge_sort(Arrays.copyOfRange(cur_state, cur_state.length/2, cur_state.length));
          
          //Merge In Sorted Order
          
          int [] new_arr = new int[right.length + left.length];
          
          int left_index = 0;
          int right_index = 0;
          int cur_pos = 0;
          while (left_index < left.length && right_index < right.length){
              if (left[left_index] <= right[right_index]){
                  new_arr[cur_pos] = left[left_index];
                  left_index++;
              }
              else{
                  new_arr[cur_pos] = right[right_index];
                  right_index++;
              }
              cur_pos++;
          }
          //Now, At this point, one array is exhausted of all of its points, for the other, just add the rest of the values
          if (left_index < left.length){
              while (left_index < left.length){
                  new_arr[cur_pos] = left[left_index];
                  left_index++;
                  cur_pos++;
              }
          }
          else if (right_index < right.length){
              while(right_index < right.length){
                  new_arr[cur_pos] = right[right_index];
                  right_index++;
                  cur_pos++;
              }
          }
          
          //Now is locally Sorted, so return
          return new_arr;
          
      } 
    }
    public static int[] get_nums(int number){
        int[] vals = new int[number];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<number; i++){
            int val = 0;
            String entry = "";
            boolean valid = false;
            do{
                System.out.println(String.format("Enter Digit %d", i));
                entry = scanner.nextLine();
                valid = true;
                for (int j=0; j<entry.length(); j++){
                    if (!Character.isDigit(entry.charAt(j)) && entry.charAt(0) != '-'){
                        valid = false;
                    }
                }
            }   
            while(!valid);
            val = Integer.parseInt(entry);
            vals[i] = val;
        }
        return vals;
    }
}
