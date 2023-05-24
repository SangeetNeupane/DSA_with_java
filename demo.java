class r1{
    int a=1;
    void display()
    {
        System.out.println(a++);
    }

}
public class demo {
    public static void main(String[]args)
    {
        r1 r=new r1();
        r.display();
    }
}
