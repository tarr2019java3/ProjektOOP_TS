package pl.sda.projketoop;

public class Main {

    public static void main(String[] args) {
	Worker worker1  =   new Worker("Tomasz", "Dupa", 22, 'M', 1, 10000.00F, 2, true  );
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
    }
    
}
