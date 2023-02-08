public class Main {
    public static void main(String[] args) {
        int cartons = 34;
        final int TRUCKLOAD = 9;

        while (cartons > 0) {
            System.out.println("Un voyage de " + cartons + " cartons");
            cartons -= TRUCKLOAD;
        }


    }
}