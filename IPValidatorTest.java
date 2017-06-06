package com.tpg.test;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IPValidatorTest {
	
	private List<String> validIpList;	
	private List<String> invalidIpList;

	public static void main(String[] args) {
		String filePath = "C:\\Users\\N3066\\Desktop\\"; //to be change
		String fileName = "iplist.txt";
		
		IPValidatorTest program = new IPValidatorTest();
		
		program.validIpList = new ArrayList<String>();
		program.invalidIpList = new ArrayList<String>();

		try {
			FileReader fin = new FileReader(
					filePath+fileName);
			Scanner s = new Scanner(fin).useDelimiter("\n");
			while (s.hasNext()) {
				String ip = s.next().trim();
				program.process(ip);
			}
			s.close();
			
			program.printTestResult(program.validIpList,true);
			program.printTestResult(program.invalidIpList,false);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void doTest(){
		String filePath = "C:\\Users\\N3066\\Desktop\\"; //to be change
		String fileName = "iplist.txt";
		
		IPValidatorTest program = new IPValidatorTest();
		
		program.validIpList = new ArrayList<String>();
		program.invalidIpList = new ArrayList<String>();

		try {
			FileReader fin = new FileReader(
					filePath+fileName);
			Scanner s = new Scanner(fin).useDelimiter("\n");
			while (s.hasNext()) {
				String ip = s.next().trim();
				program.process(ip);
			}
			s.close();
			
			program.printTestResult(program.validIpList,true);
			program.printTestResult(program.invalidIpList,false);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void process(String ip) {

		IPValidationRegex validator = new IPValidationRegex();

		Boolean valid = validator.validate(ip);

		if (valid) {
			validIpList.add(ip);
		} else {
			invalidIpList.add(ip);
		}

	}
	
	private void printTestResult(List<String> ipList, Boolean result){
	
		if(result){
			System.out.println("Valid IP List : ");
		}else{
			System.out.println("Invalid IP List : ");
		}
		
		for(String ip : ipList){
			System.out.println("IP Address : " + ip);
		}
	}

}
