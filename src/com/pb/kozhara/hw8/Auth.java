package com.pb.kozhara.hw8;

import java.util.Objects;
import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException{
        if ( !Pattern.matches("[a-zA-Z0-9]{5,20}",login)) throw new WrongLoginException("Довжина має бути від 5 до 20 символів. " +
                "Login повинен містити лише латинські літери та цифри");
        if (!Pattern.matches("\\w{5,}+",password)) throw new WrongPasswordException("Довжина має бути більше 5, тільки латинські " +
                "літери та цифри та знак підкреслення.");
        if (!Objects.equals(password,confirmPassword)) throw new WrongPasswordException("password и confirmPassword повинні збігатися");
        this.login = login;
        this.password = password;

    }
    public void signIn(String login, String password) throws WrongLoginException {
        if (Objects.equals(login,this.login) && Objects.equals(password,this.password)) System.out.println("Успіх");
        else throw new WrongLoginException("Невірний логін або пароль");
    }
}
