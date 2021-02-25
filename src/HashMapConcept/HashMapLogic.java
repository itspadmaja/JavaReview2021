package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapLogic {

	public static void main(String[] args) {
		
		//collection --dynamic
		//stores the values --Key , Value pair
		// can have one null key
		// can have any number of  null values
		// it doesNOt store values by Order/Index 
		// if keys are same(duplicate keys are allowed), it will pick the latest values
		
		Map<String , String> Emp = new HashMap<String , String >();
		Emp.put("EmpId", "101");
		Emp.put("Name", "Krishna");
		Emp.put("City", "Dallas");
		Emp.put(null, "1000");
		Emp.put(null, "2000");
		Emp.put("Job", null);
		Emp.put("Salary", null);
		Emp.put("City", "Austin");
		
		System.out.println(Emp.get("EmpId"));
		System.out.println(Emp.get("Name"));
		System.out.println(Emp.get("City"));
		System.out.println(Emp.get(null));
		System.out.println(Emp.get("age"));//null
		System.out.println(Emp.get("Job"));
		System.out.println(Emp.get("Salary"));
		
		System.out.println("*********************");
		
		//entrySet : to get all values of Keys , Value
		
		for(Map.Entry<String, String> entry : Emp.entrySet()){
			System.out.println(" Key is : " + entry.getKey()  + " ," + "Value is : " + entry.getValue());
		}
		System.out.println("**********************");
		//KeySet() : to fetch all only Keys
		
		for(String s : Emp.keySet()) {
			System.out.println(" key is :  " + s);
		}
		
		System.out.println("*****************************");
		//Values() : for getting all the values
		
		for(String v : Emp.values()) {
			System.out.println(" value is :  " + v);
		}
		
		System.out.println("*********************************");
		//lambda
		
		Emp.forEach((k,v)->System.out.println(k+v));
				
	}

}
