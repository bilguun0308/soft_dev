package lab2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkSisi {
	public static void main(String[] args) {
		String registry = "14b1seas2975";
	    String regPatt = "[0-1]{1}[0-9]{1}[BDMbdm]{1}[12]{1}(SEAS|seas|SAS|sas|LAW|law|SOB|sob)\\d{4}";
	    Pattern rp = Pattern.compile(regPatt);
	    Matcher m = rp.matcher(registry);
	    if(registry.length() != 12) {
	  	  System.out.println("buruu id");
	  	  return;
	    }
	    if(m.find()){
	    	System.out.println(m.group());
	    }else {
	    	System.out.println("buruu ID");
		  	return;
	    }
	    
	    System.out.println("zuw ID");
	}
}
