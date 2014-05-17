package ua.com.qalight.java2;

/**
 * Created by emix on 5/17/14.
 */
public class ThisSuperExample {

    static class Father {

        Son son;
        String name;

        void setName(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }

        void setFather(Son son) {
            this.son = son;
        }

    }

    static class Son extends Father{
        String name;


        @Override
        void setFather(Son son){
            System.out.println("overrided setFather");
            super.setFather(this);
        }

        void setFather(){
            System.out.println("overrided setFather");
            super.setFather(this);
        }

        String getName() {
            return name;
        }

        void setFathersName(String name){
            super.setName(name);
        }

        void whoAmI(){
            System.out.println("My name is " + this.name + ", my Fathers name is " + super.name);
        }

        @Override
        void setName(String name) {
            this.name = name;
        }


    }

    public static void main(String[] args) {
        Son smallerSon = new Son();
        smallerSon.setFathersName("Vladimir");
        smallerSon.setName("Vova");

        smallerSon.setFather();


        Son olderrSon = new Son();
        olderrSon.setFathersName("Vladimir");
        olderrSon.setName("Misha");
        olderrSon.setFather();


        smallerSon.whoAmI();
        olderrSon.whoAmI();

    }
}
