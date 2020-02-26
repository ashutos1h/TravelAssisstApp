package com.all.journeyplanner.travelassist.service;

import com.all.journeyplanner.travelassist.dao.TravelAssistDao;
import com.all.journeyplanner.travelassist.model.AssistanceProvider;
import com.all.journeyplanner.travelassist.model.AssistanceProviderInput;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import javax.inject.Singleton;

/**
 * 
 * ShoppingCartService provides logical retrieval of items based on categories
 * 
 * @author Shruti Mahapatra
 *
 */

@Singleton
@Service
public class TravelAssistService {

	private static final Logger LOG = LoggerFactory.getLogger(TravelAssistService.class);

	private TravelAssistService(){}

	private static TravelAssistService INSTANCE;
	
	public static TravelAssistService getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new TravelAssistService();
		}
		return INSTANCE;
	}
	@Autowired
	TravelAssistDao travelAssistDao;
	
	//static List<Category> categories = new ArrayList<> ();
	//static Basket basket = new Basket();

	

	/***
	 * This method generated a list of Categories of size maxCategories, configurable
	 * each category consists of Items(configurable via application.properties)
	 * @return List of Categories
	 */
	public List<AssistanceProvider> generateAllItems(AssistanceProviderInput inputValues){
		List<AssistanceProvider> assistanceProvider = new ArrayList<> ();
		String fromDate = inputValues.getFromDate();
		String ToDate = inputValues.getToDate();
		String Source = inputValues.getSource();
		String Dest = inputValues.getDestination();
		String ServiceType = inputValues.getServiceType();
		String UserType = inputValues.getUserType();
		//String FlagRange = inputValues.getFlagRange();
		if(UserType == "true");		
		//travelAssistDao.findAll(fromDate,ToDate, Source, Dest, ServiceType, UserType ).forEach(assistanceProvider :: add);
		travelAssistDao.findAllById(assistanceProvider);
		return assistanceProvider;	
	}

	


}
