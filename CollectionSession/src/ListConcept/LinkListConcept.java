package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListConcept {

	public static void main(String[] args) {
	
      LinkedList<String> ll = new LinkedList<String>();
      // add:
      
      ll.add("test");
      ll.add("qtp");
      ll.add("selinium");
      ll.add("RFO");
      ll.add("Afo");
      
      //print
      System.out.println("content of linkedlist;"+ ll);
      
      // addfirst:
      ll.addFirst("Mumma");
      ll.addLast("puja");
      
      System.out.println("conyent of linkedlist;"+ll);
      
      //get:
      
      System.out.println((ll.get(0)));
      
      //set:
      ll.set(0, "puja");
      System.out.println(ll.get(0));
      
      // remove first and last element
      
      ll.removeFirst();
      ll.removeLast();
      System.out.println("content of linkedlist;"+ll);
      
      ll.remove(3);
      System.out.println("content of linkedlist;"+ll);
      
      //how to print all the values of linkedlist:
      //for loop
      
      System.out.println("******using for loop");
      for(int n=0; n<ll.size(); n++) {;
      System.out.println(ll.get(n));
      
      }

      
      //advance for loop
      System.out.println("*****using advance for loop");
      for(String str:ll) {
    	  System.out.println(str);
    	  
      }
      
      //iterator
      
      System.out.println("****using iterator");
      Iterator<String> it = ll.iterator();
      while(it.hasNext()) {
    	  System.out.println((it.next()));
      }
      
      //while loop
      
      int num=0;
      while(ll.size()>num){
    	  System.out.println(ll.get(num));
    	  num++;
      }
    		  
	}


}