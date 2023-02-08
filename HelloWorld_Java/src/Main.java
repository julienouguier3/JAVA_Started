public class Main {
    public static void main(String[] args) {
        int cartons = 34; //le nombre total de cartons
        final int TRUCKLOAD = 9; //la contenance de chaque camion

        while (cartons > 0) {
            if (cartons < TRUCKLOAD) {
                System.out.println("Un voyage de " + cartons + " cartons");
                cartons -= cartons;
            } else {
                System.out.println("Un voyage de " + TRUCKLOAD + " cartons");
                cartons -= TRUCKLOAD;

            }

        }


    }
}