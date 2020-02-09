public class enumClass {

    public enum CarBasic {
        FOCUS(10000),
        KUGA(20000),
        MONDEO(5000);

        private int price;

        CarBasic(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

    }

    public enum Upholstery {
        VELOUR(0),
        LEATHER(1000),
        PICKEDLEATHER(2000);

        private int price;

        Upholstery(int price) {
            this.price = price;

        }

        public int getPrice() {
            return price;
        }
    }

    public enum Feul {
        GAS(0),
        DIESEL(10000),
        HYBRID(20000);

        private int price;

        public int getPrice() {
            return price;
        }

        Feul(int price) {
            this.price = price;

        }
    }

    public enum Color {
        RED(0),
        BLUE(0),
        GOLD(1000);

        private int price;

        Color(int price) {
            this.price = price;

        }

        public int getPrice() {
            return price;
        }
    }

    public enum Cartype {
        HATCHBACK(1000),
        SEDAN(0),
        PICKUP(2000),
        ;

        private int price;

        public int getPrice() {
            return price;
        }

        Cartype(int price) {
            this.price = price;

        }
    }
}
