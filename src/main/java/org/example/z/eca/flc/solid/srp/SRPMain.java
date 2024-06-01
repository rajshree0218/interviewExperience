package org.example.z.eca.flc.solid.srp;

public class SRPMain {
    public static void main(String[] args) {
        BankingService bankingService = new BankingService();

        PrintService printService = new PrintService();
        SmsMessagingService smsMessagingService = new SmsMessagingService();
        EmailMessagingService emailMessagingService = new EmailMessagingService();

        bankingService.deposit(100, 50000.00);
        bankingService.withdraw(100, 25000.00);
        printService.printReceipt(100);
        smsMessagingService.smsReceipt(100, "8239147686");
        emailMessagingService.emailReceipt(100, "abc@gmail.com");

    }
}
