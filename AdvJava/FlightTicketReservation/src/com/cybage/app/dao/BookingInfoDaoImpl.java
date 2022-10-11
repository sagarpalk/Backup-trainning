package com.cybage.app.dao;

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.xml.crypto.Data;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.apache.catalina.valves.rewrite.Substitution.StaticElement;

import com.cybage.app.model.BookingInfo;
import com.cybage.app.service.BookTicketService;
import com.cybage.app.utilities.JDBCconnectivity;

public class BookingInfoDaoImpl implements BookingInfoDao
{

	@Override
	public BookingInfo findBookinInfoById(int ticketId) throws SQLException {
		Connection connection=JDBCconnectivity.getConnection();
		
	
		PreparedStatement rs= connection.prepareStatement("select tr_ticketrecordid,fl_name,fl_service,fl_flighttype,sc_departdate,sc_departtime,sc_arrivaldate,sc_arrivaltime,sc_flightstop,r_source,r_destination,u_firstname,u_lastname,tr_class,tr_numtickets,p_economy,p_premium,p_business,s_economy,s_premium,s_business,tr_seattype,o_name,o_rate from ticket_record join (schedule join (flight join seat on flight.fl_seatid =seat.s_seatid) on schedule.sc_flightid=flight.fl_flightid join (route join price on route.r_priceid=price.p_priceid) on schedule.sc_routeid=route.r_routeid) join offer on schedule.sc_offerid=offer.o_offerid on  ticket_record.tr_scheduleid= schedule.sc_scheduleid join user on ticket_record.tr_userid=user.u_userid where  tr_ticketrecordid=?;");
		      rs.setInt(1, ticketId);
		   ResultSet data= rs.executeQuery();
		  while(data.next()) {
			  int Ticketid=data.getInt(1);
			  String flightName=data.getString(2);
			  String seviceCompany=data.getString(3);
			  String flightType=data.getString(4);
			   Date departDate=data.getDate(5);
			   Time departTime=data.getTime(6);
			   Date arrivalDate=data.getDate(7);
			   Time arrivalTime=data.getTime(8);
			   String typeStop=data.getString(9);
			   String source=data.getString(10);
			   String destination=data.getString(11);
			   String firstName=data.getString(12);
			   String lastName=data.getString(13);
			   String Class=data.getString(14);
			   int numberOfTickets=data.getInt(15);
			   int priceEconomy= data.getInt(16);
			   int pricePrimium=data.getInt(17);
			   int priceBusiness=data.getInt(18);
			   int seatEconomy=data.getInt(19);
			   int seatPrimium=data.getInt(20);
			   int seatBusiness=data.getInt(21);
			   String seatType=data.getString(22);
			   String offerName=data.getString(23);
			   int offerrate=data.getInt(24);
			
			   double Totalprice;
			    
			     if(seatType.equals("economy")) {
			    	 Totalprice=priceEconomy*numberOfTickets;
			    	 
			    	 
			     }
			     else if(seatType.equals("premium")) {
			    	 Totalprice=pricePrimium*numberOfTickets;
			     }
			     else {
					Totalprice=priceBusiness*numberOfTickets;
				}
			   
			 BookingInfo bookinginfo=new BookingInfo(Ticketid, firstName, lastName, flightName, seviceCompany, departDate, arrivalDate, departTime, arrivalTime, flightType, source, destination, Totalprice, Class, numberOfTickets, priceEconomy, pricePrimium, priceBusiness, seatEconomy, seatPrimium, seatBusiness, offerName, offerrate, seatType);
				 	
			  System.out.println(bookinginfo);
		 
		  
		  return bookinginfo;
		  
		  }
		return null;
	}

