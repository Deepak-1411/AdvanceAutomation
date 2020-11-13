package compcodes;

public class SeprateOddAndEvenFrom2Array {

	public static void main(String[] args) {
		int x[]={1,2,3,4,5,6};
		int y[]={7,8,9,10,11,12};
		
		int  xcount=0;
		int  ycount=0;
		
		
		for (int i = 0; i < y.length; i++) {
			
			if(x[i]%2==0){
				x[xcount]=x[i];
				xcount++;
			}
		       if((y[i]%2==0)){
				x[xcount]=y[i];
				xcount++;
			}
			
			if (!(y[i]%2==0)){
				y[ycount]=y[i];
				ycount++;
			}
			 if (!(x[i]%2==0)){
				y[ycount]=x[i];
				ycount++;
			}
			
		}

		System.out.print("Even Numbers:");
		for (int i = 0; i < y.length-1; i++) {
			System.out.print(x[i]);
		}
		System.out.println();
		System.out.print("ODD Numbers:");
		for (int i = 0; i < y.length-1; i++) {
			System.out.print(y[i]);
		}
	}

}
