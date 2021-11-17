package src;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auth {
    String phone;
    String email;
    String code;
    String login;

    public Auth(String phone, String email, String code){
        this.phone = phone;
        this.email = email;
        this.code = code;
    }

    void fillLogin(){
        String regex = "^[+7]\\d{11}$";

        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(this.phone);
        if (matcher.find()) {
            if (this.login == null) {
                this.login = matcher.group();
                System.out.println(this.login);
            } else
                System.out.println("Login already filled");
        } else {
            regex = "^(.+)@(.+)$";
            pattern = Pattern.compile(regex, Pattern.MULTILINE);
            matcher = pattern.matcher(this.email);

            if(matcher.find()){
                this.login = matcher.group();
                System.out.println(this.login);
            } else
                System.out.println("Wrong login");
        }
    }

    String sendCode(){
        Coder c = new Coder(this.phone, this.email, this.code);
        String code = c.sendCode();
        if (this.code.length() != 6)
            this.code = code;
        else
            System.out.println("Code is already set");

        return this.code;
    }

    boolean checkCode(){
        Coder c = new Coder(this.phone, this.email, this.code);
        return c.checkCode();
    }

    class Coder extends Auth{
        private String code;

        Coder(String phone, String email, String code){
            super(phone, email, code);
            this.code = code;
        }

        String sendCode(){
            String result = "";
            Random random = new Random();

            for(int i = 0; i < 6; i++){
                result += String.valueOf(random.nextInt(10));
            }
            this.code = result;

            return result;
        }

        boolean checkCode(){
            String regex = "^\\d{6}$";
            Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            Matcher matcher = pattern.matcher(this.code);

            if(matcher.find()){
                return true;
            }
            return false;
        }
    }
}
