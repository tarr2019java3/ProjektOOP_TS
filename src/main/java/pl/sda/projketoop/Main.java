package pl.sda.projketoop;

public class Main {

    public static void main(String[] args) {
	Worker worker1  =   new Worker("Tomasz", "Dupa", 22, 'M', 1, 10000, 0, false  );
    worker1.printInfo();
    worker1.printBasicInfo();
    worker1.printSpecialInfo();
    }
}
