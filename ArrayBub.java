// Modify the bubbleSort() method so that it’s bidirectional. This means the in index will first
//carry the largest item from left to right as before, but when it reaches out, it will reverse
//and carry the smallest
//item from right to left. You’ll need two outer indexes, one on the right (the old
//out) and another on the left. 

//Add a method called median() to the ArrayIns class in the insertSort.java
//program (Listing 3.3). This method should return the median value in the
//array. (Recall that in a group of numbers half are larger than the median and
//half are smaller.)

public class ArrayBub {
	private long[] a;
	private int nElems;
	
	public ArrayBub(int max){
		a = new long[max];
		nElems=0;
	}
	
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for (int j=0; j<nElems; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("");
	}
  	public void bubbleSort() {
		int out, in;
		for (out=nElems - 1; out > 1; out--) {
			for (int outleft = 0; outleft < out; outleft++) {
				
				for (in=0; in < out; in++) {
					if (a[in] >  a[in+1]) {
						swap(in, in+1);
					}
				}
				
				for (in = out - 1; in > outleft; in-- ) {
					if (a[in] < a[in-1] ) {
						swap(in,in-1);
					}						
				}										
			}
		}
	}
	
	public void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
  
  	public long median() {
		int index=0;		
		bubbleSort();		
		if (nElems % 2 == 0) {		 
			
		  index = ((0 + (nElems - 1)) / 2 );
		  
		  return  ((a[index] + a[index + 1]) /2);
		  
		} else {
			
		  index = (0 + (nElems - 1) / 2) ;
		  
		  return a[index];
		}
	}
}
