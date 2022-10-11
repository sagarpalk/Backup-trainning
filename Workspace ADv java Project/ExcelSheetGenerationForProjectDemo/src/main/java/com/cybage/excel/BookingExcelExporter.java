package com.cybage.excel;

import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.cybage.model.Booking;
import com.cybage.model.Customer;
import com.cybage.model.User;
 
public class BookingExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<Booking> listBooking;
     
    public BookingExcelExporter(List<Booking> listBooking) {
        this.listBooking = listBooking;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("Booking");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        createCell(row, 0, "bookingId", style);      
        createCell(row, 1, "bookingDate", style);       
        createCell(row, 2, "numberofSeats", style);    
        createCell(row, 3, "totalAmount", style);
        createCell(row, 4, "customer", style);
        createCell(row, 5, "flight", style);
        
         
    }
     
    private void createCell(Row row, int columnCount, Object value, CellStyle style) {
        sheet.autoSizeColumn(columnCount);
        Cell cell = row.createCell(columnCount);
        if (value instanceof Integer) {
            cell.setCellValue((Integer) value);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
        }else {
            cell.setCellValue((String) value);
        }
        cell.setCellStyle(style);
    }
     
    private void writeDataLines() {
        int rowCount = 1;
 
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontHeight(14);
        style.setFont(font);
                 
        for (Booking booking : listBooking) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, booking.getBookingId(), style);
            createCell(row, columnCount++, booking.getBookingDate(), style);
            createCell(row, columnCount++, booking.getNumberofSeats(), style);
            createCell(row, columnCount++, booking.getTotalAmount(), style);
            createCell(row, columnCount++, booking.getCustomer().getUserName(), style);
            createCell(row, columnCount++, booking.getFlight().getFlightName(), style);
            
             
        }
    }
     
    public void export(HttpServletResponse response) throws IOException {
        writeHeaderLine();
        writeDataLines();
         
        ServletOutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
         
        outputStream.close();
         
    }
}