
public class TestReferenceBased {

	public static void main(String[] args) {
		ListReferenceBased myList = new ListReferenceBased();
		
		System.out.print("Is the list empty?: " + myList.isEmpty());
		myList.add(1, "bread");
		
		myList.displayList();
		
		System.out.print("The size of the list is: " + myList.size());
		
		System.out.println(myList.listLongest());

	}

}
