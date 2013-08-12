package com.zhang.topcoder;

public class GUMIAndSongsDiv2 {
	
	public static int count = 0;
	public static int sum = 0;
	
	public int maxSongs(int[] duration , int[] tone ,int T){
		int max = 0;
		int length = duration.length;
		boolean flag[]= new boolean[length];
		for(int i=0;i<length;i++){
			flag[i] = false;
		}
		for(int i=0;i<duration.length;i++){
			if(duration[i] <=T ){
				flag[i] = true;
				count = 1;
				sum=duration[i];
			}
			else
				continue;
			dfs(i,duration,tone,T,flag);
			if(count > max)
				max = count;
			for(int k=0;k<duration.length;k++)
				flag[k] = false;
			count = 0;
		}
		return max;
	}
	
	public int dfs(int k,int[] duration,int[] tone,int T,boolean[] flag){
		int min = Integer.MAX_VALUE;
		int pos = -1;
		for(int i=0;i<duration.length;i++){
			if(!flag[i]){
				if(duration[i] + Math.abs(tone[i]-tone[k]) < min){
					min = duration[i] + Math.abs(tone[i]-tone[k]);
					pos = i;
				}
			}
		}
		if(pos != -1){
			flag[pos] = true;
			System.out.println("pos"+pos);
			sum += min;
			if(sum <= T)
				count++;
			return dfs(pos,duration,tone,T,flag);
			
		}else{
			return sum;
		}
		
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