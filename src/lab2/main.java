package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
	
	public static void main(String[] args) {
		 //52/21/+12/41+78/31*12/20
	      String line = "4/3+1/2*3/2+5/2/3/2";
	      String[] result = line.split("(\\d+)([+*/]){1}(\\d+)");
	      for(int i = 1; i < result.length; i++){
	    	  //System.out.println(result[i]);
	    	  if(result[i].length() > 1 || (result[0].length() > 0)){
	    		  if(result[i].charAt(result[i].length()-1) == '/' || result[i].charAt(result[i].length()-1) == '*' || result[i].charAt(result[i].length()-1) == '+'){
	    			  System.out.println(-1);
	    		  }else{
	    			  System.out.println(0);
	    		  }
	    		  return;
	    	  }
	      }
	      String pattern = "([+*/])";
	      Pattern r = Pattern.compile(pattern);
	      Matcher m = r.matcher(line);
	      int i = 0;
	      int tmp = 0;
	      while(m.find()){
	    	  tmp++;
	    	  //System.out.println(temdeg.get(temdeg.size()-1));
	      }
	      if(result.length*2-1 != tmp && result.length !=0){
	    	  System.out.println(-1);
	    	  return;
	      }
	      pattern = "([+*/]{1})\\d+[/]{1}\\d+";
	      Pattern rs = Pattern.compile(pattern);
	      m = rs.matcher(line);
	      ArrayList<String> temdeg = new ArrayList<String>();
	      while(m.find()){
	    	  temdeg.add(m.group(1));
	    	  //System.out.println(m.group(1));
	      }
	      //System.out.println("---------");
	      pattern = "(\\d+)([/]){1}(\\d+)";
	      Pattern rr = Pattern.compile(pattern);
	      m = rr.matcher(line);
	      ArrayList<rational> too = new ArrayList<rational>();
	      while(m.find()){
	    	  too.add(new rational(Integer.parseInt(m.group(1)),Integer.parseInt(m.group(3))));
	    	  //System.out.println(m.group(1)+"/"+m.group(3));
	      }
	      rational res = new rational(0,1);
	      rational temp = null;
	      while(temdeg.contains("/") || temdeg.contains("*")) {
	    	  if(temdeg.indexOf("*")>=0) {
		    	  int index = temdeg.indexOf("*");
		    	  //System.out.println("index of * "+index);
		    	  temp = too.get(index);
		    	  temp.urjih(too.get(index+1));
		    	  too.set(index, temp);
		    	  too.remove(index+1);
		    	  temdeg.remove(index);
	    	  }
	    	  if(temdeg.indexOf("/")>=0) {
		    	  int index = temdeg.indexOf("/");
		    	  //System.out.println("index of / "+index);
		    	  temp = too.get(index);
		    	  temp.huwaah(too.get(index+1));
		    	  too.set(index, temp);
		    	  too.remove(index+1);
		    	  temdeg.remove(index);
	    	  }
	      }
	      while(temdeg.contains("+")) {
	    	  if(temdeg.indexOf("+")>=0) {
		    	  int index = temdeg.indexOf("+");
		    	  //System.out.println("index of * "+index);
		    	  temp = too.get(index);
		    	  temp.nemeh(too.get(index+1));
		    	  too.set(index, temp);
		    	  too.remove(index+1);
		    	  temdeg.remove(index);
	    	  }
	      }
	      System.out.println("---------");
	      for(i = 0; i < too.size(); i++) {
	    	  System.out.println(too.get(i).getHurt()+"/"+too.get(i).getNoogd());
	      }
	      System.out.println("---------");
	      /*----------CHECK REGISTRY NUMBER----------*/
	      
	}

}
