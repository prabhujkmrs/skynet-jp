package com.ubs.calculator.data;

import java.util.Map;

import com.ubs.calculator.service.MarketUpdate;


/**
 * In memory data manager for holding the input data;
 * @author prabhuj
 *
 */

public interface CalculatorDataManager {
	
	
	/**
	 * 
	 * @return Queue of strings
	 * @throws Exception An exception raised during the execution of the method due to an error.
	 */
	public Map<Integer,MarketUpdate> getMarketPriceData() throws Exception; 

}
