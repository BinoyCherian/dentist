package fr.epita.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import fr.epita.datamodel.Dentist;


/**
 * Enterprise class that will read the csv file.
 * 
 * @author raaool
 *
 */
public class CsvReader {

	/**
	 * Generates a map out of the csv file to be used by the controller.
	 * 
	 * @return
	 */
	public static Map<String, Dentist> read(){
		
		/** The buffered reader. */
		BufferedReader br = null;
		
		/** The map holding dentist information. */
		Map<String,Dentist> dentistMap=new HashMap<String, Dentist>();
		
		try {
			
			InputStream is = CsvReader.class.getResourceAsStream("csvFile.csv");
			//br = new BufferedReader(new FileReader("Design4Green_data_set.csv"));
			br = new BufferedReader(new InputStreamReader(is));
			
			String line=null;
			
			/**
			 * Since the file holds only 1000 records, We have decided not to use a database to save 
			 * energy, money and memory related to hoisting a database for a limited set of data. Most of the
			 * clinic related information have lesser possibilities of changing. 
			 * 
			 */
			
			while((line=br.readLine())!=null) {
			
				String[] objects=line.split(",");
				for(int i=0;i<objects.length;i++) {
					
					//populate object
					Dentist dentist=new Dentist();
					
					dentist.setId(((objects[0]!=null|| objects[0]!="")?objects[0].trim():null));
					dentist.setFirstName((objects[1]!=null || objects[1]!="")?objects[1].trim():null);
					dentist.setLastName((objects[2]!=null || objects[2]!="")?objects[2].trim():null);
					dentist.setEmailAddress((objects[3]!=null || objects[3]!="")?objects[3].trim():null);
					dentist.setGender((objects[4]!=null || objects[4]!="")?objects[4].trim():null);
					dentist.setAddress((objects[5]!=null || objects[5]!="")?objects[5].trim():null);
					dentist.setCity((objects[6]!=null || objects[6]!="")?objects[6].trim():null);
					dentist.setPhoneNumber((objects[7]!=null || objects[7]!="")?objects[7].trim():null);
					
					try{
						dentist.setImage(((objects[8]!=null || objects[8]!="")?objects[8].trim():null));
					}catch(ArrayIndexOutOfBoundsException str) {
						//TODO log using log4j
						//System.out.println("Error while reading image:"+dentist.getId());
					}
					
					try{
						dentist.setOpening((objects[9]!=null || objects[9]!="")?objects[9].trim():null);
					}catch(ArrayIndexOutOfBoundsException str) {
						//System.out.println("Error while reading opening details:"+dentist.getId());
						//TODO log using log4jSystem.out.println(dentist);
					}
					
					try{
						dentist.setSpeciality((objects[10]!=null || objects[10]!="")?objects[10].trim():null);
					}catch(Exception e) {
						//TODO use log4j for logging later
						//System.out.println("Error "+e.getMessage());
					}
					
					dentistMap.put(dentist.getId(), dentist);
				}
			}
			
			System.out.println("Number of records read: "+dentistMap.size());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dentistMap;
	}
}
