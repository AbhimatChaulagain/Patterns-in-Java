
public class No_12_AtoZ_5columns {
	public static void main(String[] args) {
		char a='A';
		for (int i=1; i<=6;i++) {
			for (int j=1; j<=6; j++) {
				
				System.out.print(a);
				a+=1;
				if (a>'Z') 
					return;
			}
		System.out.println(" ");
				}
	}
}


