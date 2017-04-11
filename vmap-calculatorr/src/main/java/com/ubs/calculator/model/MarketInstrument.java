package com.ubs.calculator.model;

import java.util.List;

public class MarketInstrument {
	
	private Instrument instrument;
	private List<Market> markets;
	
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	public List<Market> getMarkets(Instrument instrument) {
		return markets;
	}
	public void setMarkets(List<Market> markets) {
		this.markets = markets;
	}

}
