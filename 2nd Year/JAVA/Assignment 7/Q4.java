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
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Exception Handled by Parent Catch block");
        }
        
    }
    
}
public class Q4{
    public static void main(String[] args) {
        SIT ob=new SIT(5,0);
        ob.Division();
    }
}
