/*
* Name: Het Patel | Edwin Abraham
* Student ID: 100849572 | 100852671
* Course: OOP3200 - 07
*
*           Lab3
* */

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args) {
        // Creating ticket_number1 object with parameterized constructor
        workticket ticket_number1 = new workticket(18572, "Client 1", LocalDate.of(2022, 4, 20), "Ticket 1 Description");
// Creating two more objects from WorkTicket class
        workticket ticket_number2 = new workticket();
        workticket ticket_number3 = new workticket();

// Declared an array of type WorkTicket and added all three objects into an array
        workticket[] tickets = new workticket[] {ticket_number1, ticket_number2, ticket_number3 };

// Created a loop to assign values to the existing WorkTicket objects by using SetWorkTicket method
        for(int i = 1; i <= tickets.length; i++) {
            tickets[i-1].SetWorkTicket(i, "Client " + i, LocalDate.of(2022, 4, i), "Problem in Work Ticket: " + i);
        }

        extendedWorkTicket ewt = new extendedWorkTicket();
        System.out.println(ewt.toString());

        ewt = new extendedWorkTicket(18572, "Client 1", LocalDate.of(2022, 4, 20), "Ticket 1 Description");
        System.out.println(ewt.toString());

        extendedWorkTicket ewtClone = new extendedWorkTicket(ewt);
        System.out.println(ewtClone.toString());
        ewtClone.SetWorkTicket(1111, "Client 2", LocalDate.of(2021, 5, 1), "extended SetWorkflowTicket");
        System.out.println(ewtClone.toString());

// Created a loop statement to print information of three objects
        for(workticket ticket : tickets) {
            System.out.println(ticket.ShowWorkTicket());
        }
    }
}