import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		InputStreamReader are = new InputStreamReader(System.in);
		BufferedReader some = new BufferedReader(are);
		String fghj = null;
		String[] qwerty = null;
		int[] array = null;
		double x = 0;
		double y = 0;

		try {
			fghj = some.readLine();
			qwerty = fghj.split(" ");
			array = new int[qwerty.length];
			for(int i = 0;i<qwerty.length;i++){
				array[i] = Integer.parseInt(qwerty[i]);
			}
		} catch (IOException e) {

		}
		//a or d が負であれば、正に直す
		if(array[0] < 0){
			array[0] *= -1;
			array[1] *= -1;
			array[2] *= -1;
		}
		if(array[3] < 0){
			array[3] *= -1;
			array[4] *= -1;
			array[5] *= -1;
		}

		//a and d をa,dの公倍数になるように掛ける
		if(array[0] != array[3]){
			int temp1 = array[0];
			array[0] *= array[3];
			array[1] *= array[3];
			array[2] *= array[3];
			array[3] *= temp1;
			array[4] *= temp1;
			array[5] *= temp1;
		}
		int temp2 = array[1] - array[4];
		int temp3 = array[2] - array[5];

		y = temp3 / temp2;

		x = (array[2] - array[1] * y) / array[0];

		//小数第三位で四捨五入
		System.out.println(String.format("%.3f", x) + " " + String.format("%.3f", y));
	}
}
