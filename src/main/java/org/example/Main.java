package org.example;

public class Main {

    public static void main(String[] args) {
        LinkedQueue<Integer> kolejkaLista = new LinkedQueue<>();


        System.out.println("----------------------------------------");
        System.out.println("-       kolejka - driver klasy         -");
        System.out.println("----------------------------------------\n");
        System.out.println("----------------------------------------");
        System.out.println("-      Dodawanie do kolejki            -");
        System.out.println("----------------------------------------\n");


        for (int i = 0; i<10; i++){
            System.out.println("Dodawanie elementu: " + i);
            System.out.println("----------------------------------------\n");
            System.out.println("Dodawanie elementu: " + i + " do kolejki na liscie.");
            kolejkaLista.enqueue(i);
            System.out.println("Czy kolejka pusta?: " + kolejkaLista.isEmpty());
            System.out.println("Ilosc elemntow: " + kolejkaLista.size());
            System.out.println("Pierwszy: " + kolejkaLista.first());
            System.out.println("----------------------------------------\n");

        }


        System.out.println("----------------------------------------");
        System.out.println("-      Usuwanie ze kolejki na tablicy   -");
        System.out.println("----------------------------------------\n");


        while (!kolejkaLista.isEmpty()){
            System.out.println("----------------------------------------\n");
            System.out.println("Usuwanie elementu: " + kolejkaLista.dequeue());
            System.out.println("Czy stos pusty?: " + kolejkaLista.isEmpty());
            System.out.println("Ilosc elemntow: " + kolejkaLista.size());
            System.out.println("Gora: " + kolejkaLista.first());
            System.out.println("----------------------------------------\n");
        }
        System.out.println("Czy kolejka na liscie pusty?: " + kolejkaLista.isEmpty());
    }
}
