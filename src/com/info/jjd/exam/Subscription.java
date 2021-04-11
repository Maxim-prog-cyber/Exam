package com.info.jjd.exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Subscription {
    private TypeSubscription type;
    private Client customer;
    private LocalDateTime registrationDate;
    private LocalDateTime finishDate;

    Subscription(TypeSubscription type, Client customer) {
        this.type  = type;
        setCustomer(customer);
        this.registrationDate = LocalDateTime.now();
        this.finishDate = registrationDate.plusYears(1);
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public LocalDateTime getFinishDate() {
        return finishDate;
    }

    public void setCustomer(Client customer) {
        Objects.requireNonNull(customer,"customer не может быть null");
        this.customer = customer;
    }

    public TypeSubscription getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "type=" + type +
                ", customer=" + customer +
                ", startCurrentTime=" + registrationDate +
                ", finishTime=" + finishDate +
                '}';
    }


    enum TypeSubscription {
        ONCE,
        DAY,
        FULL;
    }
}




