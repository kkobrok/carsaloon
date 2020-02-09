public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.carBasic= enumClass.CarBasic.FOCUS;
        CarDealer carDealer = new CarDealer();
        Client client = new Client();
        client.setMoney(5000);
        System.out.println(carDealer.makeYourCar(client));

    }
}
