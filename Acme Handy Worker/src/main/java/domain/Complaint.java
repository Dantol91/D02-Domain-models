
package domain;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Complaint extends DomainEntity {

	// Constructors

	public Complaint() {
		super();
	}


	// Attributes

	private String	ticker;
	private Date	moment;
	private String	description;
	private String	attachmentLink;


	@Pattern(regexp = "\\d{6}-[A-Z0-9]{6}")
	@Column(unique = true)
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@NotNull
	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@URL
	public String getAttachmentLink() {
		return this.attachmentLink;
	}

	public void setAttachmentLink(final String attachmentLink) {
		this.attachmentLink = attachmentLink;
	}

}
