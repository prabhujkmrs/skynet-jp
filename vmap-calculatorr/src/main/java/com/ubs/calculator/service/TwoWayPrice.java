package com.ubs.calculator.service;

import com.ubs.calculator.model.Instrument;
import com.ubs.calculator.model.Market;
import com.ubs.calculator.model.State;

/**
 * TwoWayPrice interface that implements six methods to return instruments,state,bidPrice,OfferAmount,OfferPrice,BidAmount
 * @author prabhuj
 *
 */

public interface TwoWayPrice {
	
	/**
	 * 
	 * @return Instrument
	 * @throws Exception An exception raised during the execution of the method due to an error
	 */
	
	Instrument getInstrument(Market market) throws Exception;
	
	/**
	 * 
	 * @return State
	 * @throws Exception An exception raised during the execution of the method due to an error
	 */
	
    State getState() throws Exception;
    
    /**
     * 
     * @return double value
     * @throws Exception An exception raised during the execution of the method due to an error
     */
    
    double getBidPrice() throws Exception;
    
    /**
     * 
     * @return double value
     * @throws Exception An exception raised during the execution of the method due to an error
     */
    
    double getOfferAmount() throws Exception;
    
    /**
     * 
     * @return double value
     * @throws Exception An exception raised during the execution of the method due to an error
     */
    
    double getOfferPrice() throws Exception;
    
    /**
     * 
     * @return double value
     * @throws Exception An exception raised during the execution of the method due to an error
     */
    
    double getBidAmount() throws Exception;
    
}
