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

import com.cybage.excel.FlightExcelExporter;
import com.cybage.model.Flight;
import com.cybage.service.FlightService;
 
@Controller
public class FlightController {
 
    @Autowired
    private FlightService flightService;
     
     
    @GetMapping("/flight/export")
    public void exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());
         
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=flight_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
        List<Flight> listflight= flightService.listAllFlight();
         
       FlightExcelExporter excelExporter = new FlightExcelExporter(listflight);
         
       excelExporter.export(response);    
    }  
 
}