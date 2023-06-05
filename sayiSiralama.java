package sayiSiralama;

import java.util.Scanner;

public class sayiSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a, b, c;

        System.out.print("1. sayıyı giriniz : ");
        a = inp.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        b = inp.nextInt();

        System.out.print("3. sayıyı giriniz : ");
        c = inp.nextInt();
        // Büyükten küçüğe sıralama
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " > " + b + " > " + c);
            } else { // else if (c>b){ şeklinde de yazabiliriz
                System.out.println(a + " > " + c + " > " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + " > " + a + " > " + c);
            } else {
                System.out.println(b + " > " + c + " > " + a);
            }
        }
        // burada da c'nin en büyük olma ihtimalini hesaplıypruz.
        // yukardaki kodlarda a'nın ve b'nin büyük olma ihtimaine karşı kod yazdık.
        // a ve b büyük değilse zaten c büyük olur. onun için
        // else if ((c>a) && (c>b)) { şeklinde yazmaya gerek yok
        else if (b > a) {
            System.out.println(c + " > " + b + " > " + a);
        } else {
            System.out.println(c + " > " + a + " > " + b);
        }
        // Küçükten büyüğe sıralama
        if (a < b && a < c) {
            if (b < c) {
                System.out.println(a + " < " + b + " < " + c);
            } else { // else if (c<b){ şeklinde de yazabiliriz
                System.out.println(a + " < " + c + " < " + b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println(b + " < " + a + " < " + c);
            } else {
                System.out.println(b + " < " + c + " < " + a);
            }
        } else if (b < a) {
            System.out.println(c + " < "  + b + " < " + a);
        } else {
            System.out.println(c + " < " + a + " < " + b);
        }
    }
}
