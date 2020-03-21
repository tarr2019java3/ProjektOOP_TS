package pl.sda.projketoop;

public class Worker {
    private String name;
    private String lastname;
    private int age;
    private char sex;
    private int nr_dzial;
    private float wage;
    private int baby;
    private boolean stan;

    public Worker(String name, String lastname, int age, char sex, int nr_dzial, float wage, int baby, boolean stan) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
        this.nr_dzial = nr_dzial;
        this.wage = wage;
        this.baby = baby;
        this.stan = stan;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getNr_dzial() {
        return nr_dzial;
    }

    public void setNr_dzial(int nr_dzial) {
        this.nr_dzial = nr_dzial;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public int getBaby() {
        return baby;
    }

    public void setBaby(int baby) {
        this.baby = baby;
    }

    public boolean isStan() {
        return stan;
    }

    public void setStan(boolean stan) {
        this.stan = stan;
    }

    public void printInfo(){
        System.out.println("Imię: "+getName());
        System.out.println("Nazwisko: "+getLastname());
        System.out.println("Wiek: "+getAge());
        System.out.println("Płeć: "+getSex());
        System.out.println("Numer działu: "+getNr_dzial());
        System.out.println("Ilość dzieci: "+getBaby());
        System.out.println("Zarobki: "+getWage());
        if(this.isStan()) {
            System.out.println("Stan cywilny: X ");
        }
        else{
            System.out.println("Stan cywilny: Wolny/Wolna" );
        }

    }

    public void printBasicInfo(){
        System.out.println("Imię: "+getName());
        System.out.println("Nazwisko: "+getLastname());
        System.out.println("Zarobki: "+getWage());
    }

    public void printSpecialInfo(){
        System.out.println(getName().toUpperCase()+" "+getLastname().toUpperCase());
    }

    public boolean wageIsBigger(float wagex){
        if(wagex>this.getWage()){
            return true;
        }
        else{
            return false;
        }
    }

    public float rise(int x){
        x = x + this.getBaby()*2;
        if(this.isStan()){
            x = x + 3;
        }
        return x;


    }


}

