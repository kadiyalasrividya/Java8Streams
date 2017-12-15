package com.yash.streams;

public class BubbleSort {
    void bubbleSort(int array[]){
        int n = array.length;
        for(int i=0; i<n-1; i++){
            for(int j =0; j<n-i-1;j++){
                if(array[j] > array[i]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    void printArray(int array[]){
        int n = array.length;
        for(int i=0; i<n; i++){
            System.out.println(array[i] + "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort bS = new BubbleSort();
        int array[] = {11,34,56,890,67,2,345};
        bS.bubbleSort(array);
        System.out.println("Sorted Array : ");
        bS.printArray(array);
    }
}
