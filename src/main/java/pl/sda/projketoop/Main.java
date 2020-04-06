package pl.sda.projketoop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Tomasz", "Dupa", 22, Sex.M, 1, 10000.00F, 2, Marry.YES);
        Worker worker2 = new Worker("Damian", "Wąsik", 18, Sex.K, 2, 200.00F, 0, Marry.NO);
        Worker worker3 = new Worker("Kamil", "Zdun", 18, Sex.M, 2, 200.00F, 0, Marry.NO);
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
            System.out.println("2 - Dodaj nowego pracownika");
            System.out.println("3 - Eksportuj liste pracowników do pliku");
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
                    Sex sex;
                    int nr_dzial;
                    float wage;
                    int baby;
                    Marry marry;
                    System.out.println("Podaj Imie:");
                    name = newWorker.nextLine();
                    System.out.println("Podaj Nazwisko");
                    lastname = newWorker.nextLine();
                    System.out.println("Podaj wiek pracownika");
                    age = newWorker.nextInt();
                    System.out.println("Podaj płeć pracownika: 1 - M 0 - K");

                    if(0==newWorker.nextInt()){
                        sex = Sex.K;
                    }
                    else{
                        sex = Sex.M;
                    }
                    System.out.println("Podaj numer działu");
                    nr_dzial = newWorker.nextInt();
                    System.out.println("Podaj pensje");
                    wage = newWorker.nextFloat();
                    System.out.println("Pdoaj ilość dzieci pracownika");
                    baby = newWorker.nextInt();
                    System.out.println("Marry? YES/NO");
                    marry = Marry.valueOf(newWorker.next().toUpperCase());

                    workerArrayList.add(new Worker(name, lastname, age, sex, nr_dzial, wage, baby, marry));


                    break;
                }

                case 3:{


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
    