	@Override
	public List<BookingInfo> getAllTicket(int userid) throws SQLException {
	
		Connection connection=JDBCconnectivity.getConnection();
		List<BookingInfo>bookingInfos=new ArrayList<BookingInfo>();
		String sql="select tr_ticketrecordid,fl_name,fl_service,fl_flighttype,sc_departdate,sc_departtime,sc_arrivaldate,sc_arrivaltime,sc_flightstop,r_source,r_destination,u_firstname,u_lastname,tr_class,tr_numtickets,p_economy,p_premium,p_business,s_economy,s_premium,s_business,tr_seattype,o_name,o_rate,tr_scheduleid, sc_shift from ticket_record join (schedule join (flight join seat on flight.fl_seatid =seat.s_seatid) on schedule.sc_flightid=flight.fl_flightid join (route join price on route.r_priceid=price.p_priceid) on schedule.sc_routeid=route.r_routeid) join offer on schedule.sc_offerid=offer.o_offerid on  ticket_record.tr_scheduleid= schedule.sc_scheduleid join user on ticket_record.tr_userid=user.u_userid where  tr_userid=?;";
		PreparedStatement rs= connection.prepareStatement(sql);
		    rs.setInt(1, userid);
		   ResultSet data= rs.executeQuery();
		   System.out.println(data);
		  while(data.next()) {
			
			  int Ticketid=data.getInt("tr_ticketrecordid");
			  String flightName=data.getString("fl_name");
			  String seviceCompany=data.getString("fl_service");
			  String flightType=data.getString("fl_flighttype");
			   Date departDate=data.getDate("sc_departdate");
			   Time departTime=data.getTime("sc_departtime");
			   Date arrivalDate=data.getDate("sc_arrivaldate");
			   Time arrivalTime=data.getTime("sc_arrivaltime");
			   String typeStop=data.getString("fl_flighttype");
			   String source=data.getString("r_source");
			   String destination=data.getString("r_destination");
			   String firstName=data.getString("u_firstname");
			   String lastName=data.getString("u_lastname");
			   String Class=data.getString("tr_class");
			   int numberOfTickets=data.getInt("tr_numtickets");
			   int priceEconomy= data.getInt("p_economy");
			   int pricePrimium=data.getInt("p_premium");
			   int priceBusiness=data.getInt("p_business");
			   int seatEconomy=data.getInt("s_economy");
			   int seatPrimium=data.getInt("s_premium");
			   int seatBusiness=data.getInt("p_business");
			   String seatType=data.getString("tr_seattype");
			   String offerName=data.getString("o_name");
			   int offerrate=data.getInt("o_rate");
			   int schduleId=data.getInt("tr_scheduleid");
			   String shift=data.getString("sc_shift");
			
			   double Totalprice;
			    
			     if(seatType.equals("economy")) {
			    	 Totalprice=(priceEconomy*numberOfTickets)-(priceEconomy*numberOfTickets)*(offerrate)*0.01;
			    	 
			    	 
			    	 
			     }
			     else if(seatType.equals("premium")) {
			    	 Totalprice=(pricePrimium*numberOfTickets)-(pricePrimium*numberOfTickets)*(offerrate)*0.01;			     }
			     else {
			    	 Totalprice=(priceBusiness*numberOfTickets)-(priceBusiness*numberOfTickets)*(offerrate)*0.01;
				}
			   
			      bookingInfos.add( new BookingInfo(Ticketid, firstName, lastName, flightName, seviceCompany, departDate, arrivalDate, departTime, arrivalTime, flightType, source, destination, Totalprice, Class, numberOfTickets, offerName, offerrate, seatType,shift));
				 	
			 
		 
		  
		 
		  
		  }
		  
		  System.out.println(bookingInfos);
		  return bookingInfos;
		
	}
	@Override
	public List<BookingInfo> getBookingInfoByScheduleId(int scheduleId) throws SQLException {
	  System.out.println(scheduleId);
		Connection connection=JDBCconnectivity.getConnection();
		List<BookingInfo>bookingInfos=new ArrayList<BookingInfo>();
		String sql="select tr_ticketrecordid,fl_name,fl_service,fl_flighttype,sc_departdate,sc_departtime,sc_arrivaldate,sc_arrivaltime,sc_flightstop,r_source,r_destination,u_firstname,u_lastname,tr_class,tr_numtickets,p_economy,p_premium,p_business,s_economy,s_premium,s_business,tr_seattype,o_name,o_rate,tr_scheduleid ,sc_shift from ticket_record join (schedule join (flight join seat on flight.fl_seatid =seat.s_seatid) on schedule.sc_flightid=flight.fl_flightid join (route join price on route.r_priceid=price.p_priceid) on schedule.sc_routeid=route.r_routeid) join offer on schedule.sc_offerid=offer.o_offerid on  ticket_record.tr_scheduleid= schedule.sc_scheduleid join user on ticket_record.tr_userid=user.u_userid where  tr_scheduleid=?;";
		PreparedStatement rs= connection.prepareStatement(sql);
		    rs.setInt(1, scheduleId);
		   ResultSet data= rs.executeQuery();
		   System.out.println(data);
		  while(data.next()) {
			
			  int Ticketid=data.getInt("tr_ticketrecordid");
			  String flightName=data.getString("fl_name");
			  String seviceCompany=data.getString("fl_service");
			  String flightType=data.getString("fl_flighttype");
			   Date departDate=data.getDate("sc_departdate");
			   Time departTime=data.getTime("sc_departtime");
			   Date arrivalDate=data.getDate("sc_arrivaldate");
			   Time arrivalTime=data.getTime("sc_arrivaltime");
			   String typeStop=data.getString("fl_flighttype");
			   String source=data.getString("r_source");
			   String destination=data.getString("r_destination");
			   String firstName=data.getString("u_firstname");
			   String lastName=data.getString("u_lastname");
			   String Class=data.getString("tr_class");
			   int numberOfTickets=data.getInt("tr_numtickets");
			   int priceEconomy= data.getInt("p_economy");
			   int pricePrimium=data.getInt("p_premium");
			   int priceBusiness=data.getInt("p_business");
			   int seatEconomy=data.getInt("s_economy");
			   int seatPrimium=data.getInt("s_premium");
			   int seatBusiness=data.getInt("p_business");
			   String seatType=data.getString("tr_seattype");
			   String offerName=data.getString("o_name");
			   int offerrate=data.getInt("o_rate");
			   int schduleId=data.getInt("tr_scheduleid");
			   String shift=data.getNString("sc_shift");
			
			   double Totalprice;
			    
			     if(seatType.equals("economy")) {
			    	 Totalprice=(priceEconomy*numberOfTickets)-(priceEconomy*numberOfTickets)*(offerrate)*0.01;
			    	 
			    	 
			    	 
			     }
			     else if(seatType.equals("premium")) {
			    	 Totalprice=(pricePrimium*numberOfTickets)-(pricePrimium*numberOfTickets)*(offerrate)*0.01;			     }
			     else {
			    	 Totalprice=(priceBusiness*numberOfTickets)-(priceBusiness*numberOfTickets)*(offerrate)*0.01;
				}
			   
			      
				 	bookingInfos.add(new BookingInfo(Ticketid, firstName, lastName, flightName, seviceCompany, numberOfTickets, seatType, schduleId,shift));
			 
			
		  
		 
		  
		  }
		  
		  System.out.println(bookingInfos);
		  return bookingInfos;
		
	}

