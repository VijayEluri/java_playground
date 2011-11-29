package cz.bernhard.playground.cv;

import java.math.BigDecimal;

import lombok.Data;
import lombok.ToString;

/**
 * You need to have installed Project Lombok otherwise it has compilation errors.
 * 
 * @author mbernhard
 *
 */
public class Money {

	private final Amount amount;
	private final Currency currency;
			
	public Money(Amount amount, Currency currency) {
		this.amount = amount;
		this.currency = currency;		
	}

	public static Money forCzech(BigDecimal amount) {
		return new Money(Amount.of(amount), Currency.CZK);
	}	

	public static Money forCzech(int amount) {
		return forCzech(new BigDecimal(amount));
	}

	@Override
	public String toString() {
		return amount.getAmount() + " " + currency.getCurrencyCode(); // if your ide show error here it's because you haven't got Project Lombok installed
	}
	
	@Data
	public static class Amount {
		
		private final BigDecimal amount;
		
		private Amount(BigDecimal amount) {
			this.amount = amount;			
		}
		
		public static Amount of(BigDecimal amount) {
			return new Amount(amount);
		}
		
	}
	
	@Data
	public static class Currency {
		
		public final static Currency EUR = new Currency("eur", "euro");
		public final static Currency USD = new Currency("usd", "american dolars");
		public final static Currency CZK = new Currency("czk", "czech crowns");
		
		private final String currencyCode;
		private final String name;
		
		public Currency(String currencyCode, String name) {
			this.currencyCode = currencyCode;
			this.name = name;
		}
		
		
	}

	
	
}
