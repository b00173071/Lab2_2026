
public class TestReferenceBased {

	public static void main(String[] args) {
		ListReferenceBased myList = new ListReferenceBased();
		
		System.out.println("Is the list empty?: " + myList.isEmpty());
		myList.add(1, "bread");
		myList.add(2, "orange");
		myList.add(3, "54");
		
		
		myList.displayList();
		
		System.out.println("The size of the list is: " + myList.size());
		
		System.out.println("Longest string: " + myList.listLongest());

	}
}
