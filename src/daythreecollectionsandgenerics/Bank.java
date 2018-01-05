package daythreecollectionsandgenerics;
import java.util.*;

public class Bank {
	//https://stackoverflow.com/questions/3615721/how-to-use-the-tostring-method-in-java
	//This code was in stack overflow to demonstate how the toString method works.
	 String n;
	    String add;
	    int an;
	    int bal;
	    int dep;

	    public Bank(String n, String add, int an, int bal) {

	        this.add = add;
	        this.bal = bal;
	        this.an = an;
	        this.n = n;

	    }

	    public String toString() {
	        return "Name of the customer.:" + this.n + ",, "
	                + "Address of the customer.:" + this.add + ",, " + "A/c no..:"
	                + this.an + ",, " + "Balance in A/c..:" + this.bal;
	    }
	}
