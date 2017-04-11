package com.ubs.calculator.service;

/**
 * Calculator Interface that implements the method to apply marketUdate
 * @author prabhuj
 *
 */

public interface Calculator {
	/**
	 * 
	 * @param twoWayMarketPrice
	 * @return TwoWayPrice type value
	 * @throws Exception  An exception raised during the execution of the method due to an error.
	 */

	TwoWayPrice applyMarketUpdate(final MarketUpdate twoWayMarketPrice) throws Exception;
}
