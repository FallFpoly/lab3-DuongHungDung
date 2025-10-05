/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] hoTen = new String[n];
        double[] diem = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ho ten sinh vien thu " + (i+1) + ": ");
            hoTen[i] = sc.nextLine();

            System.out.print("Nhap diem cua sinh vien thu " + (i+1) + ": ");
            diem[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("\nDanh sach sinh vien:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Ho ten: %s, Diem: %.2f, Hoc luc: %s\n",
                              hoTen[i], diem[i], hocLuc(diem[i]));
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (diem[j] > diem[j + 1]) {
                    double tempDiem = diem[j];
                    diem[j] = diem[j + 1];
                    diem[j + 1] = tempDiem;
                    String tempTen = hoTen[j];
                    hoTen[j] = hoTen[j + 1];
                    hoTen[j + 1] = tempTen;
                }
            }
        }
        System.out.println("\nDanh sach sinh vien sau khi sap xep theo diem tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Ho ten: %s, Diem: %.2f, Hoc luc: %s\n",
                              hoTen[i], diem[i], hocLuc(diem[i]));
        }

        sc.close();
    }
    public static String hocLuc(double diem) {
        if (diem < 5) return "Yeu";
        else if (diem < 6.5) return "Trung binh";
        else if (diem < 7.5) return "Kha";
        else if (diem < 9) return "Gioi";
        else return "Xuat sac";
    }
}