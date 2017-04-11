package com.ubs.calculator.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ubs.calculator.model.Instrument;
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
	

	@Override
	public Instrument getInstrument() {
		
		return instrument;
	}

	@Override
	public State getState() {
		
		return state;
	}

	@Override
	public double getBidPrice() {
		
		return this.bidPrice;
	}

	@Override
	public double getOfferAmount() {
		
		return this.offerAmount;
	}

	@Override
	public double getOfferPrice() {
		
		return this.offerPrice;
	}

	@Override
	public double getBidAmount() {
		
		return this.bidAmount;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument=instrument;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}

	public void setOfferAmount(double offerAmount) {
		this.offerAmount = offerAmount;
	}

	public void setOfferPrice(double offerPrice) {
		this.offerPrice = offerPrice;
	}

	public void setBidAmount(double bidAmount) {
		this.bidAmount = bidAmount;
	}
	
	

}
