package Exeptions;

public class IncorrectArgumentException extends RuntimeException{
    private String argument;

    public IncorrectArgumentException(String message, String argument) {
        super(message);
        this.argument = argument;
    }
    public String getArgument() {
        return argument;
    }
    @Override
    public String toString() {
        return "IncorrectArgumentException{" +
                "argument='" + argument + '\'' +
                '}';
    }


}
