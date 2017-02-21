package ExeciciosCap3;

public class Exercicio4 {
	public static void main(String[] args) {
		int fatorial = 1;
		for (int n = 0; n < 10; n++)
		{
			fatorial = 1;
			int cont = n;
			while (cont > 0)
			{
				fatorial = fatorial * cont;
				cont --;
			}
		System.out.println("Fatorial de: " + n + " : " + fatorial);
		}
	
	}

}
