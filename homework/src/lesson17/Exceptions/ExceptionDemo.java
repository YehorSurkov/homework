package lesson17.Exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {
        isCorrect("login", "pass1", "pass1");
        //isCorrect("loginloginloginloginloginloginloginlogin","pass1","pass1");
        //isCorrect("login","pass1pass1pass1pass1pass1pass1pass1","pass1pass1pass1pass1pass1pass1pass1");
        //isCorrect("login","pass1","pass2");
    }

    public static boolean isCorrect(String login, String password, String samplePassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Wrong Login");
            }
            if (password.length() > 20 || !password.equals(samplePassword)) {
                throw new WrongPasswordException("Wrong Password");
            }
            return true;
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        } finally {
            System.out.printf("login %s, password %s", login, password);
        }
        return true;
    }
}
