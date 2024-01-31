import java.util.Scanner;

class MyThread implements Runnable{
    private String Name;
    private int Rollno;
    public MyThread(int Rollno,String Name)
    {
        this.Rollno=Rollno;
        this.Name=Name;
    }
    public void run(){
        System.out.println("Roll no:"+Rollno+"Name: "+Name);
    }
}
public class Q5 {
    public static void main(String[] args) {
        MyThread mt;
        Scanner s=new Scanner(System.in);
        Thread t1=new Thread(new MyThread(1,"Mahesh"));
        Thread t2=new Thread(new MyThread(2, "Rakesh"));
        Thread t3=new Thread(new MyThread(3, "Roshina"));
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(6);
        System.out.println("Thread name: "+t1.getName());
        System.out.println("Thread name: "+t2.getName());
        System.out.println("Thread name: "+t3.getName());
        System.out.println("Priority: "+t1.getPriority());
        System.out.println("Priority: "+t2.getPriority());
        System.out.println("Priority: "+t3.getPriority());
        t2.start();
        t1.start();
        t3.start();
    }
}
