package leetcode;

public class ValidateIPAddress {

	public static void main(String[] args) {
		/*
		 * class Solution {
    
    public String validipv4(String ip)
    {
        String[] words=ip.split("\\.",-1);
        if(words.length!=4)
            return "Neither";
        for(String word:words)
        {
            if(word.length()==0||word.length()>3) return "Neither";
            
            if(word.charAt(0)=='0'&&word.length()!=1)
                return "Neither";
            
            for (char ch : word.toCharArray()) {
               if (! Character.isDigit(ch)) return "Neither";
            }
            if(Integer.parseInt(word)>255) return "Neither";
        }
        return "IPv4";
    }
    
     public String validipv6(String ip)
    {
        String hexdigits = "0123456789abcdefABCDEF";
        String[] words=ip.split(":",-1);
          if(words.length!=8)
            return "Neither";
        for(String word:words)
        {
            if(word.length()==0||word.length()>4) return "Neither";
            
            for (Character ch : word.toCharArray()) {
                if (hexdigits.indexOf(ch) == -1) return "Neither";
            }
        }
         
        return "IPv6"; 
         
    }
    
    public String validIPAddress(String ip) {
        String[] w=ip.split("\\.");
        if(w.length>1)
            return validipv4(ip);
        if(w.length<=1)
            return validipv6(ip);
        return "Neither";
    }
}
		 * 
		 */

	}

}
