package com.capitalone.sample.simpleDrool;

public class Customer {

    public boolean newCustomer;
    public float totalSpending;
    public boolean customerBirthDayToday;
    public int discount;

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setNewCustomer(boolean newCustomer) {
        this.newCustomer = newCustomer;
    }

    public void setTotalSpending(float totalSpending) {
        this.totalSpending = totalSpending;
    }

    public boolean isCustomerBirthDayToday() {
        return customerBirthDayToday;
    }

    public void setCustomerBirthDayToday(boolean customerBirthDayToday) {
        this.customerBirthDayToday = customerBirthDayToday;
    }
}
