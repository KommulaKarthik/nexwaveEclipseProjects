package com.virtusa.collections.assignment;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
		treeMap.put("AMI CSMT EXPRESS",12112);
		treeMap.put("VSG SBC LINK EXP",27798);
		treeMap.put("DAYODAYA EXP",12182);
		treeMap.put("BPL PBH SUP EXP",12183);
		treeMap.put("UDYOG NAGRI EXP",12174);
		
		for(String s : treeMap.keySet()) {
			System.out.println(s+"   "+treeMap.get(s));
		}
	

	}

}
