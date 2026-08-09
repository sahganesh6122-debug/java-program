public class Method_overloadiing {
    Method_overloadiing()
    {
        System.out.println("Multiplication");
    }
    Method_overloadiing(int x, int y)
    {
    System.out.println(x*y);
    }
void add()
{
    System.out.println("addition");
}
 int add(int x , int y)
 {
    return x+y;
 }
public static void main(String[]args)
{
    Method_overloadiing n = new Method_overloadiing(); //creating a object
    n.add();
   System.out.println(n.add(5,7)); 
    Method_overloadiing m = new Method_overloadiing();
    System.out.println(m.add(2, 8));

    
} 
    
}
 
