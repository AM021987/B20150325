import java.util.*;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		int n;
		int i;
		int k=0;
		int j=0;

		int l;
		int b=0;

		int count=0;

		System.out.print("請輸入當天奴隸的總人數");
		n = sc.nextInt();
		
		int A[]=new int [n];
		
		for(k=0;k<n;k++)
		{
			A[k]=k;
		
		}
		b=(n-2)*100;
		
			
			while(count!=b)
			{
				
				for(i=1;i<n;i++)
				{
						j=j+1;
						if(j==3 && A[i-1]!=100)
						{
							
							A[i-1]=100;
							count=count+100;
							if(count==b)
							{
								i=n;
							}
							j=0;
						}
						else if(j==3 && A[i-1]==100)
						{
							j=0;
						}
				  }
			
					
				
				
			}
			
			
				
			System.out.print("印出可獲得放假資格者的位置   ");
		for(l=0;l<n;l++)
		{
			if(A[l]!=100)
			{
			System.out.print(l+"  ");
			}
		}
		
	}
	}
		

