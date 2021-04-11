package com.info.jjd.exam;

public class Application {
    public static void main(String[] args) {
        Client customer = new Client("Dima", "Petrov", 1998);
        Subscription subscription = new Subscription(Subscription.TypeSubscription.FULL, customer);





        Fitness fitness = new Fitness();

        fitness.visitClient(subscription, Zone.TypeZone.GYM);





    }
}
