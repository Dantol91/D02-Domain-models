
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class SpamTerm extends DomainEntity {

	// Constructor

	public SpamTerm() {
		super();
	}


	// Attributes

	private String	name;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
