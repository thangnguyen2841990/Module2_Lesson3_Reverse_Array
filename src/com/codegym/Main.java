package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array; //khai báo mảng array
        int size;    // khai báo biến size
        do {        // vòng lặp do - while để nhập kích cỡ của ma trận array, nếu size > 20 tiếp tục lặp
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        //Nhập các giá trị cho phần tử của mảng array
        array = new int[size];  // khởi tạo mạng array
        int i = 0;        // khai báo i
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        // Hiển thị mảng array
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        // Đảo ngược vị trí trong mảng
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        // hiển thị mảng đảo ngược
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\t");
        }
    }
}
