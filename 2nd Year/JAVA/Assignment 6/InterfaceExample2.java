interface Animal 
{
    void sound();
    void habitat();
    void movement();
}
interface Type extends Animal{
    void DigestiveSystems();
}
class Mammal implements Animal {
    public void sound() { System.out.println("This is a mammal's sound"); }
    public void habitat() { System.out.println("This is a mammal's habitat"); }
    public void movement() { System.out.println("This is a mammal's movement"); }
    public void DigestiveSystems(){System.out.println("This is a Mammal's Digestive System");}
}
    class Dog extends Mammal implements Type {
        public void sound() { System.out.println("This is a mammal's sound"); }
        public void habitat() {System.out.println("This is a mammal's habitat"); }
        public void movement() {System.out.println("This is a mammal's movement"); }
    }
        
public class InterfaceExample2 {
    public static void main(String[] args) {
        
    }
    
}
