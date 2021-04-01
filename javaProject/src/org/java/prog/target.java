import java.util.Arrays;
class target 
{
	public static void main(String[] args) 
	{
		int nums[]={5,7,10,3};
		int target=12;
		int output[]=new int[2];
		int count=0;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					output[count]=i;
					count++;
					output[count]=j;
					
				System.out.print("because num["+i+"] num["+j+"]=="+target+"we get");
				System.out.print(Arrays.toString(output));

				}
			}
		}
					
	}
}
