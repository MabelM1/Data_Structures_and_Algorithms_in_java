// Modify the bubbleSort() method so that it’s bidirectional. This means the in index will first
//carry the largest item from left to right as before, but when it reaches out, it will reverse
//and carry the smallest
//item from right to left. You’ll need two outer indexes, one on the right (the old
//out) and another on the left. 

//Add a method called median() to the ArrayIns class in the insertSort.java
//program (Listing 3.3). This method should return the median value in the
//array. (Recall that in a group of numbers half are larger than the median and
//half are smaller.)

//Another simple sort is the odd-even sort. The idea is to repeatedly make two
//passes through the array. On the first pass you look at all the pairs of items,
//a[j] and a[j+1], where j is odd (j = 1, 3, 5, …). If their key values are out of
//order, you swap them. On the second pass you do the same for all the even
//values (j = 2, 4, 6, …). You do these two passes repeatedly until the array is
//sorted. Replace the bubbleSort() method in bubbleSort.java (Listing 3.1) with
//an oddEvenSort() method. Make sure it works for varying amounts of data.
//You’ll need to figure out how many times to do the two passes. 

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
	
	public void oddEvenSort() {
				
		for (int i=0; i < (nElems/2); i++) {
			
			for (int j=1; j < nElems - 1; j += 2) {
				
				if (a[j] >  a[j+1]) {
					swap(j, j+1);
				}
			}
			
			for (int k=0; k < nElems - 1; k += 2) { 
				
				if (a[k] >  a[k+1]) {
					swap(k, k+1);
				}
			}
			
		}
	}
		
}
