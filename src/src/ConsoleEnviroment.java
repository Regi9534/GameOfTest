package src;

import java.util.Scanner;

public class ConsoleEnviroment implements src.Interface.ConsoleEnviroment {
    Scanner scanner = new Scanner(System.in);
    Game game;
    InputDealer inputDealer;

    public ConsoleEnviroment(Boolean generateNewGame) {
        if (generateNewGame) {
            this.game = new Game();
             this.inputDealer = new InputDealer(game);
        }

    }

    public ConsoleEnviroment() {

    }

    @Override
    public void printOut(String returnString) {
        System.out.println(returnString);
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