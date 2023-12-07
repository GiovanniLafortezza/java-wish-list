package org.lessons.java.wishlist;

import java.util.HashSet;
import java.util.Scanner;

public class WishList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creiamo la lista di regali vuota
        HashSet<String> wishList = new HashSet<>();
        System.out.println(wishList.size());

        boolean stop = false;
        //chiediamo all'utente di inserire un regalo alla volta
        while(!stop) {
            System.out.println("Vuoi inseire un nuovo regalo? (y/n)");
            String answer = scanner.nextLine();
            switch (answer){
                case  "y":
                    //aggiungo il regalo
                    System.out.println("Nome regalo: ");
                    String gift = scanner.nextLine();
                    boolean added = wishList.add(gift);
                    //se il regalo è già stato aggiunto
                    if(!added) {
                        System.out.println("Mi dispiace ma questo è già stato inserito");
                    }
                    break;
                case "n":
                    //esco
                    System.out.println("ok");
                    stop = true;
                    break;
                default:
                    //risposta sbagliata
                    System.out.println("Risposta non valida");
                    break;

            }
        }

    }
}
