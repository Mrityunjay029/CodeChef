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
		    String s = sc.next();
		    s = s.toLowerCase();
		    int count = 0;
		    String check = "abcdefghijklmnopqrstuvwxyz";
		    int arr[] = new int[26];
		    int index = 0;
		    if(s.length() != 2){
		    for(int i=0;i<s.length()/2;i++){
		        index = check.indexOf(s.charAt(i));
		        arr[index]++;
		    }
		    if(s.length()%2 == 0){
		    for(int i=s.length()/2;i<s.length();i++){
		        index = check.indexOf(s.charAt(i));
		        arr[index]++;
		    }
		    }
		    else{
		        for(int i=s.length()+1/2;i<s.length();i++){
		        index = check.indexOf(s.charAt(i));
		        arr[index]++;
		    }
		    }
		    for(int i=0;i<s.length()/2;i++){
		        if(s.charAt(i) == check.charAt(i) && arr[i] % 2 != 0){
		            System.out.println("NO");
		            count = -1;
		            break;
		        }
		    }
		    if(count == 0)
		    System.out.println("YES");
		    }
		    else if(s.length() == 2){
		        if(s.charAt(0) == s.charAt(1))
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		    }
		    else if(s.length() == 0 || s.length() == 1)
		    System.out.println("YES");
		}
	}
}
