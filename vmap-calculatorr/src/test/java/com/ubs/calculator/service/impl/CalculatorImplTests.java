package com.ubs.calculator.service.impl;

import com.ubs.calculator.data.CalculatorDataManager;
import com.ubs.calculator.data.impl.CalculatorDataManagerImpl;
import com.ubs.calculator.model.Instrument;
import com.ubs.calculator.model.Market;
import com.ubs.calculator.model.MarketInstrument;
import com.ubs.calculator.service.Calculator;
import com.ubs.calculator.service.MarketUpdate;
import com.ubs.calculator.service.TwoWayPrice;
import junit.framework.TestCase;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorImplTests extends TestCase {

	Logger logger = Logger.getLogger(CalculatorImplTests.class);

	ApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");

	@Test
	public void testNotNullOfServicesInstance() throws Exception {

		TwoWayPrice twp = (TwoWayPriceImpl) context.getBean("twowayPrice1");
		Assert.assertNotNull(twp);
		logger.info("TwoWayPrice instance careated successfully " + twp);

		MarketUpdate mu = (MarketUpdate) context.getBean("marketUpdate2");
		Assert.assertNotNull(mu);
		logger.info("MarketUpdate instance careated successfully " + mu);

		CalculatorDataManager cdm = (CalculatorDataManagerImpl) context.getBean("calculatorDataManager");
		Assert.assertNotNull(cdm);
		logger.info("CalculatorDataManager instance careated successfully " + cdm);

		MarketInstrument mi = (MarketInstrument) context.getBean("marketInstrument");
		Assert.assertNotNull(mi);
		logger.info("MarketInstrument instance careated successfully " + mi);

	}

	@Test
	public void testVWAPCalculator() throws Exception {

		logger.info("Starting application testVWAPCalculator... ");

		Calculator ci = new CalculatorImpl();
		MarketUpdate mu = new MarketUpdateImpl();
		TwoWayPrice twpl = new TwoWayPriceImpl();
		((TwoWayPriceImpl) twpl).setInstrument(Instrument.INSTRUMENT1);
		((TwoWayPriceImpl) twpl).setBidPrice(50);
		((TwoWayPriceImpl) twpl).setBidAmount(50);
		((TwoWayPriceImpl) twpl).setOfferAmount(50);
		((TwoWayPriceImpl) twpl).setOfferPrice(50);
		((MarketUpdateImpl) mu).setMarket(Market.MARKET3);
		((MarketUpdateImpl) mu).setTwowayprice(twpl);
		TwoWayPriceImpl twp = (TwoWayPriceImpl) ci.applyMarketUpdate(mu);
		double bid = twp.getBid();
		double offer = twp.getOffer();
		String inst = twp.getInstrument().toString();

		logger.info("Instrument : " + inst);
		logger.info("Bid : " + bid);
		logger.info("Offer : " + offer);

	}

}
