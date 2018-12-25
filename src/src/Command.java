package src;

import src.Enums.Commands;

public class Command {
    ConsoleEnviroment consoleEnviroment = new ConsoleEnviroment();

    public void printCommands(){
        String result = "All exist commands: \n";
        int counter =1;
        for(Commands print : Commands.values()){
            result += "Command " + counter + ": " + print.toString() + print.getDesc() + "\n";
            counter++;
        }
        consoleEnviroment.printOut(result);
    }
}
