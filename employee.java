

import java.util.*;
import java.time.LocalDateTime;



public class employee{
	//Member Variables*
	private String name = " ";				
	private	int idNumber = 0;			
	private static LocalDateTime currentDate = LocalDateTime.now();				
							
	

	public employee(){	
		
	}

	public employee(String n){	
		name = n;
	}
	
	public employee(String n, int i){	
		name = n;
		idNumber = i;
	}
		public employee(String n, int i, LocalDateTime c){	
		name = n;
		idNumber = i;
		currentDate = c;
	}
	

		public String getName(){
		return name;  
	}
	 
		public void setName(String n){
		name = n;
	}

		public int getidNumber(){
		return idNumber;  
	}

		public void setidNumber(int i){
		idNumber = i;
	}

		public static LocalDateTime getcurrentDate(){
		return currentDate;  
	}

		public void setcurrentDate(LocalDateTime c){
			currentDate = c; 
	}		
}
		 

	