import java.util.Locale;
import java.util.Scanner;

void main() {

	// teste
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	int x = sc.nextInt();
	int y = sc.nextInt();

	int sum = x + y;

	System.out.println("SUM = " + sum);

	sc.close();

}

public static int max(int x, int y, int z) {
	int aux;

	if (x > y && x > z) {
		aux = x;
	} else if (y > z) {
		aux = y;
	} else
		aux = z;

	return aux;

}

public static void showResult(int value) {
	IO.println("Higher = " + value);
}
