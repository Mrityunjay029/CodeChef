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
		    int arr[] = new int[6];
		    for(int i=0;i<6;i++)
		    arr[i] = sc.nextInt();
		    
		    int a = arr[0];
		    int b = arr[1];
		    int count = 0;
		    if(a == 1 && b == 2)
		    count = 1;
		    else if(a == 3 && b ==4)
		    count = 2;
		    
		    if(arr[2] == a || arr[2] == b){
		        if(arr[3] == a || arr[3] == b)
		        System.out.println(count);
		    }
		    else if(arr[4] == a || arr[4] == b){
		        if(arr[5] == a || arr[5] == b)
		        System.out.println(count);
		    }
		    else{
		        System.out.println("0");
		    }
		    }
		}
	}
