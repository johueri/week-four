package daythreecollectionsandgenerics;

public class EqualityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 5;
		
		System.out.println(x==y); //this'll print out true
		
		
		String c = "hi";
		String d = "hi";
		
		System.out.println(c==d); // this gives you true
		
		String e = new String("hi"); 
		String f = new String("hi"); 
		System.out.println(e==f);//this gives you false because it's asking if they are the exact same object with the exact same location. 
		// You can get it to true by adding "e=f;". This is called "creating an ALIAS".
		//If you use == when you're comparing two objects, it is comparing object reference location and not the object values(???). It's asking are they the same OBJECT; it is NOT asking if two different objects have the same value.
		// see page 57 for a good diagram. 
		
		System.out.println(e.equals(f)); //This is true because it is comparing the values of two different objects. 
	}

}
