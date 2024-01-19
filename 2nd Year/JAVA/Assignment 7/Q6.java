class SIT{
    int a,b;
    SIT(int x,int y){
        this.a=x;
        this.b=y;
    }
    public void Division(){
        try{
            System.out.println("Division of numbers= "+(a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Default Method: ");
            e.printStackTrace();
            System.out.println("ToString() Method: ");
            System.out.println(e.toString());
            System.out.println("getMessage Method: ");
            System.out.println(e.getMessage());
        }
        
    }
    
}
public class Q6{
    public static void main(String[] args) {
        SIT ob=new SIT(5,0);
        ob.Division();
    }
}
