package org.example.z.eca.flc.solid.srp;

public class EmailMessagingService {

    public void smsReceipt(int accountNo, String mobile){
        System.out.printf("Transaction receipt for account %s sent as SMS on mobile number %s%n", accountNo, mobile);
    }

    public void emailReceipt(int accountNo, String emailTo){
        System.out.printf("Transaction receipt for account %s sent as email on  emailId %s%n", accountNo, emailTo);
    }
}
