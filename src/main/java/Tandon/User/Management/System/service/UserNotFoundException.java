package Tandon.User.Management.System.service;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String error){
        super(error);
    }

}
