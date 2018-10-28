
package domain;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Application extends DomainEntity {

	// Constructors

	public Application() {
		super();
	}


	// Attributes ----------------------------------------------------------------------

	private Date	registerMoment;
	private String	status;
	private Double	offeredPrice;
	private String	comment;
	private String	reasonDenied;


	@NotNull
	@Past
	public Date getRegisterMoment() {
		return this.registerMoment;
	}

	public void setRegisterMoment(final Date registerMoment) {
		this.registerMoment = registerMoment;
	}

	@Pattern(regexp = "^PENDING|ACCEPTED|REJECTED$")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	@Min(0)
	@Valid
	public Double getOfferedPrice() {
		return this.offeredPrice;
	}

	public void setOfferedPrice(final Double offeredPrice) {
		this.offeredPrice = offeredPrice;
	}

	@NotBlank
	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

	@NotBlank
	public String getReasonDenied() {
		return this.reasonDenied;
	}

	public void setReasonDenied(final String reasonDenied) {
		this.reasonDenied = reasonDenied;
	}

}