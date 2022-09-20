package traverseArray;
import java.util.*;
/*

Program to raverse the array

*/
public class Main {
	
	public static List<Integer> arrayTraverse(int[][] dimentionarray){
	
		
		//creating a list to hold the 
		//results gotten from traversing the array
		//this is our return vaklue
		var finalresult=new ArrayList<Integer>();
		
		//Declearing all the bounds
		//startrows,endrows,startcolumn,endcolumn
		var startRows=0;
		var endRows=dimentionarray.length-1;
		var startColumn=0;
		var endColumn=dimentionarray[0].length-1;
		
		//traversing through the array
		//as long as this condition is met
		while(startRows<=endRows && startColumn<=endColumn){
		
		//traversing the top border
		for(int column=startColumn; column<=endColumn; column++) {
			finalresult.add(dimentionarray[startRows][column]);
		}
		
		//traversing the right border.
		//we start with startRows+1 so 
		//we dont double count
		for(int row=startRows+1; row<=endRows; row++) {
			finalresult.add(dimentionarray[row][endColumn]);
		}
		
		//traversing the botton border
		//we use a reverse for loop
		for(int column=endColumn-1; column>=startColumn; column--) {
			
			//use the if condition to prevent double counting values
			if (startRows==endRows)break;
			finalresult.add(dimentionarray[endRows][column]);
		}
		
		
		//traversing the left row
		for(int row=endRows-1; row>startRows; row--) {
			
			//use the if condition to prevent double counting values
			if (startColumn==endColumn)break;
			finalresult.add(dimentionarray[row][startColumn]);
		}
	   //after traversing outer parameter
	   //push all our bounds inwards by
	   //increasing startrows, start coulums 
	   //decreasing endrow and endcolumn
		startRows++;
		endRows--;
		startColumn++;
		endColumn--;
		
		}
		return finalresult;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      int[][] arrays = {{1,2,3,4},
	                {5,6,7,8},
	                {9,10,11,12},
	                {13,14,15,16}};	
	      
	      System.out.println(arrayTraverse(arrays).toString());
	}

}
