import java.util.Scanner;
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
public BankAccount(String accountNumber, String accountHolder, double balance)
{
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
}
public double getBalance()
{
return balance;
}
public void deposit(double amount)
{
    if (amount > 0)
    {
    balance += amount;
    System.out.println("Deposit successful. New balance: $" + balance);
    } 
else 
{
System.out.println("Invalid amount. Please enter a positive value.");
}
}
public void withdraw(double amount)
{
    if (amount > 0 && amount <= balance)
    {
    balance -= amount;
    System.out.println("Withdrawal successful. New balance: $" + balance);
    } 
    else if (amount <= 0) 
    {
    System.out.println("Invalid amount. Please enter a positive value.");
    } 
    else 
    {
    System.out.println("Insufficient funds. Withdrawal failed.");
    }
    }
}
class ATM {
private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args)
{
BankAccount userAccount = new BankAccount("123456789", "John Doe", 1000);
displayMenu(userAccount);
}
private static void displayMenu(BankAccount account)
{
int choice;
    do {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                checkBalance(account);
                break;
            case 2:
                deposit(account);
                break;
            case 3:
                withdraw(account);
                break;
            case 4:
                System.out.println("Exiting. Thank you!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
        } 
    while (choice != 4);
    }
private static void checkBalance(BankAccount account) 
{
    System.out.println("Your balance is: $" + account.getBalance());
}
private static void deposit(BankAccount account) 
{
    System.out.print("Enter the deposit amount: $");
    double amount = scanner.nextDouble();
    account.deposit(amount);
}
private static void withdraw(BankAccount account) 
{
System.out.print("Enter the withdrawal amount: $");
double amount = scanner.nextDouble();
account.withdraw(amount);
}
}

