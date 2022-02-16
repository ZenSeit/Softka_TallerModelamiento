/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Order;

/**
 * Clase que tiene alojados los metodos de ordenamiento
 * @author diego
 */
public class OrderMeth {

    /**
     * Metodo que pide un arreglo de numeros y los ordena siguiendo QuickSort y retorna el arreglo ordenado
     * @param nums Arreglo de numeros
     * @param one Primera posicion del arreglo
     * @param last Ultima posicion del arreglo
     * @return 
     */
    public double[] QuickSort(double[] nums, int one, int last) { 
        int i, j;
        double piv, temp;
        i = one;
        j = last;
        piv = nums[(one + last) / 2];
        do {
            while (nums[i] < piv) {
                i++;
            }
            while (nums[j] > piv) {
                j--;
            }

            if (i <= j) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }

        } while (i <= j);
        if (one < j) {
            QuickSort(nums, one, j);
        }
        if (i < last) {
            QuickSort(nums, i, last);
        }

        return nums;
    }

    /**
     * Metodo que ordena numeros siguiendo el metodo de burbuja y retorna el arreglo ordenado
     * @param nums Arreglo de numeros
     * @return 
     */
    public double[] BubbleSort(double[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    double temps = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temps;
                }

            }

        }

        return nums;
    }

}
