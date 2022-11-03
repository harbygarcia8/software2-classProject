package com.mipresupuesto.personalbudget.domain;

import java.util.UUID;

import static com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID.DEFAULT_UUID;
import static com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID.getDefaultUUID;

public final class YearDomain {
	
	private  UUID id;
	private  int year;
	
	private YearDomain( final UUID id, final int year) {
		setId(DEFAULT_UUID);
		setYear(year);
		
	}
	
	public static YearDomain create(final UUID id, final int year) {
		return new YearDomain(id, year);
		
	}

	public final UUID getId() {
		return id;
	}

	public final int getYear() {
		return year;
	}

	private final void setId(final UUID id) {
		this.id = getDefaultUUID(id);
	}

	private final void setYear(int year) {
		this.year = year;
	}

	
	
	
	
}
