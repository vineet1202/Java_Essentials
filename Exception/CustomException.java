package Exception;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class CustomException {

    public static void checkAge(int age) throws InvalidAgeException{
        if( age < 18){
            throw new InvalidAgeException("Age is less than 18");
        }
        else System.out.println("Registration successfull");
    }

    public static void main(String[] args) {
        try{
            checkAge(16);
        }
        catch(InvalidAgeException e){
            System.out.println("Caught Exception : " + e.getMessage());
        }
    }
}
