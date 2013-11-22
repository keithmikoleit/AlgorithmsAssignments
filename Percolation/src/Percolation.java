
public class Percolation {
	
		// Data
		int N; // Stores number of rows and columns
		int grid[][];
		WeightedQuickUnionUF UF;
	
		// create N-by-N grid, with all sites blocked
	   	public Percolation(int N){
	   		
	   		// create a NxN array stored in grid
	   		// a 1 means the site is blocked
	   		// a 0 means the site is open
	   		
	   		grid = new int[N][N];
	   		UF = new WeightedQuickUnionUF(N*N);
	   		
	   		// WQU Methods needed
	   		// constructor
	   	}
	   	
	 // open site (row i, column j) if it is not already
	   	public void open(int i, int j){
	   		// validate indices
	   		try {
	   			this.isOutOfBounds(i);
	   			this.isOutOfBounds(j);
	   		} catch (java.lang.IndexOutOfBoundsException e) {
	   			System.out.print(e.getMessage());
	   		}
	   		
	   		// mark the site as open
	   		
	   		// link site to open neighbors
	   		
	   		// WQU Methods needed
	        // find
	   		// union
	   	}
	   	
	 // is site (row i, column j) open?
	   	public boolean isOpen(int i, int j){

	   		
	   		
	   		// WQU Methods needed
	   		//
	   		return true;
	   	}
	   	
	 // is site (row i, column j) full?
	   	public boolean isFull(int i, int j){
	   		
	   		// WQU Methods needed
	   		// connected
	   		// find
	   		
	   		return true;
	   	}
	   	
	 // does the system percolate?
	   	public boolean percolates(){
	   		
	   		// WQU Methods needed
	   		// connected
	   		// count?
	   		
	   		return true;
	   	}
	   	
	   	private int xyTo1D(int x, int y){
	   		return x * N + y;
	   	}
	   	
	   	private void isOutOfBounds(int x){
	   		if((x < 0) || (x >= N)){
	   			throw new java.lang.IndexOutOfBoundsException(Integer.toString(x) + "is out of range.");
	   		}
	   	}
	   	
	   	public static void main(String[] args){
	   		Percolation perc = new Percolation(10);
	   		perc.open(1, 2);
	   		perc.open(1, 1);
	   		System.out.print("T/F: squares 0 and 1 are connected: " + perc.UF.connected(0, 1));
	   	}
}
