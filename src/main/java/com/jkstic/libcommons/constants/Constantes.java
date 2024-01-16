package com.jkstic.libcommons.constants;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import com.jkstic.libcommons.Signature;

public class Constantes {
	
	//CORE
	public final static String DIVISOR = "==========================";
	public final static String LOGS_PROCESSORS = "LOGS_PROCESSORS";
	public final static String LOGS_WS_PROCESSORS = "LOGS_WS_PROCESSORS";

	// BINANCE URLS https://binance-docs.github.io/apidocs/spot/en/#introduction
	public final static String BINANCE_SERVER_HOST = "https://api.binance.com";
	public final static String BINANCE_SERVER_TIME = BINANCE_SERVER_HOST + "/api/v3/time";
	public final static String BINANCE_INFO_EXCHANGE = BINANCE_SERVER_HOST + "/api/v3/exchangeInfo";
	public final static String BINANCE_ORDER_BOOK = BINANCE_SERVER_HOST + "/api/v3/depth";
	public final static String BINANCE_RECENT_TRADES = BINANCE_SERVER_HOST + "/api/v3/trades";
	public final static String BINANCE_HISTORICAL_TRADES = BINANCE_SERVER_HOST + "/api/v3/historicalTrades";
	public final static String BINANCE_AGG_TRADES = BINANCE_SERVER_HOST + "/api/v3/aggTrades";
	public final static String BINANCE_TICKER_24H = "/api/v3/ticker/24hr";
	public final static String BINANCE_PRICE = BINANCE_SERVER_HOST + "/api/v3/ticker/price";
	public final static String BINANCE_AVG_PRICE = BINANCE_SERVER_HOST + "/api/v3/avgPrice";
	public final static String BINANCE_ORDER_BOOK_TICKER = BINANCE_SERVER_HOST + "/api/v3/ticker/bookTicker";
	public final static String BINANCE_DEPOSIT_ADRESS = BINANCE_SERVER_HOST + "/sapi/v1/capital/deposit/address";
	public final static String BINANCE_TRADING_STATUS = BINANCE_SERVER_HOST + "/sapi/v1/account/apiTradingStatus";
	public final static String BINANCE_TRADE_FEE = BINANCE_SERVER_HOST + "/sapi/v1/asset/tradeFee";
	public final static String BINANCE_APIKEY_PERMISIONS = BINANCE_SERVER_HOST + "/sapi/v1/account/apiRestrictions";
	public final static String BINANCE_MY_WALLET = BINANCE_SERVER_HOST + "/sapi/v1/capital/config/getall";
	public final static String BINANCE_ALL_ORDERS = BINANCE_SERVER_HOST + "/api/v3/allOrders";
//	public final static String BINANCE_SERVER_TIME = "https://api.binance.com/api/v3/time";
//	public final static String BINANCE_INFO_EXCHANGE = "https://api.binance.com/api/v3/exchangeInfo";
//	public final static String BINANCE_ORDER_BOOK = "https://api.binance.com/api/v3/depth";
//	public final static String BINANCE_RECENT_TRADES = "https://api.binance.com/api/v3/trades";
//	public final static String BINANCE_HISTORICAL_TRADES = "https://api.binance.com/api/v3/historicalTrades";
//	public final static String BINANCE_AGG_TRADES = "https://api.binance.com/api/v3/aggTrades";
//	public final static String BINANCE_TICKER_24H = "https://api.binance.com/api/v3/ticker/24hr";
//	public final static String BINANCE_PRICE = "https://api.binance.com/api/v3/ticker/price";
//	public final static String BINANCE_AVG_PRICE = "https://api.binance.com/api/v3/avgPrice";
//	public final static String BINANCE_ORDER_BOOK_TICKER = "https://api.binance.com/api/v3/ticker/bookTicker";
//	public final static String BINANCE_DEPOSIT_ADRESS = "https://api.binance.com/sapi/v1/capital/deposit/address";
//	public final static String BINANCE_TRADING_STATUS = "https://api.binance.com/sapi/v1/account/apiTradingStatus";
//	public final static String BINANCE_TRADE_FEE = "https://api.binance.com/sapi/v1/asset/tradeFee";
//	public final static String BINANCE_APIKEY_PERMISIONS = "https://api.binance.com/sapi/v1/account/apiRestrictions";
//	public final static String BINANCE_MY_WALLET = "https://api.binance.com/sapi/v1/capital/config/getall";
//	public final static String BINANCE_ALL_ORDERS = "https://api.binance.com/api/v3/allOrders";

