import java.util.Scanner;
public class SplitWise {
    public static void main(String[] args) {
        Scanner sc = new Scanne(System.in);
        int numFriends = 3;
        double sharePerPerson = totalAmount/numFriend;

        System.out.println("=== Splitwise App ===");
        System.out.println("Track Shared Shared Expense");
        System.out.print("Payer Name : ");
        String payerName = sc.nextLine();
        System.out.print("Total Amount :");
        double totalAmount = sc.nextLine();

        String shareMsg = "Each person should pay %.2f".formatted(sharePerPerson);
        String expenseMsg = "%s paid %.2f".formatted(payerName,totalAmount);
        
        System.out.println(numFriends);
        System.out.println(expenseMsg);
        System.out.println(shareMsg);
    }
}
