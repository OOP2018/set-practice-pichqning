import java.util.*;

/**
 * Practice using a Set.
 */
public class SetPractice implements Comparator<String> {
	public static Iterator<String> itr;
	/**
	 * Add zero or more items to the set, and print what is being added.
	 * @parameter set is the Set to add items to
	 * @parameter values zero or more Strings to add to set
	 */
	public static void addAll(Set<String> set, String ...values) {
		// add all the values to the set. 
		// print each one as you add it
	    for(String arg : values ) {
	       // System.out.print(" "+arg);
	        set.add(arg);
	     }
	    // System.out.println();
	 }
	
	
	/**
	 * Print all the elements in a set, using an Iterator.
	 */
	public static void print(Set<String> set) {
		// create an Iterator using set.iterator()
		// then use the iterator to print everything in the set
		itr = set.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
		
	}
	
	/**
	 * Explore behavior of a Set.
	 */
	public static void setExplorer( ) {
		// 1. Create a HashSet and add strings: dog, ant, bird, elephant, cat
		Set animal = new HashSet<>();
		Set animal2 = new TreeSet<>();
		
		System.out.println("add strings to Hash: dog, ant, bird, elephant, cat");
		animal.add("dog");
		animal.add("ant");
		animal.add("bird");
		animal.add("elephant");
		animal.add("cat");
		animal.add("zebra");
		
		System.out.println("add strings to Tree: dog, ant, bird, elephant, cat");
		animal2.add("dog");
		animal2.add("ant");
		animal2.add("bird");
		animal2.add("elephant");
		animal2.add("cat");
		animal2.add("zebra");
		System.out.println();
		

		// 2. Print elements in the set using an Iterator over the Set. 
		// You're going to need to do this again, so write a method print(Set set) to do it.
		System.out.println("HashSet : ");
		print(animal);
		System.out.println();
		System.out.println("TreeSet :");
		print(animal2);
		System.out.println();
		
		// 3. are the elements printed in same order than you added them? 
		// What does this tell you about Sets? 
		// ANS : HashSet is not guarantee that the element will be sorted in the same way or sorted by alphabet.
		
		// 4. Remove all the elements from the set, using a method that 
		// defined in Set (and Collection). What is the method to use?
		animal.clear();
		animal2.clear();
		
		System.out.println("remove all element from hash and tree...");
		System.out.println();
		
		// 5. Add same elements as exercise 1, but in a different order,
		// such as: "cat", "elephant", "bird", "ant", "dog"
		addAll(animal ,"cat", "elephant", "bird", "ant", "dog","zebra");
		addAll(animal2,"cat", "elephant", "bird", "ant", "dog" ,"zebra");
		
	
		
		// 6. Print the elements in the set.  Is the order same as before?
		
		print(animal); 
		System.out.println();
		print(animal2);
		System.out.println();
		
		// 7. Add duplicate elements to the set.  Add another "cat" and "dog".
		// To ensure that these are *distinct* objects use 'set.add(new String("cat"))'
		// and new String("dog").
		System.out.println("Add duplicate items to the set ");
		animal.add(new String("cat"));
		if (animal.add(new String("cat"))) {System.out.println("adding...");}
		else System.out.println("Can't add.");
		animal.add(new String("dog"));
		if (animal.add(new String("dog"))) {System.out.println("adding...");}
		else System.out.println("Can't add.");
		System.out.println();
		
		// 8. Print the elements in set.  Are there any duplicates?
		//ANS : NO duplicates.
		// What property of Set does this demonstrate?
		System.out.println("HashSet contains: ");
		print(animal);
		System.out.println();
		
		
		// 9. Repeat the exercises using a TreeSet instead of HashSet.
		//  What is different when you use TreeSet? 
		// ans : Treeset always sorted the element by alphabet.
		System.out.println("TreeSet contains: ");
		print(animal2);
		
		// Hint: Use Polymorphism.  Make the Set object be a *parameter* to the
		// method so you can easily use a different set just by changing the parameter!
		
		// 10. Repeat again using TreeSet with a Comparator.
	}

	public static void main(String[] args) {
		setExplorer();
	}


	@Override
	public int compare(String arg0, String arg1) {
		Comparator<String> comp = new Comparator<String>(); 
			

		return 0;
	
}
}
