package com.ubs.calculator.service.impl;

import org.apache.log4j.Logger;

import com.ubs.calculator.model.Market;
import com.ubs.calculator.service.MarketUpdate;
import com.ubs.calculator.service.TwoWayPrice;

/**
 * 
 * @author prabhuj
 *
 */

public class MarketUpdateImpl implements MarketUpdate{
	
	Logger logger = Logger.getLogger(MarketUpdateImpl.class);
	
	public Market market;
	public TwoWayPrice twowayprice;

	@Override
	public Market getMarket() {
		return market;
	}

	public TwoWayPrice getTwowayprice() {
		return twowayprice;
	}

	public void setTwowayprice(TwoWayPrice twowayprice) {
		this.twowayprice = twowayprice;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	@Override
	public TwoWayPrice getTwoWayPrice() {
		
		return twowayprice;
	}

}
