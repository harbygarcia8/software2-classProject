package com.mipresupuesto.personalbudget.entity;

import static com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID.DEFAULT_UUID;
import static com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID.getDefaultUUID;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Year")
public final class YearEntity {

		@Id
		@Column(name = "id")
		private UUID id;
		@Column(name = "year")
		private int year;
		
		
		public YearEntity() {
			setId(DEFAULT_UUID);
			setYear(0);
			
		}
		
		public YearEntity(UUID id, int year) {
			setId(id);
			setYear(year);
			
		}
		
		public static final YearEntity create() {
			return new YearEntity();
			
		}
		
		public final UUID getId() { 
			if(id == null) {
				setId(DEFAULT_UUID);
			}
			return id;
		}
		public final void setId(UUID id) {
			this.id = getDefaultUUID(id);
		}
		public final int getYear() {
			if(year < 0) {
				setYear(0);
			}
			return year;
		}
		public final void setYear(int year) {
			this.year = year;
		}
	
	
	
	
}
