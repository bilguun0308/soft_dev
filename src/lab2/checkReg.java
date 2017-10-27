package lab2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkReg {
	public static void main(String[] args) {
		String registry = "УК96030854";
	    String regPatt = "[ФЦУЖЭНГШҮЗКЪЩЕЙЫБӨАХРОЛДПЯЧЁСМИТЬВЮфцужэнгшүззкъщепдлорхаөбыйячёсмитьвю]{2}\\d{2}([0-1]{1}[0-9]{1})([0-3]{1}[0-9]{1})\\d{2}";
	    Pattern rp = Pattern.compile(regPatt);
	    Matcher m = rp.matcher(registry);
	    if(registry.length() != 10) {
	  	  System.out.println("buruu registry");
	  	  return;
	    }
	    int sar,udur;
	    if(m.find()){
	    	sar = Integer.parseInt(m.group(2));
	    	udur = Integer.parseInt(m.group(2));
	    }else {
	    	System.out.println("buruu registry");
		  	return;
	    }
	    if(sar>12 || udur > 31) {
	    	System.out.println("buruu registry");
		  	return;
	    }
	    System.out.println("zuw registry");
	}
}
