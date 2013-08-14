package com.zhang.topcoder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class GUMIAndSongsDiv2 {
	
	public int maxSongs(int[] duration , int[] tone ,int T){
		
		int size = duration.length;
		List<Integer> listtone = new ArrayList<Integer>();
		int max = 0;
		for(int i=0;i<(1<<size);i++){
			listtone.clear();
			int sum = 0;
			for(int j=0;j<size;j++){
				
				if((i&(1<<j)) > 0){
					
					listtone.add(Integer.valueOf(tone[j]));
					sum += duration[j];
					
				}
			}
			Collections.sort(listtone);//需要排序
			for(int k=0;k<listtone.size()-1;k++){
				sum += Math.abs(listtone.get(k).intValue() - listtone.get(k+1).intValue());
			}
			
			if(sum<=T){
				if(max < listtone.size())
					max = listtone.size();
			}
			
		}
		return max;
	}
	
	
	public static void main(String[] args){
		int [] duration = {5611,39996,20200,56574,81643,90131,33486,99568,48112,97168,5600,49145,73590,3979,94614};
		int [] tone = {2916,53353,64924,86481,44803,61254,99393,5993,40781,2174,67458,74263,69710,40044,80853};
		int T = 302606;
		System.out.println(new GUMIAndSongsDiv2().maxSongs(duration, tone, T));
	}
	
}
/*
 *     
{5611,39996,20200,56574,81643,90131,33486,99568,48112,97168,5600,49145,73590,3979,94614}
{2916,53353,64924,86481,44803,61254,99393,5993,40781,2174,67458,74263,69710,40044,80853}
302606
Returns: 8
 */
/*
Class:
GUMIAndSongsDiv2
Method:
maxSongs
Parameters:
int[], int[], int
Returns:
int
Method signature:
int maxSongs(int[] duration, int[] tone, int T)
(be sure your method is public)
*/