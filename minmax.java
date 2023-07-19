package sample;

public class minmax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		for(int i=0; i<size; i++)
			{
			array[i] = sc.nextInt();
			}
		System.out.println(ClosestMinMax(array));
		
			}

	public static char[] ClosestMinMax(int[] array) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int a:array) {
			if(a>max) {
				max = a;
			}
			if(a<min) {
				min=a;
			}
		}
		int lastmin = -1;
		int lastmax = -1;
		int result = array.length;
		for(int i=0; i<array.length; i++) {
			if(array[i] == min)
			lastmin = i;
			if(lastmax>=0) {
				result = Math.min(result, i-lastmax+1);
				
			}
		}
		int i = 0;
		if(array[i] == max)
			lastmax = i;
			if(lastmin>=0) {
				result = Math.max(result, i-lastmin+1);
				
			}
			
	
		
		return null;
	}



}
