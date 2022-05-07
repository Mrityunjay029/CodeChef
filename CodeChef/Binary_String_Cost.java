class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    String s = sc.next();
		    char charr[] = s.toCharArray();
		    int arr[] = new int[charr.length];
		    int arr1[] = new int[charr.length];
		    for(int i=0;i<charr.length;i++){
		        arr[i] = Character.getNumericValue(charr[i]);
		        arr1[i] = Character.getNumericValue(charr[i]);
		    }
		        for(int i=0;i<n-1;i++){
		            for(int j=i+1;j<n;j++){
		                if(arr[i] > arr[j]){
		                    int temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		                if(arr1[i] < arr1[j]){
		                  int temp = arr1[i];
		                    arr1[i] = arr1[j];
		                    arr1[j] = temp;  
		                }
		            }
		        }
		        int taxa=0;
		        int taxb=0;
		        for(int i=0;i<arr.length-1;i++){
		            if(arr[i] == 0 && arr[i+1] == 1){
		                taxa+=x;
		            }
		            if(arr1[i] == 1 && arr1[i+1] == 0){
		                taxb+=y;
		            }
		        }
		        if(x<y)
		        System.out.println(taxa);
		        else
		        System.out.println(taxb);
		} 
	}
}
