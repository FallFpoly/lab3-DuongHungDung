/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author ICT
 */
import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("\nMang sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int min = a[0];
        System.out.println("Phan tu nho nhat: " + min);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                sum += a[i];
                count++;
            }
        }

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Trung binh cong cac phan tu chia het cho 3: " + avg);
        } else {
            System.out.println("Khong co phan tu nao chia het cho 3.");
        }

        sc.close();
    }
}
