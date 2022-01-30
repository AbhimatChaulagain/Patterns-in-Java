
public class No_10_numbers_increasing_by_3_5columns {
	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<5;i++) {
			for(int j=1; j<=5; j++) {
				if (a>50)
					return;
				System.out.print(a+" ");
				a+=3;
				if (i==1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
