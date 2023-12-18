public class Test
{
 static int count = 100;
 public void increment() 
 {
 count++;
 }
 public static void main(String []args)
 {
 Test obj1=new Test(); 
 obj1.increment(); 
 Test obj2 = new Test();
 System.out.println(obj2.count); 
 }
}
