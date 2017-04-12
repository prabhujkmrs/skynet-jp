package com.ubs.calculator.service.impl;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import com.ubs.calculator.model.Instrument;
import com.ubs.calculator.model.Market;
import com.ubs.calculator.service.MarketUpdate;
import com.ubs.calculator.service.TwoWayPrice;

import junit.framework.TestCase;

public class CalculatorImplTests extends TestCase {

	Logger logger = Logger.getLogger(CalculatorImplTests.class);

	ApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");

	@SuppressWarnings("deprecation")
	@Test
	public void test() throws Exception {

		logger.info("Starting application test... ");
		CalculatorImpl ci = new CalculatorImpl();
		MarketUpdateImpl mu = new MarketUpdateImpl();
		TwoWayPriceImpl twpl = new TwoWayPriceImpl();
		twpl.setInstrument(Instrument.INSTRUMENT1);
		twpl.setBidPrice(50);
		twpl.setBidAmount(50);
		twpl.setOfferAmount(50);
		twpl.setOfferPrice(50);
		mu.setMarket(Market.MARKET3);
		mu.setTwowayprice(twpl);
		TwoWayPriceImpl twp = (TwoWayPriceImpl) ci.applyMarketUpdate(mu);
		double bid = twp.getBid();
		double offer = twp.getOffer();
		String inst = twp.getInstrument().toString();

		logger.info("Instrument : " + inst);
		logger.info("Bid : " + bid);
		logger.info("Offer : " + offer);

	}

}
