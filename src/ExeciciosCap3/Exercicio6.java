package ExeciciosCap3;

public class Exercicio6 {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		System.out.println(0);
		System.out.println(1);
		while (b < 100)
		{
			int c = a + b;
			a = b;
			b = c;
			System.out.println(b);
			
		}
	}

}
