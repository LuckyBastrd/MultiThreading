package com.System;

public class Countdown {

	public synchronized void timeCountdown(int time) {

		if (time > 0) 
        {
            System.out.println();

            System.out.println("Timer Start From " + time);

            System.out.println();

            for (int i = time; i >= 0; i--) {

                System.out.printf("%d ", i);
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (i != time && i % 10 == 0) {
                    System.out.println();
                }

            }

            System.out.println();

            System.out.println("Timer Done");

            System.out.println();

		} 

        else 
        {
            System.out.println();

			System.out.println("Time entered cannot be used");

            System.out.println();
	    }

    }
    
    
}
