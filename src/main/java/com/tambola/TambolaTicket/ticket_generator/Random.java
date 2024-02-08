package com.tambola.TambolaTicket.ticket_generator;

public class Random {
    static int getRand(int min, int max) {
        java.util.Random rand = new java.util.Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
