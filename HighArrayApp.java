public class HighArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int maxSize = 100;
      HighArray arr;
      arr = new HighArray(maxSize);
      HighArray inverseArray = new HighArray(maxSize);
      
      arr.insert(77);
      arr.insert(89);
      arr.insert(195);
      arr.insert(1);
      arr.insert(33);
      arr.insert(77);
      arr.insert(77);
      arr.insert(77);
      arr.insert(89);
      arr.insert(195);
      arr.insert(1);
      arr.insert(33);
  
      
      arr.display();
      arr.noDups();
      arr.display();
      arr.removeMax();
      
      
      while (!(arr.getMax() == -1)) {
        inverseArray.insert(arr.getMax());
        arr.removeMax();
      }
      
      inverseArray.display();
      
      int searchKey = 35;
      
      if (arr.find(searchKey)) {
    	System.out.println("Found " + searchKey);
      } else {
    	System.out.println("Can't find " + searchKey);
      }
    }
}
