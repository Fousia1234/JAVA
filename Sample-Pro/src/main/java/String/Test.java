package String;

public class Test {
	
	public static void main(String args[]) {
		String joinString1=String.join("-","welcome","to","obsqure");  
		System.out.println(joinString1);  

		String s="hello";
		String name="what is your name";
		char ch=s.charAt(4);
		s=s.concat("world");
		String s1="hello";
		String s2="hello";
		String s3="sooper";
		String s4=""; 
     	String sf1=String.format("name is %s",name);  
		String sf2=String.format("value is %f",32.33434);  
		String sf3=String.format("value is %32.12f",32.33434);
		String s5="i am a good girl";
		
		System.out.println("string length is: "+s1.length());
		byte[] barr=s1.getBytes();  
		for(int i=0;i<barr.length;i++) {
			System.out.println(barr[i]);
		}
		
		System.out.println(s);
		System.out.println(ch);
	    System.out.println(name.contains("is your"));
	    System.out.println(name.endsWith(name));
	    System.out.println(s1.equals(s2));
	    System.out.println(s.equals(s1));
	    System.out.println(s4.isEmpty());
	     String replaceString=(s5.replace('a','e'));
	     System.out.println(replaceString);
	     System.out.println(s1.startsWith("he"));  
	     String s6="good";
	     String s6upper=s6.toUpperCase();
	     System.out.println(s6);
	     String s7="  hello string   ";  
	     System.out.println(s7+"javatpoint");
	     System.out.println(s7.trim()+"javatpoint");
	    
	     
	    }
	   
 
	}


