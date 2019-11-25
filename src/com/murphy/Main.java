package com.murphy;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Taipei", 8, 12);
//	    theatre.getSeats();

	    if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }

    }
}
