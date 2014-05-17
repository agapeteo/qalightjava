package ua.com.qalight.java2;

/**
 * Created by emix on 5/17/14.
 */
public class ShadowInnerClassExample {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowInnerClassExample.this.x = " + ShadowInnerClassExample.this.x);
        }
    }

    public static void main(String... args) {
        ShadowInnerClassExample st = new ShadowInnerClassExample();
        ShadowInnerClassExample.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
