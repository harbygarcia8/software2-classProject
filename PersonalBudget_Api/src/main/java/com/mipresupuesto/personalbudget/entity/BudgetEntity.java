package com.mipresupuesto.personalbudget.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import static com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID.DEFAULT_UUID;
import static com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID.getDefaultUUID;

@Entity
@Table(name="Budget")
public final class BudgetEntity {
	
	
	@Id
	@Column(name = "id")
	private UUID id;
	@ManyToOne
	@JoinColumn(name = "idYear")
	private YearEntity year;
	@ManyToOne
	@JoinColumn(name = "idPerson")
	private PersonEntity person;
	
	
	public BudgetEntity() {
		setId(DEFAULT_UUID);
        setYear(new YearEntity());
        setPerson(new PersonEntity());
    }
	
	
	
	public BudgetEntity(final YearEntity year, final PersonEntity person) {
		setId(DEFAULT_UUID);
		setYear(year);
		setPerson(person);
	}
	
	public final YearEntity getYear() {
		
		return year;
	}
	public final void setYear(YearEntity year) {
		this.year = year;
	}
	public final PersonEntity getPerson() {
		if (person == null) {
			setPerson(PersonEntity.create());
			
		}
		return person;
	}
	public final void setPerson(PersonEntity person) {
		this.person = person;
	}



	public final UUID getId() {
		if(id == null) {
			setId(DEFAULT_UUID);
		}
		return id;
	}

	public final void setId(final UUID id) {
		this.id = getDefaultUUID(id);
	}

	
	
	
	
}
