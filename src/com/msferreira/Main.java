package com.msferreira;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int n = 0;
        int f = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Calcular fatorial de: ");
        n = scanner.nextInt();
        scanner.close();

        if (n==0){
            f = 1;
        }
        if (n>0){
            for (int i=1; i<=n; i++) {
                f = f * i;
            }
        }

        System.out.print("Fatorial de " + n + ": " + f);
    }
}
