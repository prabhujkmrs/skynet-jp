package com.ubs.calculator.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.ubs.calculator.data.impl.CalculatorDataManagerImpl;
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

public class MarketUpdateImpl implements MarketUpdate {

	Logger logger = Logger.getLogger(MarketUpdateImpl.class);

	private Market market;
	private TwoWayPrice twowayprice;

	public TwoWayPrice getTwoWayPrice(MarketUpdate mu) throws Exception {
		logger.info("Start-TwoWayPrice execution....");
		try {
			TwoWayPriceImpl twp = (TwoWayPriceImpl) mu.getTwoWayPrice();
			Instrument inst = twp.getInstrument(mu.getMarket());

			MarketInstrument mi = new MarketInstrument();
			List<Market> mList = mi.getmiMapList(inst);
			// mList.add(mu.getMarket());
			// mi.setmiMap(inst, mList);

			double bSumNumerator = twp.getBidAmount() * twp.getBidPrice();
			double bSumDenominator = twp.getBidAmount();
			double oSumNumerator = twp.getOfferAmount() * twp.getOfferPrice();
			double oSumDenominator = twp.getOfferAmount();
			for (Market m : mList) {
				CalculatorDataManagerImpl cdm = new CalculatorDataManagerImpl();
				TwoWayPriceImpl tw = (TwoWayPriceImpl) cdm.getMarketPriceData(m);
				double bAmt = tw.getBidAmount();
				double bPrice = tw.getBidPrice();
				double oAmt = tw.getOfferAmount();
				double oPrice = tw.getOfferPrice();
				oSumNumerator = oSumNumerator + (oAmt * oPrice);
				oSumDenominator = oSumDenominator + oAmt;
				bSumNumerator = bSumNumerator + (bAmt * bPrice);
				bSumDenominator = bSumDenominator + bAmt;
			}
			twp.setBid(bSumNumerator / bSumDenominator);
			twp.setOffer(oSumNumerator / oSumDenominator);
			return twp;
		} catch (Exception ex) {
			logger.error("Error occured while calculating TwoWayPrice for " + mu + ".", ex);
			throw new Exception("Error occured while calculating TwoWayPrice for " + mu + ".", ex);
		}
	}

	@Override
	public TwoWayPrice getTwoWayPrice() {
		return this.twowayprice;
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
