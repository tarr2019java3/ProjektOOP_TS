package pl.sda.projketoop;

import javax.swing.*;
import java.lang.invoke.SwitchPoint;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Worker worker1  =   new Worker("Tomasz", "Dupa", 22, 'M', 1, 10000.00F, 2, true  );
    Worker worker2  =   new Worker("Damian", "Wąsik", 18, 'M', 2, 200.00F, 0, false );
    Worker worker3  =   new Worker("Kamil", "Zdun", 18, 'M', 2, 200.00F,0,false );
        ArrayList<Worker> workerArrayList  =   new ArrayList<Worker>();
workerArrayList.add(worker1);
workerArrayList.add(worker2);
workerArrayList.add(worker3);


    int menu;
    Scanner in = new Scanner(System.in);
    menu = in.nextInt();

        switch (menu) {
            case 1: {
                for(Worker x : workerArrayList){
                    x.printBasicInfo();
                    System.out.println();
                }
                break;
            }
            case 2:
            {
                System.out.println("2");
                break;
        }

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
    
}
