package com.raju.maths;

import java.util.Arrays;

public class MeanMedianModeStandard {
	
	public static double getMean(int r[], int n) {
		
		int sum=0;
		for(int i =0;i<n;i++) {
			sum+=r[i];
		}
		
		return (double)sum/(double)n;
	}
	
	public static double getMedian(int r[], int n) {
		Arrays.sort(r);
		if(n%2!=0) {
			return (double)r[n/2];
		}else { 
			return (double)(r[(n-1)/2] + r[n/2]/2.0);
		}
		
	}
	
	public static double getStandardDiv(int r[], int n) {
		double sum = 0.0;
	    double standardDeviation = 0.0;
	    double mean = 0.0;
	    double res = 0.0;
	    double sq = 0.0;
	    
	    for (int i = 0; i < n; i++) {
            sum = sum + r[i];
        }        
        mean = sum / (n);
	    
		for (int i = 0; i < n; i++) {
			standardDeviation = standardDeviation + Math.pow((r[i] - mean), 2);
		}		
		sq = standardDeviation / n;
        res = Math.sqrt(sq);        
	    return res;
	}
	
	public static int getMode(int r[], int n) {
		
		int max = Arrays.stream(r).max().getAsInt();
		int s = max + 1;
        int[] count = new int[s];
        for (int i = 0; i < s; i++)
        {
            count[i] = 0;
        }
        
        for (int i = 0; i < n; i++)
        {
            count[r[i]]++;
        }
        
        int mode = 0;
        int k = count[0];
        for (int i = 1; i < s; i++)
        {
            if (count[i] > k)
            {
                k = count[i];
                mode = i;
            }
        }
 
       // System.out.println("mode = " + mode);
		
		return mode;
		
	}

}
