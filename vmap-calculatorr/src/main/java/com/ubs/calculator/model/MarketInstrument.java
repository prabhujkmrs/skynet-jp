package com.ubs.calculator.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MarketInstrument {

	private Instrument instrument;
	private Market market;
	private static HashMap<Instrument, List<Market>> miMap = new HashMap<>();

	public void setMiMap(HashMap<Instrument, List<Market>> miMap) {
		this.miMap = miMap;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public List<Market> getMarketList(Instrument instrument) {
        return miMap.get(instrument);
    }

	public void addMarketInstrument(Instrument inst, Market market) {
		if (null == miMap.get(inst)) {
            List<Market> markets = new ArrayList<>();
            markets.add(market);
            miMap.put(inst, markets);
        } else {
            miMap.get(inst).add(market);
        }

    }

}
