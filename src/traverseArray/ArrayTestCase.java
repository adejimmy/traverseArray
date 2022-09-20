package traverseArray;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;


import org.junit.jupiter.api.Test;

class ArrayTestCase {

	@Test
	void test() {
		 var input =
			        new int[][] {
			          {1, 2, 3, 4},
			          {12, 13, 14, 5},
			          {11, 16, 15, 6},
			          {10, 9, 8, 7},
			        };
			    var expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
			    var actual = Main.arrayTraverse(input);
			    assertTrue(expected.equals(actual));
	}

}
