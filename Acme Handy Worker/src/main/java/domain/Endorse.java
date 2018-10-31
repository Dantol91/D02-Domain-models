
package domain;

import java.util.Collection;

import javax.validation.Valid;

public class Endorse extends DomainEntity {

	// Constructor

	public Endorse() {
		super();
	}


	// Attributes

	// Relationships

	private Collection<Endorsement>	endorsements;


	@Valid
	public Collection<Endorsement> getEndorsements() {
		return this.endorsements;
	}

	public void setEndorsements(final Collection<Endorsement> endorsements) {
		this.endorsements = endorsements;
	}

}
