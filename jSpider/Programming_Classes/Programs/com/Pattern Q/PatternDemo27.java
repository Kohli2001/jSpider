package com;

public class PatternDemo27 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(j>=i?"* ":" ");
			}
			System.out.println();
		}
	}
}

/*

* * * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 

*/