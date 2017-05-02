
public class Main {

	public static void main(String[] args) {
		add(3,4);
		minus(3,4);

	}

public static int add(int x, int y){
	int result = x+y;
	System.out.println("Сумма "+x+" и "+y+" равна "+ result);
	return result;
}

public static void minus(int x, int y){
	int result = x-y;
	System.out.println("Разность "+x+" и "+y+" равна "+ result);
}

}


