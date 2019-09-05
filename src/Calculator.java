
public class Calculator {
	
	public int sum(int a, int b) {
		
		return a + b;
		
		}

	public int subtraction(int a, int b) {
		return a - b;
		
		}
	
	public int division(int a, int b) {
		return a/b;
		
		}
	
    public String validarPalindromo(String palabra) {
		
		String palabra1 = palabra.toLowerCase().replaceAll("\\s+", "");
		
		String palabra2 = "";
		
		for(int i = palabra1.length()-1; i>=0; i--) {
			palabra2 = palabra2 + palabra1.charAt(i);
		}
		
		if(palabra1.equals(palabra2)) {
			return "es palindromo";
		}else {
			return "no es palindromo";
		}
		
	}
    
    public boolean CalculadoraLogica(boolean condicion1, boolean condicion2) {
		return condicion1 && condicion2;
	}
    
	public int[] SumarVectores(int[] a, int[] b) {
		int resultado1 = a[0] + a[a.length - 1];
		int resultado2 = b[0] + b[b.length - 1];

		if (resultado1 > resultado2) {
			return a;
		} else {
			return b;
		}

	}
}
