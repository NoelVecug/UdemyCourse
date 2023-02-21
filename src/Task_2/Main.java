package Task_2;

//Create a simple banking application, with a Customer and Bank type.

// The Customer will have a name, and an Arraylist of transactions containing Double wrapper elements.
//A customer's transaction can be a credit, which means a positive amount, or it can be a debit, a negative amount.

//The Bank will have a name, and an Arraylist of customers.
// - The bank should add a new customer, if they're not yet already in the list.
// - The bank class should allow a customer to add transaction, to an existing Customer.
// - This class should also print a statement, that includes the customer name, and the transaction amounts.
// This method should use unboxing.

class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Leo G.", 550.0);
        System.out.println(customer1);
        Bank bank = new Bank("Colos");
        bank.addNewCustomer("Walter W.", 10000.0);
        bank.addTransaction("Walter W.", 3000.0);
        bank.addTransaction("Walter W.", -500.0);
        bank.addTransaction("Walter W.", 20000.0);
        bank.printStatement("Walter W.");
    }
}
