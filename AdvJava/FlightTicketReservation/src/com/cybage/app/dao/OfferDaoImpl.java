package com.cybage.app.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.app.model.Offer;
import com.cybage.app.utilities.*;;

public class OfferDaoImpl implements OfferDao {
	Connection connection = JDBCconnectivity.getConnection();

	@Override
	public void addNewOffer(Offer newOffer) throws SQLException {

		PreparedStatement offer = connection.prepareStatement("insert into offer(o_name, o_rate) values(?,?)");

		offer.setString(1, newOffer.getO_name());
		offer.setDouble(2, newOffer.getO_rate());

		offer.executeUpdate();
	}

	@Override
	public int updateOffer(Offer newoffer) throws SQLException {

		PreparedStatement updateOffer = connection.prepareStatement("update offer set o_rate = ? where o_offerid = ? ");

		updateOffer.setDouble(1, newoffer.getO_rate());

		updateOffer.setInt(2, newoffer.getO_offerid());

		updateOffer.executeUpdate();

		return 0;
	}

	@Override
	public int deleteOffer(int o_offerid) throws SQLException {

		PreparedStatement delOffer = connection.prepareStatement("delete from offer where o_offerid = ? ");

		delOffer.setInt(1, o_offerid);
		delOffer.executeUpdate();

		return 0;
	}

	@Override
	public List<Offer> selectAllOffers() throws SQLException {

		List<Offer> listOffer = new ArrayList<Offer>();

		PreparedStatement psList = connection.prepareStatement("select * from offer");

		ResultSet rs = psList.executeQuery();

		while (rs.next()) {
			int o_offerid = rs.getInt(1);
			String o_name = rs.getString(2);
			int o_rate = rs.getInt(3);

			listOffer.add(new Offer(o_offerid, o_name, o_rate));

		}

		return listOffer;
	}

	@Override
	public int updateOffer(int o_offerid) throws SQLException {

		PreparedStatement updateOffer = connection.prepareStatement("update offer set o_rate = ? where o_offerid = ? ");

		updateOffer.setInt(2, o_offerid);

		updateOffer.executeUpdate();

		return 0;

	}

}
