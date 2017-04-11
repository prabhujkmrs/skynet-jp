package com.ubs.calculator.data.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.ubs.calculator.data.CalculatorDataManager;
import com.ubs.calculator.service.MarketUpdate;

public class CalculatorDataManagerImpl implements CalculatorDataManager {
	
	private Map<Integer,MarketUpdate> inputData;
	
	public CalculatorDataManagerImpl(){
		inputData = new ConcurrentHashMap<Integer,MarketUpdate>();
	}


	public void setInputData(Map<Integer,MarketUpdate> inputData) {
		this.inputData = inputData;
	}
	

	@Override
	public Map<Integer, MarketUpdate> getMarketPriceData() throws Exception {
		return inputData;
	}


}
