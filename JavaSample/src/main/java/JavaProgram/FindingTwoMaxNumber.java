package JavaProgram;

public class FindingTwoMaxNumber {

	public static void main(String[] args) {

		int[] arr={34,5,6,32,12,78,90,699};
		int max=0;
		int max2=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max2=max;
				max=arr[i];
			}
			else if(arr[i]>max2)
				max2=arr[i];
				
		}
		
		System.out.println(max+" and "+max2);
	}

}
