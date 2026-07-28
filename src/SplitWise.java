import java.util.ArrayList;
import java.util.Scanner;
public class SplitWise {

    public static void addFriends(ArrayList<String> friends, String friendName) {
        friends.add(friendName);
        System.out.println("%s added to friends list.".formatted(friendName));
    }

    public static void listFriends(ArrayList<String> friends) {
        System.out.println("=== Friends List ===");
        for (String friend : friends) {
            System.out.println(" - " + friend);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<>();

        System.out.println("=== Splitwise App ===");
        System.out.println("Track Shared Shared Expense");
        boolean run = true;
        while(run){
            System.out.println("1. Record");
            System.out.println("2. Add Friends");
            System.out.println("3. List Friends");
            System.out.println("0. Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch(ch){
                case 1->{
                    
                    if(friends.size() == 0){
                        System.out.println("No friends added yet. Please add friends first.");
                        break;
                    }

                    System.out.print("Payer Name : ");
                    String payerName = sc.nextLine();
                    System.out.print("Total Amount :");
                    double totalAmount = sc.nextDouble();
                    double sharePerPerson = totalAmount/friends.size();

                    String shareMsg = "Each person should pay %.2f".formatted(sharePerPerson);
                    String expenseMsg = "%s paid %.2f".formatted(payerName,totalAmount);
                    
                    System.out.println(friends.size());
                    System.out.println(expenseMsg);
                    System.out.println(shareMsg);
            }
                case 2 -> {
                    System.out.print("Enter Friend Name : ");
                    String friendName = sc.nextLine();
                    addFriends(friends, friendName);
            }
                case 3 -> {

                    if(friends.size() == 0){
                        System.out.println("No friends added yet. Please add friends first.");
                        break;
                    }

                    listFriends(friends);
                }
                case 0 -> {
                    System.out.println("Goodbye...");
                    run = false;
            }
        }
        }
    }
}
