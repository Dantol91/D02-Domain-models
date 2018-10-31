
package domain;

import java.util.Collection;

import javax.validation.constraints.NotNull;

public class Referee extends Actor {

	// Constructor

	public Referee() {
		super();
	}


	// Attributes

	// Relationships

	private Collection<Complaint>	complaints;


	@NotNull
	public Collection<Complaint> getComplaints() {
		return this.complaints;
	}

	public void setComplaints(final Collection<Complaint> complaints) {
		this.complaints = complaints;
	}

}