	// BINANCE_HEADERS
	public final static Map<String, String> HEADERS_BINACE = new HashMap<String, String>();

	// BINANCE_QUERY_PARAMS
	public final static LinkedHashMap<String, String> DATAQUERYPARAMS_BINANCE = new LinkedHashMap<String, String>();
	
	// HUOBI URLS https://huobiapi.github.io/docs/spot/v1/en/#introduction || https://open.huobigroup.com/?name=get-order-detail-by-order-id
	public final static String HUOBI_HOST = "https://api.huobi.pro";
	public final static String HUOBI_MARKETS_STATUS = HUOBI_HOST + "/v2/market-status";
	public final static String HUOBI_SUPPORT_CURRENCIES = HUOBI_HOST + "/v1/common/currencys";
	public final static String HUOBI_TRADING_SYMBOLS = HUOBI_HOST + "/v1/common/symbols";
	public final static String HUOBI_CURRENT_TIMESTAMP = HUOBI_HOST + "/v1/common/timestamp";
	public final static String HUOBI_CURRECIES_AND_CHAINS = HUOBI_HOST + "/v2/reference/currencies";
	public final static String HUOBI_KLINES_AND_CANDLES = HUOBI_HOST + "/market/history/kline";
	public final static String HUOBI_MARKET_DEPTH = HUOBI_HOST + "/market/depth";
	public final static String HUOBI_LATTEST_AGGREGATED_TICKET = HUOBI_HOST + "/market/detail/merged";
	public final static String HUOBI_LATTEST_TICKET_FOR_ALL_PAIRS = HUOBI_HOST + "/market/tickers";
	public final static String HUOBI_ACCOUNT_BALANCE_OF_SPECIFIC_ACCOUNT = HUOBI_HOST + "/market/trade";
	public final static String HUOBI_MOST_RECENT_TRADES = HUOBI_HOST + "/market/history/trade";
	public final static String HUOBI_LAST_24H_MARKET_SUMMARY = HUOBI_HOST + "/market/detail";
	public final static String HUOBI_REAL_TIME_NAV = HUOBI_HOST + "/market/etp";
	

	// RESTCLIENT
	public final static Map<String, String> HEADERS = new HashMap<String, String>();

	// DATA
	public final static String FORMAT_DATE = "yyyy-MM-dd HH:mm:ss";

	// JWT
	public final static String HEADER = "Authorization";
	public final static String PREFIX = "Bearer ";
	public final static String SECRET = "AtalayaSystem";
	public final static String JWTAUTH = "authorities";

	static {
		HEADERS.put("accept", "*/*");
		HEADERS.put("Content-Type", "application/json");
	}

	public static Map<String, String> getHeadersBinance(String apiKey) {
		HEADERS_BINACE.put("Content-Type", "application/json");
		HEADERS_BINACE.put("X-MBX-APIKEY", apiKey);
		return HEADERS_BINACE;
	}

	public static LinkedHashMap<String, String> getQueryParamsBinance(String apiSecret) {
		DATAQUERYPARAMS_BINANCE.clear();
		String timestamp = String.valueOf(new Date().getTime());
		String timestampParam = "timestamp=" + timestamp;

		DATAQUERYPARAMS_BINANCE.put("timestamp", timestamp);
		DATAQUERYPARAMS_BINANCE.put("signature", Signature.getSignature(timestampParam, apiSecret));

		return DATAQUERYPARAMS_BINANCE;
	}

	public static LinkedHashMap<String, String> getQueryParamsBinance(String apiSecret,
			LinkedHashMap<String, String> dataQueryParams) {
		DATAQUERYPARAMS_BINANCE.clear();
		String timestamp = String.valueOf(new Date().getTime());

		dataQueryParams.forEach((keyParam, keyValue) -> {
			DATAQUERYPARAMS_BINANCE.put(keyParam, keyValue);
		});
		DATAQUERYPARAMS_BINANCE.put("timestamp", timestamp);

		AtomicReference<String> paramHash = new AtomicReference<String>("");

		DATAQUERYPARAMS_BINANCE.forEach((keyParam, keyValue) -> {
			paramHash.set(paramHash.get() + keyParam + "=" + keyValue + "&");
		});

		paramHash.getAndSet(paramHash.get().substring(0, paramHash.get().length() - 1));

		DATAQUERYPARAMS_BINANCE.put("signature", Signature.getSignature(paramHash.get(), apiSecret));

		return DATAQUERYPARAMS_BINANCE;
	}
}
