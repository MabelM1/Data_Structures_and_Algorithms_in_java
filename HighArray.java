//Chapter 2, Exercise 1: To the HighArray class in the highArray.java
//program (Listing 2.3), add a method called getMax() that returns the
//value of the highest key in the array, or -1 if the array is empty.
//You can assume all the keys are positive numbers.

//Chapter 2, Exercise 2: Modify the method getMax() so that the item with
//the highest key is not only returned by the method, but also removed
//from the array. Call the method removeMax().

//Chapter 2, Exercise 3: The removeMax() method suggests a way to sort
//the contents of the array by key value. Implement a sorting scheme that
//does not require modifying the HighArray class, but only the code in main().

//Chapter 2, Exercise 6: Write a noDups() method. This method should remove
//all duplicates from the array. That is, if three items with the key 17 appear
//in the array, noDups() should remove two of them. Don't worry about maintaining
//the order of the items.

public class HighArray {
  private long[] a;
  private int nElems;
  
  public HighArray(int max) {
    a = new long[max];
    nElems = 0;
  }
  
  public boolean find(long searchKey) {
    int j;
    
    for(j=0; j < nElems; j++) {
      if (a[j] == searchKey) {
        break;
      }
    }
      if (j == nElems) {
    	return false;
      } else {
    	return true;
      }    
  }
  
  public void insert(long value) {
    a[nElems] = value;
    nElems++;
    
  }
  
  public boolean delete(long value) {
    int j;
    
    for (j=0; j<nElems; j++) {
      if (value == a[j]) {
    	break;
      }  
    }
    if (j == nElems) {
      return false;
    } else {
      for (int k=j; k<nElems; k++) {
        a[k] = a[k+1];
      }
      nElems--;
      return true;
    }    
  }
  
  public void display() {
    for (int j=0; j<nElems; j++) {
      System.out.print( a[j] + " ");  
    }
    System.out.println("");
  }
  
  public long getMax() {
   if (nElems == 0) {  
     return -1;
   } else {
	 long max = a[0];
	 
	 for (int i=1; i <nElems; i++) {
	   if (a[i] > max) {
		 max = a[i];
	   }
	 }
	 return max;	 
   }
  }
  
  public void removeMax() {	
    if (nElems == 0) {  
      System.out.println("Nothing to remove. Array is empty");
    } else { 	  
   	  delete(getMax());   	  
    }
  }
  
  public void noDups() {
	int count = nElems;
	
    for (int i=0; i<nElems; i++) {
      for (int j=i+1; j<nElems; j++) {
    	if (a[i] == a[j] && !(a[i] == -1000)) {
    	  a[j] = -1000;	 
    	}
      }       
    }
     
    for (int i=0; i < count; i++) {
      delete(-1000);
    }  
  }
} 
