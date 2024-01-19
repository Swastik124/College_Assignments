class something_exception extends Exception{

    public something_exception(String s) {
        super(s);
    }
}
public class Q8 {
    public static void main(String[] args) {
        try{
            throw new something_exception("something");
        }
        catch(something_exception ex){
            System.out.println("Kuch v");
            ex.printStackTrace();
        }
    }
}
