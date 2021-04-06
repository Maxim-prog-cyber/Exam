package com.info.jjd.exam;

public class Application {
    public static void main(String[] args) {
        Customer customer = new Customer(20, 50);
        Customer customer1 = new Customer(22, 50);
        TypeSub day = TypeSub.ONCE;
        day.customerCan(new Customer[]{customer,customer1});

    }
}
