package com.raju.scatter;

public class TwoStringScatter {
	
	public static void main(String[] args) {
		String s1 = args[0];
		String s2 = args[1];
		//String s1 = "singapore";
		//String s2 = "byk";
		if(s1.contains(s2)) {
			System.out.println("Full Present");
		}else {
			String seq = isCheck(s1, s2);
			if((s2.hashCode()==seq.hashCode()) && (s2.length()==seq.length())) {
				System.out.println("All scatter");
			}else if((seq.length()!=0)&&(seq.length()<s2.length())){
				System.out.println("Some Scatter");
			}else {
				System.out.println("None Scatter");
			}
		}		
	}
	public static String isCheck(String s1 , String s2) {
		String seq = "";
		//int s3 = 0;
		for(int i=0;i<s1.length();i++) {
			char c1 = s1.charAt(i);
			for(int j=0;j<s2.length();j++) {
				char c2 = s2.charAt(j);
				if(c1==c2) {
					seq = seq+c1;
					//s3++;
					break;
				}
			}
		}
		return seq;
	}
}
