import java.util.*;

class RemoveX{
	public static String removeX(String s){
		String str = "";
		if(s.length() == 1){
			if(s.charAt(0) != 'x'){
			 return s.charAt(0)+"";
			}
			else{
				return "";
			}
		}
		if(s.charAt(0) != 'x'){
			 str += s.charAt(0) + removeX(s.substring(1));
		}
		else{
			str += removeX(s.substring(1));
		}
		return str;
	}
	public static void main(String[] args){
		String str = "abcxdx";
		System.out.println(removeX(str));
	}
}