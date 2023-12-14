class pen
{
    String color;
    String type;

    public void write(){
        System.out.println("hello pen");
    }
    public void printcolor(){
        System.out.println(this.color); 
    }
}
class object_1
{
    public static void main(String[] args) 
    {
        pen sc = new pen();
        sc.color = "nblack";
        sc.type = " gel";
        pen cs=new pen();
        cs.color="black";
        cs.type="ball";
        sc.printcolor();
        cs.printcolor();
        sc.write();
    }

}