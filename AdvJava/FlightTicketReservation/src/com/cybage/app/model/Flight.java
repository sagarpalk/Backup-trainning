package com.cybage.app.model;
public class Flight {
		private String flight_name;
		private String flight_service_provider;
		private  String flight_type;
		private int economicClass_Seats;
		private int businessClass_Seats;
		private int premiumClass_Seats;
		
		public Flight(String flight_name, String flight_service_provider, String flight_type, int economicClass_Seats,
				int businessClass_Seats, int premiumClass_Seats) {
			super();
			this.flight_name = flight_name;
			this.flight_service_provider = flight_service_provider;
			this.flight_type = flight_type;
			this.economicClass_Seats = economicClass_Seats;
			this.businessClass_Seats = businessClass_Seats;
			this.premiumClass_Seats = premiumClass_Seats;
		}
		public String getFlight_name() {
			return flight_name;
		}
		public void setFlight_name(String flight_name) {
			this.flight_name = flight_name;
		}
		public String getFlight_service_provider() {
			return flight_service_provider;
		}
		public void setFlight_service_provider(String flight_service_provider) {
			this.flight_service_provider = flight_service_provider;
		}
		public String getFlight_type() {
			return flight_type;
		}
		public void setFlight_type(String flight_type) {
			this.flight_type = flight_type;
		}
		public int getEconomicClass_Seats() {
			return economicClass_Seats;
		}

		public void setEconomicClass_Seats(int economicClass_Seats) {
			this.economicClass_Seats = economicClass_Seats;
		}

		public int getBusinessClass_Seats() {
			return businessClass_Seats;
		}

		public void setBusinessClass_Seats(int businessClass_Seats) {
			this.businessClass_Seats = businessClass_Seats;
		}

		public int getPremiumClass_Seats() {
			return premiumClass_Seats;
		}

		public void setPremiumClass_Seats(int premiumClass_Seats) {
			this.premiumClass_Seats = premiumClass_Seats;

		}
}
