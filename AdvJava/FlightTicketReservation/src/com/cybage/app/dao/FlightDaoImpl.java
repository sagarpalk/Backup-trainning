package com.cybage.app.dao;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.cybage.app.model.Flight;
import com.cybage.app.model.Flight_Route;
import com.cybage.app.model.SeatPrice;
import com.cybage.app.utilities.JDBCconnectivity;
public class FlightDaoImpl implements FlightDao {
	Connection connection=JDBCconnectivity.getConnection();
	@Override
	public void addNewFlight(Flight newFlight) throws SQLException {
		PreparedStatement seat= connection.prepareStatement("insert into seat(s_economy,s_premium,s_business) values(?,?,?)");
		seat.setInt(1,newFlight.getEconomicClass_Seats());
		seat.setInt( 2,newFlight.getPremiumClass_Seats());
		seat.setInt( 3,newFlight.getBusinessClass_Seats());
		seat.executeUpdate();
		Statement state=connection.createStatement();
		ResultSet rst=state.executeQuery("Select s_seatid from seat order by s_seatid desc limit 1");
		int recentSeatId = 0;
		while(rst.next())
		{
			recentSeatId=rst.getInt(1);
		}
		System.out.println(recentSeatId);
		PreparedStatement flight= connection.prepareStatement("insert into flight(fl_name,fl_service,fl_flighttype,fl_seatid) values(?,?,?,?)");
		
		flight.setString(1,newFlight.getFlight_name());
		flight.setString(2,newFlight.getFlight_service_provider());
		flight.setString(3,newFlight.getFlight_type());
		flight.setInt(4,recentSeatId);
		flight.executeUpdate();
	}
	@Override
	public void addSeatPrice(SeatPrice price) throws SQLException {
		PreparedStatement seatprice= connection.prepareStatement("insert into price(p_economy,p_premium,p_business) values(?,?,?)");
		seatprice.setDouble(1, price.getEconmicClass_price());
		seatprice.setDouble(2, price.getPremiumClass_price());
		seatprice.setDouble(3, price.getBusinessClass_price());
		seatprice.executeUpdate();
		System.out.println("price added successfully");
	}
	@Override
	public void addFlightRoute(Flight_Route flightroute) throws SQLException {
		Connection connection=JDBCconnectivity.getConnection();
		Statement state=connection.createStatement();
		ResultSet rst=state.executeQuery("Select p_priceid from price order by p_priceid desc limit 1");
		int recentPriceId=0;
		while(rst.next())
		{
			recentPriceId=rst.getInt(1);
		}
		PreparedStatement route= connection.prepareStatement("insert into route(r_source,r_destination,r_priceid) values(?,?,?)");
		route.setString(1,flightroute.getFlight_source());
		route.setString(2,flightroute.getFlight_destination());
		route.setInt(3, recentPriceId);
		route.executeUpdate();
		System.out.println("route added");
	}
}
