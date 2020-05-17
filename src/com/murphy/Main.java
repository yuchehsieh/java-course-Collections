package com.murphy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats); /** Shallow copy 裡面的資料是一樣的 **/
        printList(seatCopy);

        /** 展示 Collections 的 List method **/
        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre");
        printList(theatre.seats);

        /** Collections.min() Collections.max() 利用 compareTo() **/
        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        /** Collections.swap() 的功能展示 **/
        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat: list) {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println("");
        System.out.println("=======================================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for(int i=0; i<list.size() -1; i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) >0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
