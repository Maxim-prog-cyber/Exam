package com.info.jjd.exam;

import java.util.Arrays;

public class Zone {
    private TypeZone typeZone;
    private Subscription[] subscriptions;
    private int size = 0;

    public Subscription[] getSubscriptions() {
        return subscriptions;
    }

    public Zone(TypeZone typeZone) {
        this.subscriptions = new Subscription[20];
        this.typeZone = typeZone;
    }

    public void addSub(Subscription subscription) { //добавить в массив абонементов

        if (size == subscriptions.length) {
            System.out.println("Зона переполнена");//проверка на вместимость
            return;
        }
        for (int i = 0; i < subscriptions.length; i++) {
            if (subscriptions[i] != null) continue;
            if (subscriptions[i] == null) {
                subscriptions[i] = subscription;
                size++;
                return;
            }
        }
    }

    public void deleteSub(Subscription[] subscription) { //удалить из массива абонементов
        for (int i = 0; i < subscription.length; i++) {
            if (subscriptions[i] == null) continue;
            if (subscriptions[i] != null) {
                subscriptions[i] = null;
            }
        }
    }


    @Override
    public String toString() {
        return "Zone{" +
                "typeZone=" + typeZone +
                ", subscriptions=" + Arrays.toString(subscriptions) +
                '}';
    }

    enum TypeZone {
        POOL,
        GROUPLESSONS,
        GYM;
    }
}
