package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
	
		int a[]= new int[3];// static array-- size is fixed
		
		//Dynamic array--- arraylist
		//1.can contain duplicate value/elements
		//2. maintain insertion order
		//3. synchronized
		//4. allows random access to fetch the element because it stores the values on the basisi of index
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);// 0
		ar.add(20);//1
		ar.add(30);//2 
		System.out.println(ar.size());
		
		ar.add(40);//3
		ar.add(50);//4
		ar.add(50);//5
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));// to get the value from on index
		
		//to print all the values from arraylist: for loop
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
			ArrayList<Integer>ar1= new ArrayList<Integer>();
			ar1.add(100);
			// ar1.add("selinium");
			
			

			ArrayList<String>ar2= new ArrayList<String>();
			ar2.add("test");
			ar.add("selinium");
			
			
			// Empoloye class object:
			Employe e1 = new Employe ("Puja", 24,"Qa");
			Employe e2= new Employe ("irrue", 26,"Qc");
			Employe e3 = new Employe ("Nishu", 22,"admin");
			
			// create arraylist:
			ArrayList<Employe>ar4= new ArrayList<Employe>();
			ar4.add(e1);
			ar4.add(e2);
			ar4.add(e3);
			
			
			// iterator to traverse the value:
			Iterator<Employe>it= ar4.iterator();
			while(it.hasNext()) {
				Employe emp = it.next();
				System.out.println(emp.name);
				System.out.println(emp.age);
				System.out.println(emp.dept);
				
		
			}
			
			//****************
			
			//addALL()

			ArrayList<String>ar5= new ArrayList<String>();
			ar5.add("test");
			ar5.add("selinium");
			ar5.add("qtp");
			
			
			

			ArrayList<String>ar6= new ArrayList<String>();
			ar5.add("dev");
			ar5.add("java");
			ar5.add("html");
			
			ar5.addAll(ar6);
			for(int i1=0; i1<ar5.size() ; i1++){
				System.out.println(ar5.get(i1));
				
				
				
				
			}
			
			 // removalALL:
			ar5.removeAll(ar6);
			for(int i1=0; i1<ar5.size(); i1++) {
				System.out.println(ar5.get(i1));
				
				
				//retainedALL()
				
				ArrayList<String>ar7= new ArrayList<String>();
				ar5.add("test");
				ar5.add("selinium");
				ar5.add("qtp");
				
				

				ArrayList<String>ar8= new ArrayList<String>();
				ar5.add("dev");
				ar5.add("java");
				ar5.add("html");
				
				
				
			}
	
			
		}
		
	}
		

}
					
		//
		

	


