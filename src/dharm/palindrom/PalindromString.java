package dharm.palindrom;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abgggggbca";
String temp="";
String rem="";
String fstr="";
temp=str;

StringBuilder sb= new StringBuilder(str);
sb.reverse();
if(temp.equals(sb.toString()))
	System.out.println("Palindrom :"+sb);
else
	System.out.println("Not Palindrom :"+sb+ " : "+temp);
/*
char chstr [] =chstr=str.toCharArray();
for(int i=chstr.length-1;i>=0;i--){
	fstr=fstr+chstr[i];
}
if(fstr.equals(temp))
	System.out.println("String is Palindrom "+fstr);
else
	System.out.println("String is not Palindrom "+fstr);

*/

	}

}
