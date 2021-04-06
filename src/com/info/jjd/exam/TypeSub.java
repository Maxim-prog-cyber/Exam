package com.info.jjd.exam;

import java.time.LocalTime;

public enum TypeSub {
    ONCE{
        @Override
        public void customerCan(Customer[] customers) {
            LocalTime starLesson = LocalTime.of(8,0);
            LocalTime finishLesson = LocalTime.of(22,0);


            for (int i = 0; i < customers.length; i++) {
                boolean before = customers[i].getCurrentTime().isBefore(finishLesson);
                boolean after = customers[i].getCurrentTime().isAfter(starLesson);
                System.out.println(before + " " + after);
                if (before && after) {
                    System.out.println(customers[i] + "может посещать тренажерный зал и бассеин");
                }
                else System.out.println(customers[i] + "не может посещать тренажерный зал и бассеин");
            }



        }
    },
    DAY {
        @Override
        public void customerCan(Customer[] customers) {

        }
    },
    FULL {
        @Override
        public void customerCan(Customer[] customers) {

        }
    };



    public abstract void customerCan(Customer[] customers);



}
