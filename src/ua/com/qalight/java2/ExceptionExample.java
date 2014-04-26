package ua.com.qalight.java2;


public class ExceptionExample extends Throwable {
    public static void main(String[] args)  {
        int result = 0;
        try {
            result = testFinally();
        } catch (Throwable throwable) {
            // never leave it empty
            System.out.println("we caught Throwable");
            throwable.printStackTrace();
        }
        System.out.println(result);
    }

    public static int testFinally() throws Throwable{
        int result = 0;
        try {
            result = 1 + 1;
            throw new IndexOutOfBoundsException();
        } catch (NullPointerException e) {
            result = 2 + 2;
        } catch (Exception e) {
            result = 5 + 5;
        } catch (Throwable e) {
            result = 10 + 10;
        } finally {
            System.out.println("finally!");
        }


        return result;
    }





}



