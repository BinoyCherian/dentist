package fr.epita.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.epita.datamodel.Dentist;
import fr.epita.utility.CsvReader;

/**
 * Enterprise controller to handle the controls and user requests for the application.
 * 
 * @author Binoy Cherian
 *
 */
@Controller
public class WireController {
	
	/** The map holding dentist information. */
	private Map<String,Dentist> dentistMap;

	/** List of dentist instances. */
	private ArrayList<Dentist> dentistList;
	
	/** Default Controller*/
	public WireController() {
		
		/**
		 * Read the csv file and load the data in to a map.
		 */
		dentistMap=CsvReader.read();
	}
	
	public ModelAndView showWelcome() {
		return fireIndex();
	}
	
	/**
	 * Method that populates city and other basic informations for the first page.
	 * 
	 * @return ModelAndView The model and view object
	 */
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView fireIndex() {
		/**
		 * Need to populate the data from the db to the modelAndView object to be used for the index page.
		 */
		String json=null;
		ModelAndView mv=new ModelAndView();
		
		ObjectMapper objectMapper=new ObjectMapper();
		
		ArrayList<String> locationList=new ArrayList<>();
		//Get all the locations of the doctors to be sent/populated to the UI
		for(Entry<String,Dentist> entry: dentistMap.entrySet()) {
			String city=(entry.getValue().getCity());
			if(city!=null && !locationList.contains(city)) {
			locationList.add("\""+city+"\"");
			}
		}
		//TODO log the number and names of cities before calling the model object using log4j framework.
		
		
		try {
			json=objectMapper.writeValueAsString(dentistMap);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		mv.addObject("locationList", locationList);
		mv.addObject("dentistJson",json);
		
		System.out.println(json);
		mv.setViewName("index");
		//return new ModelAndView("index", "locationList", locationList);
		return mv;
	}
	
	
	/**
	 * The method to return a single dentist information.
	 * 
	 * @param id the unique dentist id
	 * @return json The dentist details in json format
	 */
	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody Dentist testString(@PathVariable String id) {
		return dentistMap.get(getDentistMap().get(id));
	}
	
	/**
	 * This method handles search by the dentist's speciality.
	 * 
	 * @param speciality The speciality of the dentist
	 * @return List The list of dentist details
	 */
	public @ResponseBody List<Dentist> getDentistBySpeciality(@PathVariable String speciality){
		
		//temporary list
		dentistList=new ArrayList<Dentist>();
		
		//loop through the map and return list of dentist based on speciality
		for(Entry<String,Dentist> entry: dentistMap.entrySet()) {
			if(entry.getValue().getSpeciality().equalsIgnoreCase(speciality)) {
				dentistList.add((Dentist) entry.getValue());
			}
		}
		return getDentistList();
		
	}
	
	/**
	 * This method will be fired if the user tries to search something random in the search
	 * bar.
	 * 
	 * @param random the parameter from the UI
	 * @return json The json holding list of dentist information
	 */
	public @ResponseBody List<Dentist> searchCriteria(@PathVariable String random){
		
		dentistList=new ArrayList<Dentist>();
		
		/**
		 * Search only specific columns of the database as first name, last name, gender, speciality.
		 */
		
		for(Entry<String, Dentist> entry: dentistMap.entrySet()) {
			if(entry.getValue().getFirstName().contains(random)|| entry.getValue().getLastName().contains(random)
			||entry.getValue().getGender().contains(random)||entry.getValue().getSpeciality().contains(random)) {
			
				dentistList.add(entry.getValue());
			}
		}
		return getDentistList();
	}

	/**
	 * Gets the map containing the dentist information.
	 * 
	 * @return map The map holding dentist information
	 */
	public Map<String, Dentist> getDentistMap() {
		return dentistMap;
	}

	/**
	 * Gets the list of the dentist information.
	 * This method does not necessarily return a populated arrayList all the time.
	 * Use this with some methods like searchCriteria and getDentistBySpeciality.
	 * 
	 * @return the dentistList
	 */
	public ArrayList<Dentist> getDentistList() {
		return dentistList;
	}
}
