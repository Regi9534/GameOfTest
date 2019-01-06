package src;

import src.Enums.Commands;

import java.util.Arrays;

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
        if (parts.length >= 1 && Arrays.stream(Commands.values()).anyMatch(s->s.toString().equals(parts[0].toUpperCase()))) {
            switch (Commands.valueOf(parts[0].toUpperCase())) {
                case MOVE:
                    if (parts.length >= 2) {
                        game.getPlayer().goInDirection(parts[1]);
                    } else {
                        consoleEnviroment.printOut("Missing direction");
                    }
                    break;
                case AT:
                    consoleEnviroment.printOut("you are at: " + game.getPlayer().getLocation().getName() + "\n");
                    break;
                case LOOK:
                    game.getPlayer().lookAround();
                    break;
                case INVENTORY:
                    game.getPlayer().listInventory();
                    break;
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
