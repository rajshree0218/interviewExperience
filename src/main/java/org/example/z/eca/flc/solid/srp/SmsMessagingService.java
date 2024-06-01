package org.example.z.eca.flc.solid.srp;

public class SmsMessagingService {

    public void smsReceipt(int accountNo, String mobile){
        System.out.printf("Transaction receipt for account %s sent as SMS on mobile number %s%n", accountNo, mobile);
    }

}
