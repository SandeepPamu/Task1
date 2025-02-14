package Basics;

public class PatternPrinting {

	public static void main(String[] args) {
//		//******** program 5 ..--- pattern printing---//
	    int k = 5; 

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                
                if (j < k - i) {
                    System.out.print((k - j) + " ");
                } else {
                    
                    System.out.print((k - i) + " ");
                }
            }
            System.out.println();
        }
	}

}


//output

//5 4 3 2 1 
//5 4 3 2 4 
//5 4 3 3 3 
//5 4 2 2 2 
//5 1 1 1 1