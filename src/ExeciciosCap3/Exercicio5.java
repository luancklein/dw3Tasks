package ExeciciosCap3;

public class Exercicio5 {
	public static void main(String[] args) {
		long fatorial = 1;
		for (int n = 0; n < 20; n++)
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
