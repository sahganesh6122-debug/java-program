public class fibbo_5th {
    static int fibbo(int n)
    {
        if(n==0)
        return 0;
        if(n==1)
            return 1;
else
            return fibbo(n-1) + fibbo(n-2);
        
    }
    public static void main(String[] args) {
        System.out.println(fibbo_5th.fibbo(5));
    }
}
