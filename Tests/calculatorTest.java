import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class calculatorTest {
	

	Calculator calcular;
	
	@Before
	public void setUp() {
		calcular = Mockito.spy(Calculator.class);
	}
	
	
	@Test
	public void sum() {
		
		//arrange
		int a = 1;
		int b = 3;
		
		//act
		int result = calcular.sum(a, b);
		
		//assert
		assertEquals(4, result);
	}
	
	@Test
	public void division() {
		
		//arrange
		int a = 4;
		int b = 2;
		
		//act
		int result = calcular.division(a, b);
		
		//assert
		assertEquals(2, result);
	}
	
	@Test
	public void Palindromo() {
		
		//arrange
		
		String palabra = "Esdaadse";
		
		
		//act
		
		String resultado = calcular.validarPalindromo(palabra); 
		
		//assert
		
		assertEquals("es palindromo", resultado);
	}
	
	@Test
	public void TrueAndTrue() {
		// arrange
		boolean condicion1 = true;
		boolean condicion2 = true;

		// act
		boolean validar = calcular.CalculadoraLogica(condicion1, condicion2);

		// asert
		Assert.assertTrue(validar);

	}
	
	@Test
	public void LaSumaMasGrande() {
		// arrange
		int a[] = {6,3};
		int b[]= {9,1};
		int esperado [] = {9,1};
		
			
		// act
		int [] resultado= calcular.SumarVectores(a,b);

		// asert
		assertArrayEquals(esperado, resultado);

	
	}
	
}
