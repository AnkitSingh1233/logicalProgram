package com.nt.factory;

import com.nt.comps.Bike;
import com.nt.comps.BilletBike;
import com.nt.comps.ElictricBike;
import com.nt.comps.SpoortBike;

public class FactoryBike {

	public static Bike bikeManfac(String order) {

		Bike bike = null;

		if (order.equalsIgnoreCase("elc"))
			bike = new ElictricBike();

		else if (order.equalsIgnoreCase("spo"))
			bike = new SpoortBike();

		else if (order.equalsIgnoreCase("bulle"))
			bike = new BilletBike();

		else
			try {
				throw new IllegalArgumentException("invalid Bike");
			} catch (Exception e) {
				e.getMessage();
			}

		return bike;

	}

}
