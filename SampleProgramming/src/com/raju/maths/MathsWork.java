package com.raju.maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MathsWork {

	public static void main(String[] args) {
		HcfLcm hl = new HcfLcm();
		MeanMedianModeStandard mmms = new MeanMedianModeStandard();
		
		//String number = args[0];
		String number = "12,5,7,6,3,25,4,8";
		System.out.println("------Normal--------");
		String[] liNum = number.split(",");
		int size = (liNum.length);
		int[] numList = new int[size];
		for (int i = 0; i < liNum.length; i++) {
			numList[i] = Integer.parseInt(liNum[i]);

		}
		System.out.println(Arrays.toString(numList));
		
		System.out.println("------Successive Number--------");

		int[] suc = new int[size];
		for (int i = 0; i < numList.length; i++) {
			if (i == numList.length - 1) {
				suc[i] = numList[i] + numList[0];
			} else {
				suc[i] = numList[i] + numList[i + 1];
			}
		}
		System.out.println(Arrays.toString(suc));
		
		System.out.println("------ Increment Add --------");

		int[] incAdd = new int[size];

		for (int i = 0; i < numList.length; i++) {
			if (i == 0) {
				incAdd[i] = incAdd[i] + numList[i];
			} else if (i == 1) {
				incAdd[i] = incAdd[i - 1] + numList[i];
			} else {
				incAdd[i] = incAdd[i - 1] + numList[i];
			}
		}

		System.out.println(Arrays.toString(incAdd));
		
		System.out.println("------Sum of Index --------");

		int[] incSum = new int[size];
		for (int i = 0; i < numList.length; i++) {
			int max = numList[i];
			int maxSum = 0;
			for (int j = 1; j <= max; j++) {
				maxSum = maxSum + j;
			}
			incSum[i] = maxSum;
		}
		System.out.println(Arrays.toString(incSum));
		
		System.out.println("------Sum of Square in Index --------");

		int[] sumSq = new int[size];

		Map<Integer, Object> sqList = new HashMap<>();
		for (int i = 0; i < incAdd.length; i++) {
			int maxVal = incAdd[i];
			int addSq = 0;
			//int resize = 0;
			//int[] sq = new int[resize];
			List<Integer> sqs = new ArrayList<>();
			for (int j = 1; j <= maxVal; j++) {
				int s = j * j;
				if (s <= maxVal) {
					addSq = addSq + s;
					//sq[j - 1] = s;
					sqs.add(s);
				}
				
			}
			//resize = sq.length;
			sqList.put(maxVal, sqs);
			sumSq[i] = addSq;
			//System.out.println(Arrays.toString(sq));
			System.out.println(maxVal+" Sequence of Square "+sqs.toString());
		}

		System.out.println(Arrays.toString(sumSq));
		
		System.out.println("------ HCF and LCM --------");

		for (int i = 0; i < incAdd.length; i++) {
			int rs = incAdd.length;
			if ((i % 2 == 0) && (i<incAdd.length-2)) {
				int[] aSlipt = new int[2];
				for (int j = 0; j < 2; j++) {

					if (j == 0) {
						aSlipt[0] = incAdd[i];
					} else {
						aSlipt[1] = incAdd[i + 1];
					}
				}
				int r = aSlipt[0];
				int s = aSlipt[1];
				System.out.println((Arrays.toString(aSlipt)) + " HCF is " + hl.hcfSum(r, s));
				System.out.println((Arrays.toString(aSlipt)) + " LCM is " + hl.lcmSum(r, s));

			}else if ((i % 2 == 0) && (i<incAdd.length-1)) {
				int[] aSlipt = new int[2];
				for (int j = 0; j < 2; j++) {

					if (j == 0) {
						aSlipt[0] = incAdd[i];
					} else {
						aSlipt[1] = incAdd[i + 1];
					}
				}
				int r = aSlipt[0];
				int s = aSlipt[1];
				System.out.println((Arrays.toString(aSlipt)) + " HCF is " + hl.hcfSum(r, s));
				System.out.println((Arrays.toString(aSlipt)) + " LCM is " + hl.lcmSum(r, s)); 
				
			}else if (((incAdd.length)%2==1) && (i % 2 == 0)) {
				int[] aSlipt = new int[2];
				aSlipt[0] = incAdd[0];
				aSlipt[1] = incAdd[i];

				int r = aSlipt[0];
				int s = aSlipt[1];
				System.out.println((Arrays.toString(aSlipt)) + " HCF is " + hl.hcfSum(r, s));
				System.out.println((Arrays.toString(aSlipt)) + " LCM is " + hl.lcmSum(r, s));

			}

		}
		
		System.out.println("------ Mean, Median, Mode and Standard Division --------");
		
		int nSize = incAdd.length;
		
		System.out.println(Arrays.toString(incAdd)+" Mean is "+mmms.getMean(incAdd, nSize));
		System.out.println(Arrays.toString(incAdd)+" Median is "+mmms.getMedian(incAdd, nSize));
		System.out.println(Arrays.toString(incAdd)+" Mode is "+mmms.getMode(incAdd, nSize));
		System.out.println(Arrays.toString(incAdd)+" standard Deviation is "+mmms.getStandardDiv(incAdd, nSize));
		

	}

}
