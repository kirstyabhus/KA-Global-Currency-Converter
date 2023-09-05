package com.codingblackfemales;

import java.lang.reflect.Array;
import java.util.HashMap;

public class BasicCurrencyConverter implements CurrencyConverter {

    // will return the converted amount (conversion from source to destination
    // currency)

    public double convertCurrency(String sourceCurrencyCode, String destinationCurrencyCode, double amount) {
        return 1.0; // place holder
    }

    // will return an array of available currency codes
    public String[] getCurrencyCodes() {
        // create new instance of the CurrenciesGBP class (to access its methods)
        CurrenciesGBP currenciesGBP = new CurrenciesGBP();

        // get the exchange rates (hash map)
        HashMap<String, Double> exchangeRates = currenciesGBP.getAllExchangeRates();

        // create a new array, the size of the key set (to store the key codes)
        String[] currencyCodes = new String[exchangeRates.size()];

        // transverse through the set of key codes, adding each key to the array
        int i = 0;
        for (String code : exchangeRates.keySet()) {
            currencyCodes[i] = code;
            i++;
        }

        return currencyCodes;
    }

    // will return the exchange rate between the provided currencies.
    public double getExchangeRate(String sourceCurrencyCode, String destinationCurrencyCode) {
        return 1.0; // place holder
    }

}
