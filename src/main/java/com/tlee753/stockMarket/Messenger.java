package com.tlee753.stockMarket;

import yahoofinance.Stock;

import java.util.Map;

public class Messenger {
    private StringBuilder myMessage;
    private Map<String, Stock> userStocks;

    public Messenger() {
        myMessage = new StringBuilder(0);
        myMessage.append("No message specified");
    }

    public Messenger(User myUser) {
        myMessage = new StringBuilder(0);
        userStocks = myUser.getStocks();
    }

    public void generateMessage(String option) {
        option = option.toLowerCase();
        switch (option) {
            case "all":
                for (Map.Entry<String, Stock> stock : userStocks.entrySet()) {
                    myMessage.append(stock.getKey());
                    myMessage.append(": ");
                    myMessage.append(stock.getValue().getQuote().getPrice().toString());
                    myMessage.append("\n");
                }
                break;
            default:
                System.out.println("Option not defined");
                System.exit(0);
        }
    }

    public String getMessage() {
        return myMessage.toString();
    }
}

/*
    // formats and builds message
    // inputs -> all (all of the user stocks...)
*/