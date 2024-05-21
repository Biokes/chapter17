package contactManager.validator;

import java.util.Optional;

public class Validator {

    public static void validateNumber(String number){
        if(!number.matches("[0-9]+"))
            throw new RuntimeException("invalid phone nmuber");
        if(number.isBlank())
            throw new RuntimeException("invalid phone nmuber");
    }
    public static void validateEmail(String mail){
        String mailPattern =
                "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]" +
                        "{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
        if(!mail.matches(mailPattern))
            throw new RuntimeException("invalid phone nmuber");
    }
    public static void validateName(String name){
        if(Optional.ofNullable(name).isEmpty())
            throw new RuntimeException("invalid name");
        if(name.isBlank())
            throw new RuntimeException("invalid name");
    }

}

