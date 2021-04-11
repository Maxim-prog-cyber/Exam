package com.info.jjd.exam;

import java.time.LocalTime;
import java.util.Objects;


public class Verification {


    public static Subscription.TypeSubscription checkSubscription(Subscription subscription, Zone.TypeZone typeZone) {
        LocalTime localTime = LocalTime.now();
        if (subscription.getType().equals(Subscription.TypeSubscription.ONCE)) {
            if (localTime.isBefore(Settings.FINISH_LESSON_FULL) && localTime.isAfter(Settings.START_LESSON)) { //здесь проверяется текущее время с временем работы зоны
                if (Objects.equals(typeZone, Zone.TypeZone.GYM) || Objects.equals(typeZone, Zone.TypeZone.POOL)) {
                    if (overdueSubscription(subscription)){ // проверка просрочен ли
                        return Subscription.TypeSubscription.ONCE;
                    }else System.out.println("Абонемент просрочен");

                }
            }
        }
        if (subscription.getType().equals(Subscription.TypeSubscription.DAY)) {
            if (localTime.isBefore(Settings.FINISH_LESSON) && localTime.isAfter(Settings.START_LESSON)) {////здесь проверяется текущее время с временем работы зоны
                if (Objects.equals(typeZone, Zone.TypeZone.GYM) || Objects.equals(typeZone, Zone.TypeZone.GROUPLESSONS)) {
                    if(overdueSubscription(subscription)){ // проверка просрочен ли
                        return Subscription.TypeSubscription.DAY;
                    }else System.out.println("Абонемент просрочен");

                }
            }
        }
        if (subscription.getType().equals(Subscription.TypeSubscription.FULL)) {
            if (localTime.isBefore(Settings.FINISH_LESSON_FULL) && localTime.isAfter(Settings.START_LESSON)) {////здесь проверяется текущее время с временем работы зоны
                if (Objects.equals(typeZone, Zone.TypeZone.GYM) || Objects.equals(typeZone, Zone.TypeZone.POOL) || Objects.equals(typeZone, Zone.TypeZone.GROUPLESSONS)) {
                    if (overdueSubscription(subscription)){ // проверка на просрочен ли
                        return Subscription.TypeSubscription.FULL;
                    }else System.out.println("Абонемент просрочен");
                }
            }
        }

        return null;
    }

    public static boolean overdueSubscription(Subscription subscription) { //проверка на просроченность
        if (subscription.getFinishDate().isAfter(subscription.getRegistrationDate())) return true;
        else return false;
    }




}

