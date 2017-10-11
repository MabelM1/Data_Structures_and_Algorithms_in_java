public class BubbleSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxSize = 100;
		ArrayBub arr;
		arr = new ArrayBub(maxSize);
		
		arr.insert(77);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.insert(11);
		
		arr.display();	
		arr.bubbleSort();
		//arr.oddEvenSort();	
		arr.display();
		
		System.out.print("The median is " + arr.median());
	}
}
