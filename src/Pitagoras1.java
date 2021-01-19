import java.util.*;
import java.math.*;
public class Pitagoras1 {
public double getPitagoras1(int catetoa, int catetob ) {
	double cateto1 = catetoa*catetoa;
	double cateto2 = catetob*catetob;
	double suma = cateto1 + cateto2;
	double resultado = Math.sqrt(suma);
			return resultado;
}
}
