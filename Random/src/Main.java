import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Reservation[] reservations = new Reservation[10];
        int reservationCount = 0;

        int choice;
        do {
            System.out.println("1. Create new Reservation");
            System.out.println("2. Display all Reservations");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if(choice == 1) {
                        System.out.print("Hotel Name: ");
                        String hotelName = input.next();
                        System.out.print("Reservation Month: ");
                        String reservationMonth = input.next();
                        System.out.print("Reservation Start: ");
                        int reservationStart = input.nextInt();
                        System.out.print("Reservation End: ");
                        int reservationEnd = input.nextInt();
                        System.out.print("Daily Cost: ");
                        int dailyCost = input.nextInt();

                        reservations[reservationCount] = new Reservation(hotelName, reservationMonth, reservationStart, reservationEnd, dailyCost);
                        reservationCount++;

                        System.out.println("Reservation created!");
                    }
            else if(choice == 2) {
                    for (int i = 0; i < reservationCount; i++) {
                        Reservation reservation = reservations[i];
                        System.out.printf("Reservation for %s starts on %s %d and ends on %s %d. Reservation has a total cost of $%d.%n",
                                reservation.getHotelName(), reservation.getReservationMonth(), reservation.getReservationStart(),
                                reservation.getReservationMonth(), reservation.getReservationEnd(), reservation.calculateTotalPrice());
                    }
            }
            else if(choice == 0) {
            	System.out.println("Goodbye!");
            }
            System.out.println();
        } while (choice != 0);
    }

}



