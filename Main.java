public class Main {
    // ข. เขียน method ถอนเงิน
    public static void withdraw(double balance, double amount) {
        // ถ้า amount > balance ให้ throw exception 
        if (amount > balance) {
            throw new MyTestException("Insufficient balance", 2001); // message และ error code 
        }
        // ถ้าถอนได้ ให้แสดง Withdraw successful 
        System.out.println("Withdraw successful");
    }

    // ค. เขียน main 
    public static void main(String[] args) {
        double myBalance = 1000.0;
        double withdrawAmount = 1500.0;

        try { // ใช้ try-catch
            withdraw(myBalance, withdrawAmount); // เรียก method withdraw 
        } catch (MyTestException e) {
            // เมื่อเกิด exception ให้แสดง Error code และ Message
            System.out.println("Error code: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        }
    }
}

//68122250102 ณัฐชนันท์ จินดานิล