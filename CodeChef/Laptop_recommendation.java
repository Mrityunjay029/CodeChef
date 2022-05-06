Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    int greatest = -1;
		    for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		    if(greatest < arr[i])
		    greatest = arr[i];
		    }
		    int check[] = new int[greatest+1];
		    for(int i=0;i<n;i++){
		     check[arr[i]]++;   
		    }
		    int count = 0;
		    int greatest1 = -1;
		    int index = 0;
		    for(int i=0;i<greatest+1;i++){
                if(greatest1 < check[i]){
                    greatest1 = check[i];
                    index = i;
                }
            }
            for(int i=0;i<greatest+1;i++) {
                if (greatest1 == check[i])
                    count++;
            }
            if(count == 1)
                System.out.println(index);
            else
                System.out.println("CONFUSED");
