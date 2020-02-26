package com.all.journeyplanner.travelassist.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.all.journeyplanner.travelassist.model.AssistanceProvider;
import com.all.journeyplanner.travelassist.model.AssistanceProviderEntity;

public abstract class TravelAssistDao implements CrudRepository<AssistanceProvider, List> {
	
	//public List<AssistanceProviderEntity> findAllById( AssistanceProvider ) { 
		
//}






//- The type TravelAssistDao must implement the inherited abstract method CrudRepository<AssistanceProviderEntity,List<String>>.findAllById(Iterable<List<String>>)


	@Override
	public <S extends AssistanceProvider> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends AssistanceProvider> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<AssistanceProvider> findById(List id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(List id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<AssistanceProvider> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<AssistanceProvider> findAllById(List<AssistanceProvider> assistanceProvider) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(List id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(AssistanceProvider entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends AssistanceProvider> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}