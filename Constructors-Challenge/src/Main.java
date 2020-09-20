public class Main {
    public static void main(String[] args) {
        BankAccount samsAccount = new BankAccount();
        samsAccount.setNumber("07012020");
        samsAccount.setCustomerName("Samuel Vazquez");
        samsAccount.setBalance(1000);
        samsAccount.setCustomerEmailAddress("samuel_test@yourtests.com");
        samsAccount.setCustomerPhoneNumber("(778) 822-4400");

        samsAccount.withdrawal(100);
        samsAccount.deposit(3200);
        samsAccount.withdrawal(50);
    }
}
