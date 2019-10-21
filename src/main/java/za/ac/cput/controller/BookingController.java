package za.ac.cput.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import za.ac.cput.exception.RecordNotFoundException;
import za.ac.cput.domain.Booking;
import za.ac.cput.service.BookingServiceImpl;



@Controller
@RequestMapping("/Border")

public class BookingController {

    @Autowired
    private BookingServiceImpl service;

    @RequestMapping
    public String getAllBooking(Model model)
    {
        List<Booking> list = service.getAllBooking();

        model.addAttribute("bookings", list);
        return "booking";
    }


    @RequestMapping(path = {"/edit", "/edit/{id}"})
    public String editBookingById(Model booking, @PathVariable("id") Optional<Long> id)
            throws RecordNotFoundException
    {
        if (id.isPresent()) {
            Booking entity = service.getBookingById(id.get());
            booking.addAttribute("booking", entity);
        } else {
            booking.addAttribute("booking", new Booking());
        }
        return "add-edit-booking";
    }

//    @PostMapping(value = "/create/{Dep}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity createInvoice(@PathVariable String invoice) {
//        System.out.println("Entered Value: " + invoice);
//        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Invoice created!");
//        Booking savedDep;
//        if (invoice == null || invoice.trim().isEmpty() || invoice.trim().equalsIgnoreCase("null")) {
//            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
//            responseObj.setResponseDescription("Provide a invoice!");
//        } else {
//            savedDep = service.retrieveBy(invoice);
//            if (savedDep != null) {
//                responseObj.setResponseDescription("Invoice already exist!");
//            } else {
//                savedDep = BookingFactory.getBooking("kjkj", "hkhjk", "123", "khsd9", 98 );
//                savedDep = service.create(savedDep);
//            }
//            responseObj.setResponse(savedDep);
//        }
//        return ResponseEntity.ok(responseObj);
//    }

//    @PostMapping
//    public BookIng create(@RequestBody BookIng booking){
//
//        return service.create(booking);
//    }

    @RequestMapping(path = "/delete/{id}")
    public String deleteBookingById(Model booking, @PathVariable("id") Long id)
            throws RecordNotFoundException
    {
        service.deleteBookingById(id);
        return "redirect:/";
    }

    @RequestMapping(path = "/createBooking", method = RequestMethod.POST)
    public String createOrUpdateBooking(Booking booking)
    {
        service.createOrUpdateBooking(booking);
        return "redirect:/";
    }

//    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity geetAll(){
//        ResponseObj responseObj = ResponseObjFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Success");
//        List<Booking> invoices = service.geetAll();
//        responseObj.setResponse(invoices);
//        return ResponseEntity.ok(responseObj);
//    }


















}
