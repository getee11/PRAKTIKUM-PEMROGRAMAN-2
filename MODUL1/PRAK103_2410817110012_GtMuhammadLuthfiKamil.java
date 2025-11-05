package MODUL1;

import java.util.Scanner;

public class PRAK103_2410817110012_GtMuhammadLuthfiKamil {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = sc.nextInt();
        System.out.print("Masukkan bilangan awal: ");
        int angka = sc.nextInt();

        int count = 0;
        do {
            if (angka % 2 != 0) { 
                System.out.print(angka);
                count++;
                if (count < n) System.out.print(", ");
            }
            angka++;
        } while (count < n);
    }
}
