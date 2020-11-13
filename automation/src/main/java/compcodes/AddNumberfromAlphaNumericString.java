package compcodes;

public class AddNumberfromAlphaNumericString {

	public static void main(String[] args){
		String input="helloworldkmk34343mkdss4543343343432323mfkdmf";
		
		String number =input.replaceAll("[A-Za-z]", "");
		
		String[] num = number.split("");
	    int temp=0;
		
		for (int i = 0; i < num.length; i++) {
			
		temp= temp + Integer.parseInt(num[i]);
		
		
		}

		System.out.println("Sum of the Number is :"+temp);
}
}