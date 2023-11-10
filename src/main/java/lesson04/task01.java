package lesson04;

import lesson04.exceptions.WrongLoginException;
import lesson04.exceptions.WrongPasswordException;

public class task01 {

    public static void main(String[] args) {

    }

    public static boolean checkParams (String login, String pass, String pass2)
                        throws WrongLoginException, WrongPasswordException {
        boolean result = false;
        if (login.length() > 20) throw new WrongLoginException("Длина логина не должна превышать 20 символов");
        else if (pass.length() > 20) throw new WrongPasswordException( "Длина пароля не должна превышать 20 символов");
        else result = true;
        return result;
    }

}
