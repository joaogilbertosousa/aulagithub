import java.util.Scanner;

void main() {

	//testar modificação
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	IO.println("Enter three numbers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int higher = max(a, b, c);
	
	showResult(higher);
	

	sc.close();

}


public static int max(int x, int y, int z) {
	int aux;
	
	if(x > y && x > z) {
		aux = x;
	}
	else if (y > z) {
		aux = y;
	}
	else aux = z;
	
	return aux;
	
}

public static void showResult(int value) {
	IO.println("Higher = " + value);
}


