package src;

public class main {

    public static void main(String[] args) {
        ConsoleEnviroment consoleEnviroment = new ConsoleEnviroment();

        int a =0;
        if(a==0){
            consoleEnviroment.inputDealer.handleInput("help");
            a++;
        }
        while(true){
            consoleEnviroment.intputString();
        }
    }
}
