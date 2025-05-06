import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        try {
            while ((input = reader.readLine()) != null) {
                String[] tokens = input.split(" ");

                double p = Double.parseDouble(tokens[0]);
                double q = Double.parseDouble(tokens[1]);
                double r = Double.parseDouble(tokens[2]);
                double s = Double.parseDouble(tokens[3]);
                double t = Double.parseDouble(tokens[4]);
                double u = Double.parseDouble(tokens[5]);

                double denominator1 = p * t - q * s;
                double denominator2 = q * s - p * t;
                double numeratorX = r * t - q * u;
                double numeratorY = r * s - p * u;

                double x = numeratorX / denominator1;
                double y = numeratorY / denominator2;

                System.out.printf("%.3f %.3f%n", x, y);
            }
        } catch (Exception ignored) {
        }
    }
}

