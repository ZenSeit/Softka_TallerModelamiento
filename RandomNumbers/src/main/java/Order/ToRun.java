/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Order;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class ToRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner opnum = new Scanner(System.in);
        double nums[] = new double[5];
        double num = 0;
        OrderMeth meth = new OrderMeth();
        
        System.out.println("These are your numbers before to order.");
        System.out.print("[");
        for (int i = 0; i <= 4; i++) {
            num = Math.random() * 10;
            nums[i] = Math.round(num * 10);
            System.out.print(" "+nums[i]+" ");
        }
        System.out.println("]");
        
        System.out.println("Which method to order do you want to user?");
        System.out.println("1. Quick sort");
        System.out.println("2. Bubble sort");
        int op = opnum.nextByte();
        switch (op) {
            case 1:
                System.out.print("[");
                for (double n : meth.QuickSort(nums, 0, nums.length - 1)) { //Mediante el metodo QUICKSORT de la clase meth se implementa el algoritmo quick sort.
                    System.out.print(" " + n + " ");
                }
                System.out.print("]");
                break;
            
            case 2:
                System.out.print("[");
                for (double n : meth.BubbleSort(nums)) { // Mediante el metodo BUBBLESORT de la clase meth se implementa el algoritmo de Burbuja.
                    System.out.print(" " + n + " ");
                }
                System.out.print("]");            
            break;
            
            default:
                System.out.println("Wrong option");
                    
        }
        
    }
    
}
