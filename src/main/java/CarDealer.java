import java.util.Scanner;

public class CarDealer {
    Scanner scanner = new Scanner(System.in);
    private Car car = new Car();
    private int warn = 0;

    private int getNumberFromTheKeyBoard() {
        int s = scanner.nextInt();
        return s;
    }

    private void clientThrower() {
        IllegalStateException exception = new IllegalStateException("Leave this place");
        throw exception;
    }


    public String makeYourCar(Client client) {
        basicM(client);
        colorM(client);
        upholsteryM(client);
        cartypeM(client);
        feulM(client);
        int switcheruIndex;
        StringBuilder answer = getAnswer(client);
        System.out.println(answer);
        System.out.println("If you want to change value put 1");
        switcheruIndex = scanner.nextInt();
        while (switcheruIndex == 1) {
            switcheruIndex = scanner.nextInt();
            switcheru(client);
            answer = getAnswer(client);
            System.out.println(answer.toString());
            System.out.println("If you want to change still any value put 1");
        }

        System.out.println("End");
        return answer.toString();
    }

    private StringBuilder getAnswer(Client client) {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(car.carBasic.name() + " " + car.color.name() + " " + car.upholstery.name()
                + " " + car.cartype.name() + " " + car.feul.name() + " " + client.getMoney());
    }

    private void basicM(Client client) {
        warn=0;
        while (true) {
            System.out.println("Choose model of the car" + "Focus[1] Kuga[2] or Mondeo[3] " +
                    "or [0] to change some of the existing one");
            System.out.println("Your money" + client.getMoney());
            int keyBoard = getNumberFromTheKeyBoard();
            if (keyBoard == 1 || keyBoard == 2 || keyBoard == 3) {
                car.defineCarBasic(keyBoard);
                if (client.money >= car.carBasic.getPrice()) {
                    System.out.println("Correct choice");
                    client.setMoney(client.getMoney() - car.carBasic.getPrice());
                    break;
                } else {
                    warn++;
                    System.out.println("Warn number " + warn);
                    if (warn == 3) {
                        System.out.println("Break");
                        clientThrower();
                        break;
                    }
                }


            } else if (keyBoard == 0) {
                switcheru(client);
            }
        }
    }

    private void colorM(Client client) {
        warn=0;
        while (true) {
            System.out.println("Choose model of the color" + "Red[1] Blue[2] or Gold[3]"+
                    "or [0] to change some of the existing one");
            System.out.println("Your money" + client.getMoney());
            int keyBoard = getNumberFromTheKeyBoard();
            if (keyBoard == 1 || keyBoard == 2 || keyBoard == 3) {
                car.defineColor(keyBoard);
                if (client.money >= car.carBasic.getPrice()) {
                    System.out.println("Correct choice");
                    client.setMoney(client.getMoney() - car.color.getPrice());
                    break;
                } else {
                    warn++;
                    System.out.println("Warn number " + warn);
                    if (warn == 3) {
                        System.out.println("Break");
                        clientThrower();
                        break;
                    }
                }


            } else if (keyBoard == 0) {
                switcheru(client);
            }
        }
    }

    private void upholsteryM(Client client) {
        warn=0;
        while (true) {
            System.out.println("Choose model of the car" + "Velur[1] Leather[2] or PickedLeather[3]"+
                    "or [0] to change some of the existing one");
            System.out.println("Your money" + client.getMoney());
            int keyBoard = getNumberFromTheKeyBoard();
            if (keyBoard == 1 || keyBoard == 2 || keyBoard == 3) {
                car.defineUpholstery(keyBoard);
                if (client.money >= car.carBasic.getPrice()) {
                    System.out.println("Correct choice");
                    client.setMoney(client.getMoney() - car.upholstery.getPrice());
                    break;
                } else {
                    warn++;
                    System.out.println("Warn number " + warn);
                    if (warn == 3) {
                        System.out.println("Break");
                        clientThrower();
                        break;
                    }
                }


            } else if (keyBoard == 0) {
                switcheru(client);
            }
        }
    }

    private void cartypeM(Client client) {
        warn =0;
        while (true) {
            System.out.println("Choose model of the car" + "hatchback[1] pickup[2] or sedan[3]");
            System.out.println("Your money" + client.getMoney());
            int keyBoard = getNumberFromTheKeyBoard();
            if (keyBoard == 1 || keyBoard == 2 || keyBoard == 3) {
                car.defineCarType(keyBoard);
                if (client.money >= car.carBasic.getPrice()) {
                    System.out.println("Correct choice");
                    client.setMoney(client.getMoney() - car.cartype.getPrice());
                    break;
                } else {
                    warn++;
                    System.out.println("Warn number " + warn);
                    if (warn == 3) {
                        System.out.println("Break");
                        clientThrower();
                        break;
                    }
                }


            } else if (keyBoard == 0) {
                switcheru(client);
            }
        }
    }

    private void feulM(Client client) {
        warn=0;
        while (true) {
            System.out.println("Choose model of the car" + "gas[1] diesel[2] or hybrid[3]");
            System.out.println("Your money" + client.getMoney());
            int keyBoard = getNumberFromTheKeyBoard();
            if (keyBoard == 1 || keyBoard == 2 || keyBoard == 3) {
                car.defineFeul(keyBoard);
                if (client.money >= car.carBasic.getPrice()) {
                    System.out.println("Correct choice");
                    client.setMoney(client.getMoney() - car.feul.getPrice());
                    break;
                } else {
                    warn++;
                    System.out.println("Warn number " + warn);
                    if (warn == 3) {
                        System.out.println("Break");
                        clientThrower();
                        break;
                    }
                }


            } else if (keyBoard == 0) {
                switcheru(client);
            }
        }
    }

    private void switcheru(Client client) {
        System.out.println("what you want to change ? 1 2 3 4 5 or 6 to close");
        int index = getNumberFromTheKeyBoard();
        switch (index) {
            case 1: {
                if (car.carBasic != null) {
                    client.setMoney(client.getMoney() + car.carBasic.getPrice());
                    basicM(client);
                } else {
                    System.out.println("You can't change non existing not declared object");
                }
                break;
            }
            case 2: {
                if (car.color != null) {
                    client.setMoney(client.getMoney() + car.color.getPrice());
                    colorM(client);
                }
                break;
            }
            case 3: {
                if (car.upholstery != null) {
                    client.setMoney(client.getMoney() + car.upholstery.getPrice());
                    upholsteryM(client);
                }
                break;
            }
            case 4: {
                if (car.cartype != null) {
                    client.setMoney(client.getMoney() + car.cartype.getPrice());
                    cartypeM(client);
                }
                break;
            }
            case 5: {
                if (car.feul != null) {
                    client.setMoney(client.getMoney() + car.feul.getPrice());
                    feulM(client);
                }
                break;
            }
            case 6: {
                System.out.println("existing");
                break;
            }


        }
    }

}
