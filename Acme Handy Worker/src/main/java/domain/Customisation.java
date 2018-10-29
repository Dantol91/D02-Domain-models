
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Customisation extends DomainEntity {

	// Constructors

	public Customisation() {
		super();
	}


	// Atributes

	private String				bannerURL;
	private String				welcomeMessage;
	private Double				VATTax;
	private String				countryCode;
	private Collection<String>	spamWords;
	private Collection<String>	creditCardMakes;
	private Integer				finderReturn;
	private Integer				finderCache;
	private Collection<String>	positiveWords;
	private Collection<String>	negativeWords;


	@URL
	public String getBannerURL() {
		return this.bannerURL;
	}

	public void setBannerURL(final String bannerURL) {
		this.bannerURL = bannerURL;
	}

	@NotBlank
	public String getWelcomeMessage() {
		return this.welcomeMessage;
	}

	public void setWelcomeMessage(final String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}

	@ElementCollection
	@NotEmpty
	public Collection<String> getCreditCardMakes() {
		return this.creditCardMakes;
	}

	public void setCreditCardMakes(final Collection<String> creditCardMakes) {
		this.creditCardMakes = creditCardMakes;
	}

	@ElementCollection
	@NotEmpty
	public Collection<String> getPositiveWords() {
		return this.positiveWords;
	}

	public void setPositiveWords(final Collection<String> positiveWords) {
		this.positiveWords = positiveWords;
	}

	@ElementCollection
	@NotEmpty
	public Collection<String> getNegativeWords() {
		return this.negativeWords;
	}

	public void setNegativeWords(final Collection<String> negativeWords) {
		this.negativeWords = negativeWords;
	}

	public Double getVATTax() {
		return this.VATTax;
	}

	public void setVATTax(final Double vATTax) {
		this.VATTax = vATTax;
	}

	@NotBlank
	@Min(1)
	@Max(999)
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(final String countryCode) {
		this.countryCode = countryCode;
	}

	public Collection<String> getSpamWords() {
		return this.spamWords;
	}

	public void setSpamWords(final Collection<String> spamWords) {
		this.spamWords = spamWords;
	}

	@Max(100)
	public Integer getFinderReturn() {
		return this.finderReturn;
	}

	public void setFinderReturn(final Integer finderReturn) {
		this.finderReturn = finderReturn;
	}

	@Min(1)
	@Max(24)
	public Integer getFinderCache() {
		return this.finderCache;
	}

	public void setFinderCache(final Integer finderCache) {
		this.finderCache = finderCache;
	}

}
