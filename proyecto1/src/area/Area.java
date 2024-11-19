package area;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un radio: ");
		double radio = entrada.nextDouble();
			entrada.close();
		double area = Math.PI * (radio*radio);
		System.out.println("El area es : " + area );

	}

}
