class pen
{
    String color;
    String type;

    public void write(){
        System.out.println("hello pen");
    }
}
public class object_1
{
    public static void main(String[] args) 
    {
        pen sc = new pen();
        sc.color = "nblack";
        sc.type = " gel";

        sc.write();
    }

}