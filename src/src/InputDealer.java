package src;

import src.Enums.Commands;

public class InputDealer {
    ConsoleEnviroment consoleEnviroment = new ConsoleEnviroment();
    Game game;

    public InputDealer(Game game) {
        this.game = game;
    }

    public void handleInput(String input) {
        input = input.trim().replaceAll("\\s{2,}", " ");
        while (input.startsWith(" ")) {
            String work;
            work = input.replaceFirst(" ", "");
            input = work;
        }
        String[] parts = input.split(" ");
        findAndTriggerCommand(parts);
    }

    public void findAndTriggerCommand(String[] parts) {
        if (parts.length >= 1) {
            switch (Commands.valueOf(parts[0].toUpperCase())) {
                case HELP:
                    game.getCommand().printCommands();
                    break;
                default:
                    consoleEnviroment.printOut("Command not implemented");
            }
        } else {
            consoleEnviroment.printOut("Check input");
        }
    }

}
