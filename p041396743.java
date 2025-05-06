import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        try {
            while ((input = reader.readLine()) != null) {
                String[] data = input.split(" ");
                double p = Double.parseDouble(data[0]);
                double q = Double.parseDouble(data[1]);
                double r = Double.parseDouble(data[2]);
                double s = Double.parseDouble(data[3]);
                double t = Double.parseDouble(data[4]);
                double u = Double.parseDouble(data[5]);

                double solutionX = (r * t - q * u) / (p * t - q * s);
                double solutionY = (r * s - p * u) / (q * s - p * t);

                System.out.println(String.format("%.3f %.3f", solutionX, solutionY));
            }
        } catch (Exception e) {
            // Handle exception here if needed
        }
    }
}
