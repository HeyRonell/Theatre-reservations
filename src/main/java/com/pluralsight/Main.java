package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

//        Asking the user for their input on name, date, and how many tickets.
        System.out.println("Whats your full name?");
        String name = read.nextLine();
        System.out.println("What date are you coming to the show?");
        String date = read.nextLine();
        System.out.println("How many tickets would you like?");
        int ticketAmount = read.nextInt();

//        Made a formatter for the date
        DateTimeFormatter inputFormat =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        This will push the proper format
        LocalDate showDate =
                LocalDate.parse(date, inputFormat);
//        Used this to separate the name into parts in an array.
        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

//        Used this to change the word depending on if its 1 or more.
        String ticketWord;
        if (ticketAmount == 1) {
            ticketWord = "ticket";
        } else {
            ticketWord = "tickets";
        }

        System.out.println(ticketAmount + " " + ticketWord + " reserved for "
        + showDate + " under " + lastName + ", " + firstName);

        //System.out.println(showDate);


        read.close();


    }
}
