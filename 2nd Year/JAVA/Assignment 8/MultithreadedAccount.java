class Account {
    private int accNo;
    private double accBbalance;

    public Account(int accNo, double accBbalance) {
        this.accNo = accNo;
        this.accBbalance = accBbalance;
    }

    public synchronized void deposit(double amount) {
        accBbalance += amount;
        System.out.println("Thread "+Thread.currentThread().getId() +" made a deposit. The updated balance is: " + accBbalance);
    }
}

public class MultithreadedAccount implements Runnable {
    private Account account;

    public MultithreadedAccount(Account account) {
        this.account = account;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(200);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Account account = new Account(123456, 5000);
        Thread t1 = new Thread(new MultithreadedAccount(account));
        //Thread t2 = new Thread(new MultithreadedAccount(account));
        t1.start();
    }
}