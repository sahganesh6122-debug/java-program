public class pattern3 {
    public static void main(String[]args)
    {
         char ch = 'a';
        for(int i = 1 ; i<=4 ; i++)
        {
            ch = 'a';
            for(int k=1;k<=i;k++,ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    
}
