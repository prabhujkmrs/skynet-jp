package com.ubs.calculator.data;


import com.ubs.calculator.model.Market;
import com.ubs.calculator.service.TwoWayPrice;

/**
 * In memory data manager for holding the input data;
 * 
 * @author prabhuj
 *
 */

public interface CalculatorDataManager {

	/**
	 * 
	 * @return Queue of strings
	 * @throws Exception
	 *             An exception raised during the execution of the method due to
	 *             an error.
	 */
	public TwoWayPrice getMarketPriceData(Market market) throws Exception;

}
