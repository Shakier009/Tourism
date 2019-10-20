//package za.ac.cput.service.Airline.impl;
//
//import za.ac.cput.domain.Airline.Booking;
//import za.ac.cput.repository.Airline.BookingRepository;
////import za.ac.cput.repository.impl.Airline.BookingRepositoryImpl;
//import za.ac.cput.service.Airline.BookingService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//import za.ac.cput.domain.Airline.Booking;
//import za.ac.cput.service.IService;
//import za.ac.cput.exception.RecordNotFoundException;
//import za.ac.cput.repository.Airline.BookingRepository;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.awt.print.Book;
//import java.util.List;
//import java.util.Set;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//
//@Service
//public class BookingServiceImpl implements BookingService{
//    private static BookingServiceImpl service = null;
//
//    @Autowired
//
//    private BookingRepository bookingRepository;
//
//    private BookingServiceImpl (){}
//
//    public List<Booking> getAllBooking()
//    {
//        List<Booking> result = (List<Booking>) bookingRepository.findAll();
//
//        if(result.size() > 0) {
//            return result;
//        } else {
//            return new ArrayList<Booking>();
//        }
//    }
//
//    public Booking getBookingById(String invoice) throws RecordNotFoundException
//    {
//        Optional<Booking> booking = bookingRepository.findById(invoice);
//
//        if(booking.isPresent()) {
//            return booking.get();
//        } else {
//            throw new RecordNotFoundException("No Booking exist for given invoive");
//        }
//    }
//
//    public Booking createOrUpdateBooking(Booking entity)
//    {
//        if(entity.getInvoice()  == null)
//        {
//            entity = bookingRepository.save(entity);
//
//            return entity;
//        }
//        else
//        {
//            Optional<Booking> booking = bookingRepository.findById(entity.getInvoice());
//
//            if(booking.isPresent())
//            {
//                Booking newEntity = booking.get();
//                newEntity.setDepTime(entity.getDepTime());
//                newEntity.setBookingId(entity.getBookingId());
//                newEntity.setDestination(entity.getDestination());
//                newEntity.setInvoice(entity.getInvoice());
//                newEntity.setSeatNr(entity.getSeatNr());
//
//                newEntity = bookingRepository.save(newEntity);
//
//                return newEntity;
//            } else {
//                entity = bookingRepository.save(entity);
//
//                return entity;
//            }
//        }
//    }
//
//    public void deleteBookingById(String invoice) throws RecordNotFoundException
//    {
//        Optional<Booking> booking = bookingRepository.findById(invoice);
//
//        if(booking.isPresent())
//        {
//            bookingRepository.deleteById(invoice);
//        } else {
//            throw new RecordNotFoundException("No Booking exist for given invoive");
//        }
//    }
//
//    public static BookingServiceImpl getService(){
//        if (service == null) service = new BookingServiceImpl();
//        return service;
//    }
//
//    @Override
//    public Booking create(Booking booking) {
//        return bookingRepository.save(booking);
//    }
//
//    @Override
//    public Booking update(Booking booking) {
//        return bookingRepository.save(booking);
//    }
//
//    @Override
//    public void delete(String s) {
//        bookingRepository.deleteById(s);
//
//    }
//
//    @Override
//    public Booking read(String s) {
//        Optional<Booking> optGender = this.bookingRepository.findById(s);
//
//        return optGender.orElse(null);
//    }
//
//    @Override
//    public Booking retrieveBy(String depte) {
//        List<Booking> dept = geetAll();
//        for (Booking dep : dept) {
//            if (dep.getDepTime().equalsIgnoreCase(depte)) return dep;
//        }
//        return null;
//    }
//
//    @Override
//    public List<Booking> geetAll() {
//        return (List<Booking>) bookingRepository.findAll();
//    }
//
//}
