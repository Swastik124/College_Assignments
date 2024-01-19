import java.util.Scanner;
class TooOldException extends Exception{
    public TooOldException(String s)
    {
        super(s);
    }
}
class TooYoungException extends Exception{
    public TooYoungException(String s)
    {
        super(s);
    }
}
class ArmyJobAgeCriteria{
        public int age;
        Scanner sc=new Scanner(System.in);
        public void checkAge(){
            System.out.println("Enter the Age of the Candidate");
            int age=sc.nextInt();
            if(age>18 && age<28)
            {
                System.out.println("Congratulations you are eligible");
            }
            else if(age>=28)
            {
                try{
                    throw new TooOldException("Too Old For This Service");
                }
                catch(TooOldException e)
                {
                    System.out.println("You are no more eligible");
                    e.printStackTrace();
                }
            }
            else{
                try{
                    throw new TooYoungException("Too Young for this Service");
                }
                catch(TooYoungException e)
                {
                    System.out.println("try again next year when you turn 19");
                    e.printStackTrace();
                }
                    
            }
        }
        public static void main(String[] args)
        {
            ArmyJobAgeCriteria ob=new ArmyJobAgeCriteria();
            ob.checkAge();
        }
    }