
package domain;

import javax.persistence.Column;

import org.hibernate.validator.constraints.NotBlank;

public class Category extends DomainEntity {

	// Constructor

	public Category() {
		super();
	}


	// Attributes

	private String	name;


	@NotBlank
	@Column(unique = true)
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
