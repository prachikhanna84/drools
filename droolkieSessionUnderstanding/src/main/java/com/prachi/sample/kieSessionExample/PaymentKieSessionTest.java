package com.prachi.sample.kieSessionExample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class PaymentKieSessionTest {

    public static void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            // Statefull Session
            KieSession kSession = kContainer.newKieSession("first-ksession-rule");

            Payment paymentOffer = new Payment();
            Discount discount = new Discount();
            paymentOffer.setChannel("googlePay");
            paymentOffer.setSpecialOffer(30);
            discount.setMerchantName("googlePay");

            kSession.insert(paymentOffer);
            kSession.insert(discount);
            kSession.fireAllRules();

            System.out.println("The cashback for this payment channel VIA KIE " + paymentOffer.getChannel() + " is " + paymentOffer.getDiscount() + " merchange cut of is " + discount.getMerchantCutOff());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
