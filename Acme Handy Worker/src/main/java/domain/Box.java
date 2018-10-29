
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Box extends DomainEntity {

	// Constructors

	public Box() {
		super();
	}


	// Attributes 

	private String	name;
	private Boolean	systemBox;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Boolean getSystemBox() {
		return this.systemBox;
	}

	public void setSystemBox(final Boolean systemBox) {
		this.systemBox = systemBox;
	}

}
