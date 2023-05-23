/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortingalgorithmgui.sortingalgorithmgui;

/**
 *
 * @author REFAEY
 */
public class Sorting {

    void Swap(int x, int y) {
        int temp;
        temp = x;
        x = y;
        y = temp;

    }

    public Sorting() {
    }

    int length = 10;
    int arr[] = {5, 3, 8, 4, 1, 2, 6, 7, 9, 10};

    void selectionSort(int arr[], int length) {
        int Min;
        for (int i = 0; i < length-1; i++) {
            Min = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[Min]){
                    Min = j;
                }
                Swap(arr[j],arr[Min]);
                
            }
        }
    }
    void insertionsort(int arr[], int length) {
        int key, j;
        for (int i = 1; i < length; i++) {
            key = arr[i]; // 3
            j = i - 1; // 0
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
