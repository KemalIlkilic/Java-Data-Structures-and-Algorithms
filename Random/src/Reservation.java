public class Reservation {
    String hotelName;
    String reservationMonth;
    int reservationStartDay;
    int reservationEndDay;
    int dailyCost;
    int totalCost;

    public Reservation(String hotelName, String reservationMonth, int reservationStartDay, int reservationEndDay, int dailyCost) {
        this.hotelName = hotelName;
        this.reservationMonth = reservationMonth;
        this.reservationStartDay = reservationStartDay;
        this.reservationEndDay = reservationEndDay;
        this.dailyCost = dailyCost;
        calculateTotalPrice();
    }
    public String getHotelName() {
        return hotelName;
    }

    public String getReservationMonth() {
        return reservationMonth;
    }

    public int getReservationStart() {
        return reservationStartDay;
    }

    public int getReservationEnd() {
        return reservationEndDay;
    }

    public int getDailyCost() {
        return dailyCost;
    }

    public int calculateTotalPrice() {
        int numDays = reservationEndDay - reservationStartDay;
        totalCost = numDays * dailyCost;
        return totalCost;
    }

    public void displayInfo() {
        System.out.println("Reservation for " + hotelName + " starts on " + reservationMonth + " " + reservationStartDay + " and ends on " + reservationMonth + " " + reservationEndDay + ". Reservation has a total cost of $" + totalCost + ".");
    }
}
