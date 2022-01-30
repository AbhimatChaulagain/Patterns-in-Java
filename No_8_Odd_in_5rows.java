
public class No_8_Odd_in_5rows {
	public static void main(String[] args) {
		int a=1;
	for(int i=1;i<=5;i++) {
		for (int j=1; j<=5;j++) {
			System.out.print(a+ " ");
			a=a+2;
			if (i==1)
				System.out.print(" ");
			
		}
		System.out.println();
	}

}
}