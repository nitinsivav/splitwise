package app;

import java.util.ArrayList;
import java.util.Scanner;
import model.ExpenseLine;
import model.Friend;
public class SplitWise {

    public static void addFriends(ArrayList<Friend> friends, String friendName) {
        Friend friend = new Friend(friendName);
        friends.add(friend);
    }

    private static class FriendDisplay{
        public static void addedMessage(Friend friend){
            System.out.println("%s added to friends list with ID %d.".formatted(friend.getName(),friend.getId()));
        }

        public static void listFriends(ArrayList<Friend> friends){
            System.out.println("Friends List");
            for (Friend friend : friends) {
                System.out.println(" - %d : %s".formatted( friend.getId(), friend.getName()));
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Friend> friends = new ArrayList<>();
        int numFriends = 0;

        System.out.println("=== Splitwise App ===");
        System.out.println("Track Shared Shared Expense");
        boolean run = true;
        while(run){
            System.out.println("1. Record");
            System.out.println("2. Add Friends");
            System.out.println("3. List Friends");
            System.out.println("0. Exit");
            System.out.print("Enter Choice : ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch(ch){
                case 1->{
                    
                    if(friends.isEmpty()){
                        System.out.println("No friends added yet. Please add friends first.");
                    }

                    System.out.print("Payer Name : ");
                    String payerName = sc.nextLine();
                    System.out.print("Total Amount :");
                    double totalAmount = sc.nextDouble();
                    ExpenseLine expenseLine = new ExpenseLine(payerName,totalAmount);
                    numFriends = friends.size(); 
                    double sharePerPerson = expenseLine.totalAmount()/numFriends;
                

                    String shareMsg = "Each person should pay %.2f".formatted(sharePerPerson);
                    String expenseMsg = "%s paid %.2f".formatted(expenseLine.payerName(),expenseLine.totalAmount());
                    
                    System.out.println(friends.size());
                    System.out.println(expenseMsg);
                    System.out.println(shareMsg);
            }
                case 2 -> {
                    System.out.print("Enter Friend Name : ");
                    String friendName = sc.nextLine();
                    addFriends(friends, friendName);
                    numFriends++;
                    FriendDisplay.addedMessage(friends.get(numFriends - 1));
            }
                case 3 -> {

                    if(friends.isEmpty()){
                        System.out.println("No friends added yet. Please add friends first.");
                    }

                    System.out.println("Friends List");
                    FriendDisplay.listFriends(friends);

                }
                case 0 -> {
                    System.out.println("Goodbye...");
                    run = false;
            }
        }
        }
    }
}
