package com.tlee753.stockMarket;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.util.Map;

public class User {
    private String fullName;
    private String address;
    private String[] symbols;
    private Map<String, Stock> stocks;

    public User(String username) {
        username = username.toLowerCase();
        switch (username) {
            case "tyler":
                fullName = "Tyler Lee";
                address = "6787391126@vzwpix.com";
                symbols = new String[] {"AAPL", "ATVI", "BA", "BAC", "COST", "DIS", "EA", "INTC", "GE", "MSFT",
                        "NFLX", "NKE", "NVDA", "PSX", "SLB", "TSLA", "V", "VZ", "YHOO"};
                break;
            case "brandon":
                fullName = "Brandon Lee";
                address = "7705708727@vzwpix.com";
                symbols = new String[] {"ATVI"};
                break;
            default:
                System.out.println("User not found");
                // user not found in users.json...
                System.exit(0);
        }

        try {
            stocks = YahooFinance.get(symbols);
        } catch (IOException e) {
            System.out.println("Error retrieving Stock Information");
            e.printStackTrace();
        }
    }

    public String getFullName() {
        return fullName;
    }
    public String getAddress() {
        return address;
    }
    public String[] getSymbols() {
        return symbols;
    }
    public Map<String, Stock> getStocks() {
        return stocks;
    }

    public void getUsers() {
        // parse json file, could be part of constructor
    }
}
// InternetAddress.parse("8606708284@vzwpix.com"));
// InternetAddress.parse("7705708727@vzwpix.com"));

/*
    // stock initialization
    Stock apple, boeing, bankOfAmerica, costco, disney, electronicArts, intel, generalElectric, microsoft, netflix, nike,
            nvidia, phillips66, schlumberger, royalDutchShell, tesla, verizon, visa, yahoo;
        apple = boeing = bankOfAmerica = costco = disney = electronicArts = intel = generalElectric = microsoft = netflix = nike
                = nvidia = phillips66 = schlumberger = royalDutchShell = tesla = verizon = visa = yahoo = null;

                // get stock info
                try {
                    String[] symbols = new String[] {"AAPL", "BA", "BAC", "COST", "DIS", "EA", "INTC", "GE", "MSFT",
                    "NFLX", "NKE", "NVDA", "PSX", "SLB", "TSLA", "V", "VZ", "YHOO"};
                    stocks = YahooFinance.get(symbols); // single request
                    apple = stocks.get("AAPL");
                    boeing = stocks.get("BA");
                    bankOfAmerica = stocks.get("BAC");
                    costco = stocks.get("COST");
                    disney = stocks.get("DIS");
                    electronicArts = stocks.get("EA");
                    intel = stocks.get("INTC");
                    generalElectric = stocks.get("GE");
                    microsoft = stocks.get("MSFT");
                    netflix = stocks.get("NFLX");
                    nike = stocks.get("NKE");
                    nvidia = stocks.get("NVDA");
                    phillips66 = stocks.get("PSX");
                    schlumberger = stocks.get("SLB");
                    tesla = stocks.get("TSLA");
                    visa = stocks.get("V");
                    verizon = stocks.get("VZ");
                    yahoo = stocks.get("YHOO");
                } catch (IOException e) {

                }


*/

// Refrence for stock methods
// http://financequotes-api.com/javadoc/yahoofinance/quotes/stock/StockQuote.html