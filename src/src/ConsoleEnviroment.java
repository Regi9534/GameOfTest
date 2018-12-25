package src;

import java.util.Scanner;

public class ConsoleEnviroment implements src.Interface.ConsoleEnviroment {
    Scanner scanner = new Scanner(System.in);
    Game game = new Game();
    InputDealer inputDealer = new InputDealer(game);

    @Override
    public String printOut(String returnString) {
        return returnString;
    }

    @Override
    public void intputString() {
        while (true) {
            try {
                Thread.sleep(10);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            final String result = scanner.nextLine();
            if (result != null) {
                inputDealer.handleInput(result);
            }
        }


    }
}