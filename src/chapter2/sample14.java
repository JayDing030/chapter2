package chapter2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample14 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("請問要在地幾次處理結束迴圈呢圈呢?(1~10)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i = 1;i<=10;i++) {
			System.out.println("第"+i+"次的處理。");
			if(i == res)
				break;
		}
		
	}

}
