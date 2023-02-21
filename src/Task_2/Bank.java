package Task_2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);
    public Bank(String name) {
        this.name = name;
    }
    private Customer isIn(String customerName) {
        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer %s wasn't found %n", customerName);
        return null;
    }
    public void addNewCustomer(String name, double initialAmount) {
        if (isIn(name) == null) {
            Customer customer = new Customer(name, initialAmount);
            customers.add(customer);
            System.out.println("New customer added: " + customer);
        }
    }
    public void addTransaction(String name, double transactionAmount) {
        Customer customer = isIn(name);
        if (customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }
    public void printStatement(String customerName) {
        Customer customer = isIn(customerName);
        if (customer == null)  {
            return;
        }
        System.out.println("-".repeat(customer.transactions().size()));
        System.out.println("Customer name: " + customer.name());
        System.out.println("Transaction: ");
        double balance = 0.0;
        for (double d : customer.transactions()) {
            balance += d;
            System.out.printf("-%10.2f %s%n", d, d<0 ? "debit" : "credit");
        }
        System.out.printf("Balance: %10.2f$", balance);
    }
}
