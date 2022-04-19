import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    char charr[] = s.toCharArray();
		    String check = "abcdefghijklmnopqrstuvwxyz";
		    int index = 0;
		    String word="";
		    if(n % 2 == 0){
		        for(int i=0;i<charr.length;i=i+2){
		            char temp = charr[i];
		            charr[i] = charr[i + 1];
		            charr[i + 1] = temp;
		        }
		    }
		    else{
		        for(int i=0;i<charr.length-1;i=i+2){
		            char temp = charr[i];
		            charr[i] = charr[i + 1];
		            charr[i + 1] = temp;
		        }
		        }
		        for(int i=0;i<charr.length;i++){
		            index = check.indexOf(charr[i]);
		            charr[i] = check.charAt(26-(index+1));
		        }
		        for(int i=0;i<charr.length;i++)
		        word+=charr[i];
		        System.out.println(word);
		}
	}
}
