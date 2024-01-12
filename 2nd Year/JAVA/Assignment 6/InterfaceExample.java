interface Animal 
{
    void sound();
    void habitat();
    void movement();
    void DigestiveSystems();
}
class Cat implements Animal{
    public void sound(){
        System.out.println("Meow...");
    }
    public void habitat(){
        System.out.println("Living in houses or Streets");
    }
    public void movement(){
        System.out.println("Walk");
    }
    public void DigestiveSystems()
    {
        System.out.println("Omnivores");
    }
}
class Dog implements Animal{
    public void sound(){
        System.out.println("bhow.. bhow...");
    }
    public void habitat(){
        System.out.println("Living in houses or Streets");
    }
    public void movement(){
        System.out.println("Walk");
    }
    public void DigestiveSystems()
    {
        System.out.println("Omnivores");
    }
}
class Tiger implements Animal{
    public void sound(){
        System.out.println("Aaaghhh...");
    }
    public void habitat(){
        System.out.println("Living in Forests");
    }
    public void movement(){
        System.out.println("Walk");
    }
    public void DigestiveSystems()
    {
        System.out.println("Carnivores");
    }
}
class Cow implements Animal{
    public void sound(){
        System.out.println("Mowwww...");
    }
    public void habitat(){
        System.out.println("Living in farms or barns.");
    }
    public void movement(){
        System.out.println("Walk");
    }
    public void DigestiveSystems()
    {
        System.out.println("Herbivores");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Animal ob1=new Cow();
        Animal ob2=new Cat();
        Animal ob3=new Tiger();
        Animal ob4=new Dog();
        System.out.println("Cow Characterstics= ");
        ((Cow)ob1).sound();
        ((Cow)ob1).habitat();
        ((Cow)ob1).movement();
        ((Cow)ob1).DigestiveSystems();
        System.out.println("Dog Characterstics= ");
        ((Dog)ob4).sound();
        ((Dog)ob4).habitat();
        ((Dog)ob4).movement();
        ((Dog)ob4).DigestiveSystems();
        System.out.println("Cat Characterstics= ");
        ((Cat)ob2).sound();
        ((Cat)ob2).habitat();
        ((Cat)ob2).movement();
        ((Cat)ob2).DigestiveSystems();
        System.out.println("Tiger Characterstics= ");
        ((Tiger)ob3).sound();
        ((Tiger)ob3).habitat();
        ((Tiger)ob3).movement();
        ((Tiger)ob3).DigestiveSystems();
    }
    
}
