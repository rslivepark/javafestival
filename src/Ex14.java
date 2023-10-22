public class Ex14 {
    public static void main(String[] args) {
		System.out.println(getMiddle("power"));

	}
    
	public static String getMiddle(String word) {
		String[] arr = word.split("");
			
		if(arr.length%2==0) {
			return arr[(arr.length/2)-1]+arr[arr.length/2];
		}
		else {
			return arr[arr.length/2];
		}// if
	}//getMiddle
}
