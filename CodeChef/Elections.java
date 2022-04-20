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
		    int arr[] = new int[3];
		    int greatest=0;
		    int index=0;
		    for(int i=0;i<3;i++){
		        arr[i] = sc.nextInt();
		        if(greatest < arr[i]){
		            greatest = arr[i];
		            index=i;
		        }
		    }
		    if(greatest>50){
		        if(index == 0)
		        System.out.println("A");
		        else if(index == 1)
		        System.out.println("B");
		        else if(index == 2)
		        System.out.println("C");
		    }
		    else{
		        System.out.println("NOTA");
		    }
		}
	}
}
