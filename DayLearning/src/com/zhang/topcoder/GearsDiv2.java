package com.zhang.topcoder;

public class GearsDiv2 {
	
	public static int min = Integer.MAX_VALUE;
	public int getmin(String Directions,int k){
		
		String circle = Directions;
		
		if(isValidedString(circle)){
			return 0;
		}else{
			int minvalue = Integer.MAX_VALUE;
			for(int i =k; i < circle.length();i++){
			
				String old = circle;
				String left = circle.substring(0, i);
				String right = circle.substring(i+1);
				String newString = left +"_" + right;
				circle= newString;
				int value = 1 + getmin(newString,i+1);
				minvalue = value < minvalue? value:minvalue;
				circle = old;
				
			}
			return minvalue;
		}
	}
	
	public boolean isValidedString(String Directions){
		for(int i=0;i<Directions.length();i++){
			if(Directions.charAt(i) == '_')
				continue;
			if(i == Directions.length() -1)
				return (Directions.charAt(0)=='-' || Directions.charAt(i) =='-'|| Directions.charAt(i) != Directions.charAt(0));
			if(Directions.charAt(i)==Directions.charAt(i+1)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(new GearsDiv2().getmin("LRLLRRLLLRRRLLLL",0));
		
	}

}

/*
 * Class:
GearsDiv2
Method:
getmin
Parameters:
String
Returns:
int
Method signature:
int getmin(String Directions)
(be sure your method is public)
*/
