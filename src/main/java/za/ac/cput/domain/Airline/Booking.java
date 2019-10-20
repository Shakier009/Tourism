//package za.ac.cput.domain.Airline;
//import java.awt.print.Book;
//import javax.persistence.*;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//@Entity
//@Table(name="Booking_Info")
//public class Booking {
//
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private String invoice;
//
//    @Column(name= "departure_Time")
//    private String  depTime;
//
//    @Column(name= "destination")
//    private String destination;
//
//    @Column(name= "bookingId")
//    private String bookingId;
//
//    @Column(name= "seatNr")
//    private int seatNr;
//
//   // @OneToMany()
//
//    public Booking() {}
//
//    private Booking(Booking.Builder builder){
//        this.depTime = builder.depTime;
//        this.invoice = builder.invoice;
//        this.destination = builder.destination;
//        this.bookingId = builder.bookingId;
//        this.seatNr = builder.seatNr;
//    }
//
//    public String getDepTime() {
//
//        return depTime;
//    }
//    public String getInvoice() {
//
//        return invoice;
//    }
//    public String getDestination() {
//
//        return destination;
//    }
//    public String getBookingId() {
//
//        return bookingId;
//    }
//    public int getSeatNr() {
//
//        return seatNr;
//    }
//
//    public void setDepTime(String depTime) {
//        this.depTime = depTime;
//    }
//
//    public void setInvoice(String invoice) {
//        this.invoice = invoice;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public void setBookingId(String bookingId) {
//        this.bookingId = bookingId;
//    }
//
//    public void setSeatNr(int seatNr) {
//        this.seatNr = seatNr;
//    }
//
//
//    public static class Builder {
//
//        private String depTime, invoice, destination, bookingId;
//        private int seatNr;
//
//
//
//
//        public Booking.Builder depTime(String depTime) {
//            this.depTime = depTime;
//            return this;
//        }
//
//        public Booking.Builder invoice(String invoice) {
//            this.invoice = invoice;
//            return this;
//        }
//
//        public Booking.Builder destination(String destination) {
//            this.destination = destination;
//            return this;
//        }
//
//        public Booking.Builder bookingId(String bookingId) {
//            this.bookingId = bookingId;
//            return this;
//        }
//
//        public Booking.Builder seatNr(int seatNr) {
//            this.seatNr = seatNr;
//            return this;
//        }
//
//        public Booking build() {
//            return new Booking(this);
//        }
//
//    }
//
//     @Override
//    public String toString() {
//        return "Booking{" +
//
//                ", Invoice Nr ='" + invoice + '\'' +
//                ", Departure Time ='" + depTime + '\'' +
//                ", Destination =" + destination +
//                ", Booking Id =" + bookingId +
//                ", Seat Nr =" + seatNr +
//                '}';
//    }
//
//
//}
