class Student{
    String name;
    int age;
    public  void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("constructor");

    }
}
class Oops{
    public static void main(String[] args) {
        Student S1=new Student();
        S1.name="Aniruddh";
        S1.age=112;
        S1.printInfo();
        
    }
}