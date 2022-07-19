package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class N2_E2_main {

	public static void main(String[] args){
		
		List<Integer> nums = new ArrayList<Integer>(
				Arrays.asList(20, 31, 4, 73, 50, 62));
		
		System.out.println(nums);
		
		String stringNums = getNumString(nums);
		System.out.println(stringNums);
	}
	
	public static String getNumString(List<Integer> nums){

		String txt = nums.stream().map(n->{
			String letter = n%2 == 0 ? "e" : "o";
			return letter+n+",";
			}).collect(Collectors.joining());
		
		txt = txt.substring(0,txt.length()-1);
		return txt;
		
	}
}
