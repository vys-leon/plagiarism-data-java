

import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
      double y = ((-f) * a + d * c) / (d * b - e * a);


      
      double b = sc.nextInt();
      double f = sc.nextInt();
			double d = sc.nextInt();
      double a = sc.nextInt();
			double e = sc.nextInt();
      double c = sc.nextInt();

			// 連立方程式の解
			double x = (b * f - c * e) / (b * d - a * e);

			System.out.printf("%.3f %.3f\n", x, y);

      // Some another text
      // just some comments
      // to test antiplagiarism module
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
