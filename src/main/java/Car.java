import java.util.Set;

public class Car {

    enumClass.CarBasic carBasic;
    enumClass.Color color;
    enumClass.Cartype cartype;
    enumClass.Feul feul;
    enumClass.Upholstery upholstery;
    Set<String> carBasicArr;
    Set<String> colorArr;
    Set<String> cartypeArr;
    Set<String> feulArr;
    Set<String> upholsteryArr;

    public Car() {

    }

    public void defineCarBasic(int answer) {
        if (answer == 1) {
            carBasic = enumClass.CarBasic.FOCUS;
        } else if (answer == 2) {
            carBasic = enumClass.CarBasic.KUGA;
        } else if (answer == 3) {
            carBasic = enumClass.CarBasic.MONDEO;
        } else {
            System.out.println("WrongCarBasic");
        }
    }

    public void defineColor(int answer) {
        if (answer == 1) {
            color = enumClass.Color.RED;
        } else if (answer == 2) {
            color = enumClass.Color.BLUE;
        } else if (answer == 3) {
            color = enumClass.Color.GOLD;
        } else {
            System.out.println("WrongColor");
        }
    }

    public void defineCarType(int answer) {
        if (answer == 1) {
            cartype = enumClass.Cartype.HATCHBACK;
        } else if (answer == 2) {
            cartype = enumClass.Cartype.PICKUP;
        } else if (answer == 3) {
            cartype = enumClass.Cartype.SEDAN;
        } else {
            System.out.println("WrongCarType");
        }
    }

    public void defineUpholstery(int answer) {
        if (answer == 1) {
            upholstery = enumClass.Upholstery.LEATHER;
        } else if (answer == 2) {
            upholstery = enumClass.Upholstery.VELOUR;
        } else if (answer == 3) {
            upholstery = enumClass.Upholstery.PICKEDLEATHER;
        } else {
            System.out.println("WrongUpholstery");
        }
    }

    public void defineFeul(int answer) {
        if (answer == 1) {
            feul = enumClass.Feul.GAS;
        } else if (answer == 2) {
            feul = enumClass.Feul.DIESEL;
        } else if (answer == 3) {
            feul = enumClass.Feul.HYBRID;
        } else {
            System.out.println("WrongFeul");
        }
    }


}
