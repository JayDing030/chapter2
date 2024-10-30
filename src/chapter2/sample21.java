package chapter2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample21 {
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入5個人的分數");
		int test[] = new int[5];
		
		for(int i=0;i<test.length;i++) {
			String str = br.readLine();
			test[i]=Integer.parseInt(str);
		}
		
		for(int s=0;s<test.length;s++) {
			for(int t=s+1;t<test.length;t++) {
				if(test[t]>test[s]) 
				{
					int temp = test[s];
					test[s]=test[t];
					test[t]=temp;
				}
			}
		}
		
		for(int i=0;i<test.length;i++) {
			System.out.println("第"+(i+1)+"名的分數是"+test[i]);
		}
	}

}
