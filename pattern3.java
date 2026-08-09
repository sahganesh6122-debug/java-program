public class pattern3 {
    public static void main(String[]args)
    {
        int j = 1;
        for(int i = 1 ; i<=4 ; i++)
        {
            for(int k=1;k<=i;k++,j++)
            {
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
    }
    
}
