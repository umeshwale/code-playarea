package com.example.springbootscheduler.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Calendar;

@Component
public class FixedRateSchedule {

    //Execute a task at a fixed interval of time:
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
      System.out.println("The Fixed RATE time is :: "+ Calendar.getInstance().getTime());
    }

    /*
        Configure a task to run after a fixed delay.
        In given example, the duration between the end of last execution and the start of next execution is fixed.
        The task always waits until the previous one is finished.

     */
    @Scheduled(fixedDelay = 3000)
    public void run() {
        System.out.println("The Fixed DELAY time is :: " + Calendar.getInstance().getTime());
    }

    /*
        "0 0 * * * *" = the top of every hour of every day.
        "0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day.
        "0 0 6,19 * * *" = 6:00 AM and 7:00 PM every day.
        "0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30, 10:00 and 10:30 every day.
        "0 0 9-17 * * MON-FRI" = on the hour nine-to-five weekdays
        "0 0 0 25 12 ?" = every Christmas Day at midnight
     */
    @Scheduled(cron = "*/2 * * * * *")
    public void cronrun() {
        System.out.println("Current CRON time is :: " + Calendar.getInstance().getTime());
    }
}
