public class brutforce {
    public static void main(String[]args){
        int p=8062;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
        {
            for(int k=0;k<10;k++)
        {
            for(int l=0;l<10;l++)
        {
            int m=i*1000+j*100+k*10+l;
            if(m==p)
            {
                System.out.println(m);
            }
        }

        }

        }

        }
    }
    
}
