package ASSINGMENTS_1_B;

import java.util.*;

class Account {
    int accno;
    String accname;
    double balance;

    public Account(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }

    public static void sortAccount(Account[] accounts) {
        Arrays.sort(accounts, Comparator.comparingDouble(a -> a.balance));
    }

    public void display() {
        System.out.println("Acc No: " + accno + ", Name: " + accname + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        Account[] acc = new Account[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Account " + (i + 1));
            System.out.print("Acc No: ");
            int no = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Acc Name: ");
            String name = sc.nextLine();
            System.out.print("Balance: ");
            double bal = sc.nextDouble();

            acc[i] = new Account(no, name, bal);
        }

        sortAccount(acc);

        System.out.println("\nAccounts Sorted by Balance:");
        for (Account a : acc) {
            a.display();
        }
    }
}
