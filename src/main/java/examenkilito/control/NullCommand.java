package examenkilito.control;


public class NullCommand implements Command{

    public static final Command instance = new NullCommand();

    @Override
    public void execute() {
        System.out.println("Command given not supported**************");
    }
    
}
