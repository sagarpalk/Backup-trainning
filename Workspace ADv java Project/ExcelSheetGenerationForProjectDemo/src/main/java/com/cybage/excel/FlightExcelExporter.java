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

import com.cybage.model.Customer;
import com.cybage.model.Flight;
import com.cybage.model.User;
 
public class FlightExcelExporter {
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private List<Flight> listFlight;
     
    public FlightExcelExporter(List<Flight> listFlight) {
        this.listFlight = listFlight;
        workbook = new XSSFWorkbook();
    }
 
 
    private void writeHeaderLine() {
        sheet = workbook.createSheet("Flight");
         
        Row row = sheet.createRow(0);
         
        CellStyle style = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setBold(true);
        font.setFontHeight(16);
        style.setFont(font);
         
        createCell(row, 0, "flightId", style);      
        createCell(row, 1, "flightNo", style);       
        createCell(row, 2, "flightName", style);    
        createCell(row, 3, "flightSource", style);
        createCell(row, 4, "destination", style);
        createCell(row, 5, "flightType", style);
        createCell(row, 6, "flightshift", style);
        createCell(row, 7, "flightDate", style);
        createCell(row, 8, "totalseats", style);
        createCell(row, 9, "flightduration", style);
        createCell(row, 10, "flightprice", style);
        createCell(row, 11, "availableseats", style);
        createCell(row, 12, "Enabled", style);
         
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
                 
        for (Flight flight : listFlight) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;
             
            createCell(row, columnCount++, flight.getFlightId(), style);
            createCell(row, columnCount++, flight.getFlightNo(), style);
            createCell(row, columnCount++, flight.getFlightName(), style);
            createCell(row, columnCount++, flight.getFlightSource().toString(), style);
            createCell(row, columnCount++, flight.getDestination(), style);
            createCell(row, columnCount++, flight.getFlightType(), style);
            createCell(row, columnCount++, flight.getFlightshift(), style);
            createCell(row, columnCount++, flight.getFlightDate(), style);
            createCell(row, columnCount++, flight.getTotalseats(), style);
            createCell(row, columnCount++, flight.getFlightduration(), style);
            createCell(row, columnCount++, flight.getFlightprice(), style);
            createCell(row, columnCount++, flight.getAvailableseats(), style);
            createCell(row, columnCount++, flight.isEnabled(), style);
             
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