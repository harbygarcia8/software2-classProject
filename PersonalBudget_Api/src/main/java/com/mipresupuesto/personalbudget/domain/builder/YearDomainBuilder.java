package com.mipresupuesto.personalbudget.domain.builder;
import java.util.UUID;
import static com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID.DEFAULT_UUID;
import static com.mipresupuesto.personalbudget.crosscutting.utils.UtilUUID.getDefaultUUID;
import com.mipresupuesto.personalbudget.domain.YearDomain;

public class YearDomainBuilder {

	private  UUID id;
	private  int year;
	
	private YearDomainBuilder() {
		setId(DEFAULT_UUID);
		setYear(0);
		
	}

	private final UUID getId() {
		return id;
	}

	private final int getYear() {
		return year;
	}

	public final YearDomainBuilder setId(UUID id) {
		this.id = getDefaultUUID(id);
		return this;
	}

	public final YearDomainBuilder setYear(int year) {
		this.year = year;
		return this;
	}
	
	public static final YearDomainBuilder get() {
		return new YearDomainBuilder();
	}
	
	public YearDomain build() {
		return YearDomain.create(getId(), getYear());
		
	}

}
