package com.ubs.calculator.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.ubs.calculator.model.Instrument;
import com.ubs.calculator.model.Market;
import com.ubs.calculator.model.MarketInstrument;
import com.ubs.calculator.service.MarketUpdate;
import com.ubs.calculator.service.TwoWayPrice;

/**
 * 
 * @author prabhuj
 *
 */

public class MarketUpdateImpl implements MarketUpdate{
	
	Logger logger = Logger.getLogger(MarketUpdateImpl.class);
	
	private Market market;
	private TwoWayPrice twowayprice;

	@Override
	public TwoWayPrice getTwoWayPrice() throws Exception {
		TwoWayPriceImpl twp = new TwoWayPriceImpl();
		Instrument inst = twp.getInstrument(this.getMarket());
		
		MarketInstrument mi = new MarketInstrument();
		List<Market> mList = mi.getMarkets(inst);
		double oSumNumerator = 0;
		double oSumDenominator = 0;
		double bSumNumerator = 0;
		double bSumDenominator = 0;
		for(Market m : mList ){
			double bAmt = twp.getBidAmount(m);
			double bPrice =twp.getBidPrice(m);
			double oAmt =twp.getOfferAmount(m);
			double oPrice =twp.getOfferPrice(m);
			oSumNumerator = oSumNumerator+(oAmt*oPrice);
			oSumDenominator=oSumDenominator+oAmt;
			bSumNumerator = bSumNumerator+(bAmt*bPrice);
			bSumDenominator=bSumDenominator+bAmt;	
		}
		twp.setBid(bSumNumerator/bSumDenominator);
		twp.setOffer(oSumNumerator/oSumDenominator);
		return twp;
	}

	public void setTwowayprice(TwoWayPrice twowayprice) {
		this.twowayprice = twowayprice;
	}

	public void setMarket(Market market) {
		this.market = market;
	}


	@Override
	public Market getMarket() throws Exception {
		
		return this.market;
	}

}
