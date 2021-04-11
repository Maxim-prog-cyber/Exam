package com.info.jjd.exam;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Objects;

public class Fitness {
    private final Zone[] zone = new Zone[3];

    public Fitness() {
        this.zone[0] = new Zone(Zone.TypeZone.GYM);
        this.zone[1] = new Zone(Zone.TypeZone.POOL);
        this.zone[2] = new Zone(Zone.TypeZone.GROUPLESSONS);
    }


    public void visitClient(Subscription subscription, Zone.TypeZone typeZone) {//в этом методы есть проверка на соотвествие зоны


        if (Objects.equals(Verification.checkSubscription(subscription, typeZone), Subscription.TypeSubscription.ONCE)) {
            System.out.println("Пожалуйста проходите в зону " + typeZone);
            registrationZone(subscription, typeZone);
            System.out.println(toString());

        } else if (Objects.equals(Verification.checkSubscription(subscription, typeZone), Subscription.TypeSubscription.DAY)) {
            System.out.println("Пожалуйста проходите в зону " + typeZone);
            registrationZone(subscription, typeZone);
            System.out.println(toString());


        } else if (Objects.equals(Verification.checkSubscription(subscription, typeZone), Subscription.TypeSubscription.FULL)) {
            System.out.println("Пожалуйста проходите в зону " + typeZone);
            registrationZone(subscription, typeZone);
            System.out.println(toString());

        } else
            System.out.println("Не получится пройти ,так как ваш абонемент " + subscription + " не соответсвует зоне " + typeZone);


    }

    private void registrationZone(Subscription subscription, Zone.TypeZone typeZone) { //в этом методе я указал в какую именно зону регистрировать
        if (typeZone.equals(Zone.TypeZone.GYM)) {
            zone[0].addSub(subscription);
            return;
        }
        if (typeZone.equals(Zone.TypeZone.POOL)) {
            zone[1].addSub(subscription);
            return;
        }
        if (typeZone.equals(Zone.TypeZone.GROUPLESSONS)) {
            zone[2].addSub(subscription);

        }
    }

    public void fitnessClose(Subscription[] subscriptions) { //при закрытии все абонемнты удаляются
        zone[0].deleteSub(subscriptions);
        zone[1].deleteSub(subscriptions);
        zone[2].deleteSub(subscriptions);
    }

    public void infoCustomer() {
        System.out.println(toString());
    }


    @Override
    public String toString() {
        return "Fitness{" +
                "zone=" + Arrays.toString(zone) +
                '}';
    }
}
