package chap1;

import java.util.Arrays;

public class ZeroFlipArray {
	
	/*
	 * Given an array of 0s and 1s, find the position of 0 to be replaced with 1 
	 * to get longest continuous sequence of 1s. Expected time complexity is O(n) 
	 * and auxiliary space is O(1).
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "110111101110110";
		char [] strArr = str.toCharArray();
		int maxOne=0,maxOneIndex=-1,i,j=0;
		int strLength = str.length();
		int[] zeroPos = new int[strLength] ;
		
		// initialize zeroPos array to -1
		
		for(i=0;i<strLength;i++){
			zeroPos[i]=-1;
		}
		
		//find the position of zeros and put them in the zedroOs array
		for(i=0;i<strLength;i++){
			if(strArr[i]=='0')
				zeroPos[j++]=i;
		}
		
		//System.out.println(strArr);
		
		//System.out.println(Arrays.toString(zeroPos));
		
		for(i=0;i<strLength;i++){
			
			
			if(i==0){
				j=zeroPos[i]+1;
				//System.out.println("inside if. j= " + j);
			}
			
			else if(zeroPos[i]==-1){
				j=(strLength-1)-zeroPos[i-2]-1;
				//System.out.println("inside else if. j= " + j);
				
				if(j>maxOne){
					maxOne=j;
					maxOneIndex=i-1;
				}
				
				break;
			}
			
			else{
				if(zeroPos[i+1]==-1){
					continue;
				}
				j=zeroPos[i+1]-zeroPos[i-1]-1;
				//System.out.println("inside else. j= " + j);
				
			}
			
			if(j>maxOne){
				maxOne=j;
				maxOneIndex=i;
			}
			
			//System.out.println("maxOnes :" + maxOne + " index : " +maxOneIndex);
		}
		
		System.out.println("Max number of ones is :" + maxOne + ". Index of zero to be flipped: "+ zeroPos[maxOneIndex]);
		
		
	}

}
