package com.ubs.calculator.service.impl;

import org.apache.log4j.Logger;

import com.ubs.calculator.model.Instrument;
import com.ubs.calculator.model.Market;
import com.ubs.calculator.service.Calculator;
import com.ubs.calculator.service.MarketUpdate;
import com.ubs.calculator.service.TwoWayPrice;

public class CalculatorImpl implements Calculator {
	
	Logger logger = Logger.getLogger(CalculatorImpl.class);

	@Override
	public TwoWayPrice applyMarketUpdate(MarketUpdate twoWayMarketPrice) throws Exception {
		
		
		return twoWayMarketPrice.getTwoWayPrice(twoWayMarketPrice);
	}
	
	

}
