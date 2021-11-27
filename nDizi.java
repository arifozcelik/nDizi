package NesneYonelimliProgramlamaKitap;

import java.util.Scanner;

public class nDizi {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int N, Toplam = 0;
        System.out.println("Dizi boyutu...:");
        N = tara.nextInt();
        int A[]= new int[N];
        System.out.println("Dizi elemanları...:");
        for (int i =0; i<N; i++){
            A[i] = 1 + (int) (Math.random()*100);
            System.out.println("A["+i+"]=" + A[i]);
            Toplam += A[i];
        }
        System.out.println("Toplam = " + Toplam);
    }
}
