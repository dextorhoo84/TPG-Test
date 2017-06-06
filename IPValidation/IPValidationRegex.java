package com.tpg.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidationRegex {
	
	private Pattern pattern;
    private Matcher matcher;

    private static final String IPADD_PATTERN =
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	
	public boolean validate(String ip) {
		
		pattern = Pattern.compile(IPADD_PATTERN);

		matcher = pattern.matcher(ip);
		return matcher.matches();

	}

}
