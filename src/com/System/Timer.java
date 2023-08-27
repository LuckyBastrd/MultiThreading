package com.System;

public class Timer extends Thread {

    private Countdown countdown;
	private int time;

    public Timer(Countdown countdown, int time) {

		this.countdown = countdown;
		this.time = time;

	}
	
    @Override
	public void run() {
		countdown.timeCountdown(time);
	}

}
