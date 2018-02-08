import java.util.HashMap;


public class Solution 
{
	public static int findPair(int[] arr,int k)
	{
		HashMap<Integer,String> m = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+k == arr[j])
				{
					m.put(i,"");
				}
			}
		}
		return m.size(); 
	}

	public static void main(String[] args) 
	{
		int[] arr ={2,4,6,5,1,3,4,6,3,9};
		int k=2;
		System.out.println(findPair(arr,k));
		
		

	}

}
