package twosum;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		FifthSolution sln = new FifthSolution();
		TestSolution tSln = new TestSolution();
		FourthSolution fSln = new FourthSolution();
		
		
		
		
		int[] nummers = new int[] {3,2,4};
		int target = 6;
		
		
		//System.out.println(Arrays.toString(nummers));
		
		for(int x : sln.twoSumssss(nummers, target))
			System.out.println(x + "");
		
		
		for(int x : fSln.twoSumsss(nummers, target))
		System.out.println(x + "");
		
		
		
		System.out.println(tSln.twoSum(nummers, target));
		
		
		
		
		
		

	}

}
