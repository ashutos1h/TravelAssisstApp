package com.all.journeyplanner.travelassist.contoller;

import com.all.journeyplanner.travelassist.model.AssistanceProvider;
import com.all.journeyplanner.travelassist.model.AssistanceProviderInput;
import com.all.journeyplanner.travelassist.service.TravelAssistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TravelAssistController {

	@Autowired
	TravelAssistService travelAssistService;

	/*@CrossOrigin(origins = "*")
	 * @GetMapping(value = "/getAssistanceProvider/{fromDate}/{toDate}/{flagDate}/{source}/{destination}/{serviceType}/{userType}")
	@RequestMapping(method= RequestMethod.POST,value="/addtoBasket", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public String addtoBasket(@RequestBody UserSelection selectedItem) throws MaximumCostException, InvalidEntryException {
		return shoppingCartService.addtoBasket(selectedItem);
	}*/

	@CrossOrigin(origins = "*")
	@RequestMapping(method= RequestMethod.GET,value="/getAssistanceProvider", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public List<AssistanceProvider> generateAssiatanceProvider(@RequestBody AssistanceProviderInput inputValues) {
		return travelAssistService.generateAllItems(inputValues);
	}

	/* @CrossOrigin(origins = "*")
	@GetMapping(value = "/getBasketStatus")
	public Basket getBasketStatus() throws CartEmptyException {

		return shoppingCartService.getBasketStatus();
	}*/
}
