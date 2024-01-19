class Test{
    void test(){
        try{
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e){
            System.out.println("caught inside test() method");
            System.out.println(e.getMessage());
            throw e;
    }
}
}
public class Q7{
    public static void main(String[] args) {
        Test ob=new Test();
        ob.test();
    }
}
