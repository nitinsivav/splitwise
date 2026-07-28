import java.util.Scanner;
public class SplitWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFriends = 3;

        System.out.println("=== Splitwise App ===");
        System.out.println("Track Shared Shared Expense");
        boolean run = true;
        while(run){
        System.out.println("1. Record");
        System.out.println("0. Exit");
        int ch = sc.nextInt();
        switch(ch){
            case 1->{
        System.out.print("Payer Name : ");
        String payerName = sc.nextLine();
        System.out.print("Total Amount :");
        double totalAmount = sc.nextDouble();
        double sharePerPerson = totalAmount/numFriends;

        String shareMsg = "Each person should pay %.2f".formatted(sharePerPerson);
        String expenseMsg = "%s paid %.2f".formatted(payerName,totalAmount);
        
        System.out.println(numFriends);
        System.out.println(expenseMsg);
        System.out.println(shareMsg);
            }
            case 0 -> {
                System.out.println("Goodbye...");
                run = false;
            }
        }
        }
    }
}
