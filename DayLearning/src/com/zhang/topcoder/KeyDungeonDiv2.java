package com.zhang.topcoder;

public class KeyDungeonDiv2 {
	public int countDoors(int[] doorR,int[] doorG,int[] keys){
		int result =0;
		int sub = 0;
		for(int i=0;i<doorR.length;i++){
			if(doorR[i] > keys[0])
				sub += doorR[i] - keys[0];
			if(doorG[i] > keys[1])
				sub += doorG[i] -keys[1];
			if(sub<=keys[2])
				result++;
		}
		
		return result;
	}
}

/*
Class:
KeyDungeonDiv2
Method:
countDoors
Parameters:
int[], int[], int[]
Returns:
int
Method signature:
int countDoors(int[] doorR, int[] doorG, int[] keys)
(be sure your method is public)
*/