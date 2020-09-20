public class Main {
    public static void main(String[] args) {
        BankAccount samsAccount = new BankAccount("07012020", 1000.0, "Samuel Vazquez", "samuel_test@yourtests.com",
                "(778) 822-4400");

        System.out.println(samsAccount.getCustomerName());
        System.out.println(samsAccount.getNumber());
        System.out.println(samsAccount.getBalance());
        System.out.println(samsAccount.getCustomerEmailAddress());
        System.out.println(samsAccount.getCustomerPhoneNumber());

        samsAccount.withdrawal(100);
        samsAccount.deposit(3200);
        samsAccount.withdrawal(50);

        BankAccount sofiasAccount = new BankAccount("Sofia", "sofia_test@testyourapps.com", "(228) 778-0320");
        System.out.println("\n" + sofiasAccount.getNumber() + ", name " + sofiasAccount.getCustomerName() + ", email" +
                ": " + sofiasAccount.getCustomerEmailAddress() + ", phone number: " + sofiasAccount.getCustomerPhoneNumber());

        VipCustomer person1 = new VipCustomer();
        System.out.println("\n" + "Person 1: " + person1.getName());

        VipCustomer person2 = new VipCustomer("Matias","matias_test@sundaysapp.com");
        System.out.println("Person 2: " + person2.getName());

        VipCustomer person3 = new VipCustomer("Angel",100.0,"angel_@yourfavdomain.com");
        System.out.println("Person 3: " + person3.getName());

    }
}
