class Aniruddh {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Aniruddh(int age, String name,int year) {
        this.name = name;
        this.age = age;
    }
}

class Oops {
    public static void main(String[] args) {
        Aniruddh S1 = new Aniruddh(2679542,"ani",2023);
        S1.printInfo();
    }
}