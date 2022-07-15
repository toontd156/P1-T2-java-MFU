package lab9;

import java.util.ArrayList;
public class MainArrayList {
	public static void main(String[] args) {
	    ArrayList<String> bike = new ArrayList<String>();
	    bike.add("Ducati");
	    bike.add("KTm");
	    bike.add("BMW");
	    System.out.println(bike);
	    //To access an element of index1 in ArrayList
	    System.out.println("Name of the second bike = "+ bike.get(1)); 
	    
	    //To modify element value of index1 in ArrayList to “KTM”
	    System.out.println("\n>>Changing name of the second bike");
        bike.set(1, "KTM");
	    System.out.println(bike);
	    
	    //To add new element (index3), name of the fourth bike is “Honda” 
	    bike.add("Honda");
	    
	    //To find out how many elements an ArrayList have
	    System.out.println("\n>>Size of ArrayList = "+ bike.size());
	    
	    //Loop through an ArrayList using foreach loop
	    System.out.println("\n>>Loop using foreach loop");
	    for (String i : bike) {
            System.out.println(i);
        }
	    
	}
}

