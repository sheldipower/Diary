package Util;

import Exeptions.WrongInputExeption;

public class ValidateUtils {
    public static String checkString (String str) throws WrongInputExeption {
        if (str == null || str.isEmpty() || str.isBlank()) {
            throw new WrongInputExeption ("Некорректный ввод");
        } else {
            return str;
        }
    }
}
