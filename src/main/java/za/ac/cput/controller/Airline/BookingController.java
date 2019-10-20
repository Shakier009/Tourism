//package za.ac.cput.controller.Airline;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import za.ac.cput.domain.Airline.Booking;
//import za.ac.cput.factory.Airline.BookingFactory;
//import za.ac.cput.service.Airline.BookingService;
//import za.ac.cput.service.Airline.impl.BookingServiceImpl;
//import za.ac.cput.domain.ResponseObj;
//import za.ac.cput.factory.ResponseObjFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import za.ac.cput.exception.RecordNotFoundException;
//
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.*;
//
//
//import java.awt.print.Book;
//import java.util.List;
//import java.util.Optional;
//
//
//
//@RestController
//@RequestMapping("/")
//
//public class BookingController {
//
//    @Autowired
//    private BookingServiceImpl service;
//
//    @RequestMapping
//    public String getAllBooking(Model booking)
//    {
//        List<Booking> list = service.getAllBooking();
//
//        booking.addAttribute("booking", list);
//        return "bookings";
//    }
//
//
//    @RequestMapping(path = {"/edit", "/edit/{id}"})
//    public String editBookingById(Model booking, @PathVariable("id") Optional<String> invoice)
//            throws RecordNotFoundException
//    {
//        if (invoice.isPresent()) {
//            Booking entity = service.getBookingById(invoice.get());
//            booking.addAttribute("booking", entity);
//        } else {
//            booking.addAttribute("booking", new Booking());
//        }
//        return "add-edit-booking";
//    }
//
////    @PostMapping(value = "/create/{Dep}", produces = MediaType.APPLICATION_JSON_VALUE)
////    public ResponseEntity createInvoice(@PathVariable String invoice) {
////        System.out.println("Entered Value: " + invoice);
////        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Invoice created!");
////        Booking savedDep;
////        if (invoice == null || invoice.trim().isEmpty() || invoice.trim().equalsIgnoreCase("null")) {
////            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
////            responseObj.setResponseDescription("Provide a invoice!");
////        } else {
////            savedDep = service.retrieveBy(invoice);
////            if (savedDep != null) {
////                responseObj.setResponseDescription("Invoice already exist!");
////            } else {
////                savedDep = BookingFactory.getBooking("kjkj", "hkhjk", "123", "khsd9", 98 );
////                savedDep = service.create(savedDep);
////            }
////            responseObj.setResponse(savedDep);
////        }
////        return ResponseEntity.ok(responseObj);
////    }
//
////    @PostMapping
////    public BookIng create(@RequestBody BookIng booking){
////
////        return service.create(booking);
////    }
//
//    @RequestMapping(path = "/delete/{id}")
//    public String deleteBookingById(Model booking, @PathVariable("id") String invoice)
//            throws RecordNotFoundException
//    {
//        service.deleteBookingById(invoice);
//        return "redirect:/";
//    }
//
//    @RequestMapping(path = "/createBooking", method = RequestMethod.POST)
//    public String createOrUpdateBooking(Booking booking)
//    {
//        service.createOrUpdateBooking(booking);
//        return "redirect:/";
//    }
//
////    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
////    public ResponseEntity geetAll(){
////        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Success");
////        List<Booking> invoices = service.geetAll();
////        responseObj.setResponse(invoices);
////        return ResponseEntity.ok(responseObj);
////    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
