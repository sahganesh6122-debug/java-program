// public class hellow {
//     public static void main(String[] args){
//     // System.out.println("hellow world");
//     String name = "gannu bhai";
//     int gta = 6;
//     double pi = 199.99;
//     char gender = 'M';
//     boolean isAdmin = true;
//     if(isAdmin)
//     System.out.println(name+" "+"is a GTA "+gta+" player bought at $"+pi+" he is a "+gender);
// else
//     System.out.println("he is a froud");

//     }
// }
//PIZZA Shop program
import java.util.*;  
public class hellow{
    public static void main(String[]args)
    {
       
        Random rndm = new Random();
        int coin = rndm.nextInt(1,7);
        if(coin == 1||coin==6)
        {
            System.out.println("DOG");
        }
        else if(coin == 2|| coin==4)
            System.out.println("CAT");
        else
            System.out.println("PIG");
    }

}