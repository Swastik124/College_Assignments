class A{
    int p,q,sum=0;
    public void sum(int x,int y)
    {
        this.p=x;
        this.q=y;
        sum=x+y;
        System.out.println(sum);
    }
    public void sum(int s)
    {
        sum+=s;
        System.out.println("Extra Addition= "+sum);
    }
}
public class Q4 {
    public static void main(String[] args) {
        A obj=new A();
        obj.sum(2, 3);
        obj.sum(5);
    }
}
