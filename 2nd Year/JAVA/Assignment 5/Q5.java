class Grandfather {
    void walking() {
        System.out.println("Grandfather is walking");
    }
}

class Father extends Grandfather {
    void running() {
        System.out.println("Father is running");
    }
}

class Son extends Father {
    void jumping() {
        System.out.println("Son is jumping");
    }
}

public class Q5 {
    public static void main(String[] args) {
        Son son = new Son();
        son.walking(); // inherited from Grandfather
        son.running(); // inherited from Father
        son.jumping(); // from Son
    }
}