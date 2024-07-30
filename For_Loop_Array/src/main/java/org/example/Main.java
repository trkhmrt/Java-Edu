package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            int[] numbers = {1, 2, 3, 4, 5};

            // Dizinin elemanlarını yazdırma
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }

            //DİZİ ELEMANLARI TOPLAMINI BULMA
        int[] numbers2 = {1, 2, 3, 4, 5};
        int sum = 0;

        // Dizinin elemanlarının toplamını hesapla
        for (int i = 0; i < numbers2.length; i++) {
            sum += numbers2[i];
        }

        System.out.println("Toplam: " + sum);
        }
    }
}