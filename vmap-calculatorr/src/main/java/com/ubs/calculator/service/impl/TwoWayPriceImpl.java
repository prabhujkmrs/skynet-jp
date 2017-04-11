package com.ubs.calculator.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ubs.calculator.data.impl.CalculatorDataManagerImpl;
import com.ubs.calculator.model.Instrument;
import com.ubs.calculator.model.Market;
import com.ubs.calculator.model.State;
import com.ubs.calculator.service.TwoWayPrice;

public class TwoWayPriceImpl implements TwoWayPrice {
	
	Logger logger = Logger.getLogger(TwoWayPriceImpl.class);
	
	private Instrument instrument;
	private State state;
	private double bidPrice;
	private double offerAmount;
	private double offerPrice;
	private double bidAmount;
	private double bid;
	private double offer;
	private List<String> markets; 
	

	public Instrument getInstrument() {
		return instrument;
	}


	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}


	public double getBidPrice() {
		return bidPrice;
	}


	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}


	public double getOfferAmount() {
		return offerAmount;
	}


	public void setOfferAmount(double offerAmount) {
		this.offerAmount = offerAmount;
	}


	public double getOfferPrice() {
		return offerPrice;
	}


	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}


	public double getBidAmount() {
		return bidAmount;
	}


	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}


	public List<String> getMarkets() {
		return markets;
	}


	public void setMarkets(List<String> markets) {
		this.markets = markets;
	}


	
	public Instrument getInstrument(Market market) {
		
		return instrument;
	}


	
	public State getState() throws Exception {
		
		return this.state;
	}
	

	public void setState(State state) {
		this.state = state;
	}


	public double getBid() {
		return bid;
	}


	public void setBid(double bid) {
		this.bid = bid;
	}


	public double getOffer() {
		return offer;
	}


	public void setOffer(double offer) {
		this.offer = offer;
	}


	
	public double getBidPrice(Market m) throws Exception {
		
		CalculatorDataManagerImpl cdmi = new CalculatorDataManagerImpl();
		
		TwoWayPrice twp = cdmi.getMarketPriceData(m);
		double bPrice = twp.getBidPrice();
		return bPrice;
		
	}


	
	public double getOfferAmount(Market m) throws Exception {
		
		CalculatorDataManagerImpl cdmi = new CalculatorDataManagerImpl();
		
		TwoWayPrice twp = cdmi.getMarketPriceData(m);
		double oAmt = twp.getOfferAmount();
		return oAmt;
	}


	
	public double getOfferPrice(Market m) throws Exception {
		
		CalculatorDataManagerImpl cdmi = new CalculatorDataManagerImpl();
		
		TwoWayPrice twp = cdmi.getMarketPriceData(m);
		double oPrice = twp.getOfferPrice();
		return oPrice;
	}


	
	public double getBidAmount(Market m) throws Exception {
		
		CalculatorDataManagerImpl cdmi = new CalculatorDataManagerImpl();
		
		TwoWayPrice twp = cdmi.getMarketPriceData(m);
		double bAmt = twp.getBidAmount();
		return bAmt;
	}

	
	
	

}
