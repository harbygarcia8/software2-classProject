package com.mipresupuesto.personalbudget.application.dtoassembler.implementation;

import org.springframework.stereotype.Component;

import com.mipresupuesto.personalbudget.application.dtoassembler.DTOAssembler;
import com.mipresupuesto.personalbudget.domain.PersonDomain;
import com.mipresupuesto.personalbudget.dto.PersonDTO;

@Component
public final  class PersonDTOAssembler implements DTOAssembler<PersonDTO, PersonDomain> {

	@Override
	public PersonDomain assembleDomain(PersonDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonDTO assembleDTO(PersonDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

}