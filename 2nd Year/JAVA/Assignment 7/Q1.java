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
            e.printStackTrace();
            System.out.println("Exception Handled");
        }
        
    }
    
}
public class Q1{
    public static void main(String[] args) {
        SIT ob=new SIT(5,0);
        ob.Division();
    }
}