	@Override
	public List<BookingInfo> getPassengerDetailsByseatType(String seatType1) throws SQLException {
		System.out.println(seatType1);
		Connection connection=JDBCconnectivity.getConnection();
		List<BookingInfo>bookingInfos=new ArrayList<BookingInfo>();
		String sql="select tr_ticketrecordid,fl_name,fl_service,fl_flighttype,sc_departdate,sc_departtime,sc_arrivaldate,sc_arrivaltime,sc_flightstop,r_source,r_destination,u_firstname,u_lastname,tr_class,tr_numtickets,p_economy,p_premium,p_business,s_economy,s_premium,s_business,tr_seattype,o_name,o_rate,tr_scheduleid from ticket_record join (schedule join (flight join seat on flight.fl_seatid =seat.s_seatid) on schedule.sc_flightid=flight.fl_flightid join (route join price on route.r_priceid=price.p_priceid) on schedule.sc_routeid=route.r_routeid) join offer on schedule.sc_offerid=offer.o_offerid on  ticket_record.tr_scheduleid= schedule.sc_scheduleid join user on ticket_record.tr_userid=user.u_userid where  tr_seattype=?;";
		System.out.println(sql);
		PreparedStatement rs= connection.prepareStatement(sql);
		    rs.setString(1, seatType1);
		   ResultSet data= rs.executeQuery();
		   System.out.println(data);
		  while(data.next()) {
			
			  int Ticketid=data.getInt("tr_ticketrecordid");
			  String flightName=data.getString("fl_name");
			  String seviceCompany=data.getString("fl_service");
			  String flightType=data.getString("fl_flighttype");
			   Date departDate=data.getDate("sc_departdate");
			   Time departTime=data.getTime("sc_departtime");
			   Date arrivalDate=data.getDate("sc_arrivaldate");
			   Time arrivalTime=data.getTime("sc_arrivaltime");
			   String typeStop=data.getString("fl_flighttype");
			   String source=data.getString("r_source");
			   String destination=data.getString("r_destination");
			   String firstName=data.getString("u_firstname");
			   String lastName=data.getString("u_lastname");
			   String Class=data.getString("tr_class");
			   int numberOfTickets=data.getInt("tr_numtickets");
			   int priceEconomy= data.getInt("p_economy");
			   int pricePrimium=data.getInt("p_premium");
			   int priceBusiness=data.getInt("p_business");
			   int seatEconomy=data.getInt("s_economy");
			   int seatPrimium=data.getInt("s_premium");
			   int seatBusiness=data.getInt("p_business");
			   String seatType=data.getString("tr_seattype");
			   String offerName=data.getString("o_name");
			   int offerrate=data.getInt("o_rate");
			   int schduleId=data.getInt("tr_scheduleid");
			   String shift=data.getString("sc_shift");
			
			   double Totalprice;
			    
			     if(seatType.equals("economy")) {
			    	 Totalprice=(priceEconomy*numberOfTickets)-(priceEconomy*numberOfTickets)*(offerrate)*0.01;
			    	 
			    	 
			    	 
			     }
			     else if(seatType.equals("premium")) {
			    	 Totalprice=(pricePrimium*numberOfTickets)-(pricePrimium*numberOfTickets)*(offerrate)*0.01;			     }
			     else {
			    	 Totalprice=(priceBusiness*numberOfTickets)-(priceBusiness*numberOfTickets)*(offerrate)*0.01;
				}
			   
			      
				 	bookingInfos.add(new BookingInfo(Ticketid, firstName, lastName, flightName, seviceCompany, numberOfTickets, seatType, schduleId,shift));
			 
		 
		  
				 
					  
					
					
		  
		  }
		return bookingInfos;
		  
		  
	}
	@Override
	public List<BookingInfo> getPassengerDetailsByShift(String shift1) throws SQLException {
		System.out.println(shift1);
		Connection connection=JDBCconnectivity.getConnection();
		List<BookingInfo>bookingInfos=new ArrayList<BookingInfo>();
		String sql="select tr_ticketrecordid,fl_name,fl_service,fl_flighttype,sc_departdate,sc_departtime,sc_arrivaldate,sc_arrivaltime,sc_flightstop,r_source,r_destination,u_firstname,u_lastname,tr_class,tr_numtickets,p_economy,p_premium,p_business,s_economy,s_premium,s_business,tr_seattype,o_name,o_rate,tr_scheduleid,sc_shift from ticket_record join (schedule join (flight join seat on flight.fl_seatid =seat.s_seatid) on schedule.sc_flightid=flight.fl_flightid join (route join price on route.r_priceid=price.p_priceid) on schedule.sc_routeid=route.r_routeid) join offer on schedule.sc_offerid=offer.o_offerid on  ticket_record.tr_scheduleid= schedule.sc_scheduleid join user on ticket_record.tr_userid=user.u_userid where  sc_shift=?;";
		PreparedStatement rs= connection.prepareStatement(sql);
		    rs.setString(1, shift1);
		   ResultSet data= rs.executeQuery();
		   System.out.println(data);
		  while(data.next()) {
			
			  int Ticketid=data.getInt("tr_ticketrecordid");
			  String flightName=data.getString("fl_name");
			  String seviceCompany=data.getString("fl_service");
			  String flightType=data.getString("fl_flighttype");
			   Date departDate=data.getDate("sc_departdate");
			   Time departTime=data.getTime("sc_departtime");
			   Date arrivalDate=data.getDate("sc_arrivaldate");
			   Time arrivalTime=data.getTime("sc_arrivaltime");
			   String typeStop=data.getString("fl_flighttype");
			   String source=data.getString("r_source");
			   String destination=data.getString("r_destination");
			   String firstName=data.getString("u_firstname");
			   String lastName=data.getString("u_lastname");
			   String Class=data.getString("tr_class");
			   int numberOfTickets=data.getInt("tr_numtickets");
			   int priceEconomy= data.getInt("p_economy");
			   int pricePrimium=data.getInt("p_premium");
			   int priceBusiness=data.getInt("p_business");
			   int seatEconomy=data.getInt("s_economy");
			   int seatPrimium=data.getInt("s_premium");
			   int seatBusiness=data.getInt("p_business");
			   String seatType=data.getString("tr_seattype");
			   String offerName=data.getString("o_name");
			   int offerrate=data.getInt("o_rate");
			   int schduleId=data.getInt("tr_scheduleid");
			   String shift=data.getString("sc_shift");
			
			   double Totalprice;
			    
			     if(seatType.equals("economy")) {
			    	 Totalprice=(priceEconomy*numberOfTickets)-(priceEconomy*numberOfTickets)*(offerrate)*0.01;
			    	 
			    	 
			    	 
			     }
			     else if(seatType.equals("premium")) {
			    	 Totalprice=(pricePrimium*numberOfTickets)-(pricePrimium*numberOfTickets)*(offerrate)*0.01;			     }
			     else {
			    	 Totalprice=(priceBusiness*numberOfTickets)-(priceBusiness*numberOfTickets)*(offerrate)*0.01;
				}
			   
			      
				 	bookingInfos.add(new BookingInfo(Ticketid, firstName, lastName, flightName, seviceCompany, numberOfTickets, seatType, schduleId,shift));
			 
		 
		  
				 
					  
					
					
		  
		  }
		  System.out.println(bookingInfos);
		return bookingInfos;
		  
		  
	}
	 
}
