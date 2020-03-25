package pl.sda.projketoop;

import javax.swing.*;
import java.lang.invoke.SwitchPoint;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Tomasz", "Dupa", 22, 'M', 1, 10000.00F, 2, true);
        Worker worker2 = new Worker("Damian", "Wąsik", 18, 'M', 2, 200.00F, 0, false);
        Worker worker3 = new Worker("Kamil", "Zdun", 18, 'M', 2, 200.00F, 0, false);
        ArrayList<Worker> workerArrayList = new ArrayList<Worker>();
        workerArrayList.add(worker1);
        workerArrayList.add(worker2);
        workerArrayList.add(worker3);
        int xyz = 0;
        do {
            int menu;
            Scanner in = new Scanner(System.in);
            System.out.println("Witaj");
            System.out.println("Opcje:");
            System.out.println("0 - koniec programu");
            System.out.println("1 - wypisz pracowników");
            System.out.println("2-Dodaj nowego pracownika");
            menu = in.nextInt();

            switch (menu) {
                case 0: {
                    xyz = 1;
                    break;
                }
                case 1: {
                    for (Worker x : workerArrayList) {
                        x.printBasicInfo();
                        System.out.println();
                    }
                    break;
                }
                case 2: {
                    Scanner newWorker = new Scanner(System.in);
                    String name;
                    String lastname;
                    int age;
                    char sex;
                    int nr_dzial;
                    float wage;
                    int baby;
                    boolean marry = false;
                    System.out.println("Podaj Imie:");
                    name = newWorker.nextLine();
                    System.out.println("Podaj Nazwisko");
                    lastname = newWorker.nextLine();
                    System.out.println("Podaj wiek pracownika");
                    age = newWorker.nextInt();
                    System.out.println("Podaj płeć pracownika");
                    sex = newWorker.next().charAt(0);
                    System.out.println("Podaj numer działu");
                    nr_dzial = newWorker.nextInt();
                    System.out.println("Podaj pensje");
                    wage = newWorker.nextFloat();
                    System.out.println("Pdoaj ilość dzieci pracownika");
                    baby = newWorker.nextInt();
                    System.out.println("Jesli pracownik jest w zwiazku malzenskim 1 jesli cos innego");
                    if (1 == newWorker.nextInt()) {
                        marry = true;
                    } else {
                        marry = false;
                    }
                    workerArrayList.add(new Worker(name, lastname, age, sex, nr_dzial, wage, baby, marry));


                    break;
                }
            }

        }
        while (xyz == 0);

    }


	/*
   worker1.printInfo();
    worker1.printBasicInfo();
    worker1.printSpecialInfo();
    if(worker1.wageIsBigger(8000.00F)){
        System.out.println("Pensja jest wyższa");
    }
    else{
        System.out.println("Pensja jest niższa");
    }
        System.out.println("Procent podwyżki: "+worker1.rise(10));
    */
}
    

