package com.ubs.calculator.service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import com.ubs.calculator.model.Instrument;
import com.ubs.calculator.model.Market;
import com.ubs.calculator.service.MarketUpdate;

import junit.framework.TestCase;

public class CalculatorImplTests extends TestCase {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() throws Exception {
		
		//Assert.notNull(context.getBean("calculatorDataManager"));
		
	}
	
	@Test
	public void applyMarketUpdateTests() throws Exception{
		CalculatorImpl ci = new CalculatorImpl();
		MarketUpdateImpl mu = new MarketUpdateImpl();
		TwoWayPriceImpl twpl = new TwoWayPriceImpl();
		twpl.setInstrument(Instrument.INSTRUMENT0);
		twpl.setBidPrice(50);
		twpl.setBidAmount(50);
		twpl.setOfferAmount(50);
		twpl.setOfferPrice(50);
		mu.setMarket(Market.MARKET0);
		mu.setTwowayprice(twpl);
		ci.applyMarketUpdate(mu);
		
	}
}
