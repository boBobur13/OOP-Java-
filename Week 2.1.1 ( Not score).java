import java.util.Random;
class RandomRadius {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 1;
        int max = 10;
        int r = random.nextInt((max - min) + 1) + min;
        double area = Math.PI * Math.pow(r, 2);
        System.out.println("Generated Radius (r): " + r);
        System.out.printf("Computed Area (πr²): %.2f%n", area);
    }
}
