package com.ubs.calculator.service;

import com.ubs.calculator.model.Market;

/**
 * MarketUpdate interface that implements two methods
 * @author prabhuj
 * 
 *
 */

public interface MarketUpdate {
	/**
	 * method to get the market
	 * @return Market type value
	 * @throws Exception An exception raised during the execution of the method due to an error
	 */
	Market getMarket() throws Exception;
	
	/**
	 * method to get the twowayprice
	 * @return TwoWayPrice type value
	 * @throws Exception  An exception raised during the execution of the method due to an error
	 */
    TwoWayPrice getTwoWayPrice() throws Exception;

}
