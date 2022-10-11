package com.cybage.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
 
import javax.servlet.http.HttpServletResponse;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cybage.excel.BookingExcelExporter;
import com.cybage.excel.CustomerExcelExporter;
import com.cybage.model.Booking;
import com.cybage.model.Customer;
import com.cybage.model.Flight;
import com.cybage.model.User;
import com.cybage.repository.BookingRepository;
import com.cybage.service.BookingService;
import com.cybage.service.CustomerService;
 
@Controller
public class BookingController {
 
    @Autowired
    private BookingService bookingService;
     
     
    @GetMapping("/booking/export/excel")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
        List<Booking> listBooking = bookingService.listAllBooking();
         
        BookingExcelExporter excelExporter = new BookingExcelExporter(listBooking);
         
        excelExporter.export(response);   
    }  
 
}