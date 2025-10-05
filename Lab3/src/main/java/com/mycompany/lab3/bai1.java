/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author ICT
 */

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        boolean ok = true;

        System.out.print("Nhap mot so nguyen: ");
        N = sc.nextInt();

        if (N < 2) {
            ok = false;
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    ok = false;
                    break;
                }
            }
        }

        if (ok)
            System.out.println(N + " la so nguyen to.");
        else
            System.out.println(N + " khong phai la so nguyen to.");

        sc.close();
    }
}