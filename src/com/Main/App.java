package com.Main;

// Nama	    : Muhammad Rafi Khairunizham
// NIM	    : 2502025025
// Kelas	: LH01

import com.System.Timer;
import java.util.Scanner;
import com.System.Countdown;

public class App {
    public static void main(String[] args) {

        Countdown countdown = new Countdown();

        Scanner scan = new Scanner( System.in );

        System.out.printf( "Set Your Timer(in Seconds): " );
        int time = scan.nextInt();
        
        Timer thread = new Timer(countdown, time);
        thread.run();
        
        scan.close();
    }
}
