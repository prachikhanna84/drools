package com.prachi.sample.kieSessionExample;

public class Payment {

    public String channel;
    public int discount;
    public int specialOffer;

    public int getSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(int specialOffer) {
        this.specialOffer = specialOffer;
    }


    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
