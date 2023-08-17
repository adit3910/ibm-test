package backend.example.myproj3.exception;

public class userNotFoundException extends RuntimeException {
public userNotFoundException(Long id) {
	super("Could not find the user with this id:"+id);
}
}
