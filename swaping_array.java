public class swaping_array{

public static void main(String[] args) {
 
 
    int []ab={9,7,8,5};
    for(int i=0;i<4;i++)
    {
    System.out.print(ab[i]);
    }
    for(int i=0;i<3;i++)
    {
        ab[i]=ab[i+1];
    }
    System.out.println();
    for(int i=0;i<4;i++)
    {
    System.out.print(ab[i]);
    }
}
    
}