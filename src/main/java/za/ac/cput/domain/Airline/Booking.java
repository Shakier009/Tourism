package za.ac.cput.domain.Airline;


public class Booking {

    private String depTime, invoice, destination, bookingId;
    private int seatNr;

    private Booking () {}

    private Booking(Booking.Builder builder){
        this.depTime = builder.depTime;
        this.invoice = builder.invoice;
        this.destination = builder.destination;
        this.bookingId = builder.bookingId;
        this.seatNr = builder.seatNr;
    }

    public String getDepTime() {

        return depTime;
    }
    public String getInvoice() {

        return invoice;
    }
    public String getDestination() {

        return destination;
    }
    public String getBookingId() {

        return bookingId;
    }
    public int getSeatNr() {

        return seatNr;
    }


    public static class Builder {

        private String depTime, invoice, destination, bookingId;
        private int seatNr;
        //private Set<Tourist> tourist;


        public Booking.Builder depTime(String depTime) {
            this.depTime = depTime;
            return this;
        }

        public Booking.Builder invoice(String invoice) {
            this.invoice = invoice;
            return this;
        }

        public Booking.Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public Booking.Builder bookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Booking.Builder seatNr(int seatNr) {
            this.seatNr = seatNr;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }

    }


}
