package com.ubs.calculator.data.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

import com.ubs.calculator.data.CalculatorDataManager;
import com.ubs.calculator.model.Market;
import com.ubs.calculator.service.TwoWayPrice;
import com.ubs.calculator.service.impl.CalculatorImpl;

public class CalculatorDataManagerImpl implements CalculatorDataManager {
	
	Logger logger = Logger.getLogger(CalculatorDataManagerImpl.class);

	private static Map<Market, TwoWayPrice> inputData = new ConcurrentHashMap<Market, TwoWayPrice>();

	public Map<Market, TwoWayPrice> getInputData() {
		return inputData;
	}

	public void setInputData(Map<Market, TwoWayPrice> inputData) {
		this.inputData = inputData;
	}

	public CalculatorDataManagerImpl() {
	}

	@Override
	public TwoWayPrice getMarketPriceData(Market market) throws Exception {

		return inputData.get(market);
	}

}
