package backend.example.myproj3.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class userNotFoundAdvice {
	@ResponseBody
	@ExceptionHandler(userNotFoundException.class)
public Map<String,String> exceptionHandler(userNotFoundException exception){
   Map<String,String> errorMap = new HashMap<>();
   errorMap.put("errorMessage", exception.getMessage());
   return errorMap;
}

}
