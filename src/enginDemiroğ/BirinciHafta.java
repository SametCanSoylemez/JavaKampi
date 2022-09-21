package enginDemiroğ;

import java.util.Scanner;

public class BirinciHafta {
    public static void main(String[] args) {

        System.out.println("---------- SAYI ASAL MI? ----------");

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;
        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " Asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " Asal bir sayi degildir.");
        }

        System.out.println("---------- KALIN SESLİ VE İNCE SESLİ HARFLER ----------");

        char harf = 'I';

        switch (harf){
            case 'A' :
            case 'I' :
            case 'O' :
            case 'U' :
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }

        System.out.println("---------- MÜKEMMEL SAYILAR ----------");

        int number = 28;
        int total=0;

        for (int i = 1; i <number ; i++) {
            if (number % i ==0){
                total=total+i;
            }
        }

        if (total==number){
            System.out.println("Mükemmel Sayıdır.");
        }else {
            System.out.println("Mükemmel Sayı Değildir.");
        }


        System.out.println("---------- ARKADAŞ SAYILAR ----------");

        int sayi1=220;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;

        for (int i = 1; i <sayi1 ; i++) {
           if (sayi1%i==0){
               toplam1= toplam1+i;
           }
        }
        for (int i = 1; i <sayi2 ; i++) {
            if (sayi2%i==0){
                toplam2= toplam2+i;
            }
        }

        if (sayi1==toplam2 && sayi2==toplam1){
            System.out.println("Bu iki sayı arkadaştır.");
        }else {
            System.out.println("Bu iki sayı arkadaş değildir.");
        }


        System.out.println("---------- SAYI BULMA ----------");

        int[] sayilar = new int[]{1,2,3,5,7,9};
        int aranacak = 5;
        boolean varMi=false;

        for (int sayii:sayilar) {
            if (sayii ==aranacak){
                varMi = true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayı mevcuttur.");
        }else {
            System.out.println("Sayı mevcut değildir.");
        }

    }
}
