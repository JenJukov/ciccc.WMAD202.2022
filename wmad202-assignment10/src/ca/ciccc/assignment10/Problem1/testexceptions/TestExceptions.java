package ca.ciccc.assignment10.Problem1.testexceptions;

public class TestExceptions {
    class ExceptionA1 extends Exception{
        ExceptionA1(String message){
            super(message);
        }
    }

    class ExceptionA2 extends Exception{
        ExceptionA2(String message){
            super(message);
        }
    }

    class ExceptionA3 extends Exception{
        ExceptionA3(String message){
            super(message);
        }
    }

    public class A {
        public void methodA1() throws ExceptionA1 {
            System.out.println("MethodA1 running");
            double probability = Math.random();
            System.out.println(probability);

            if(probability<0.5) {
                throw new ExceptionA1("Exception A1 raised!");
            }
        }

        public void methodA2() throws ExceptionA2 {
            System.out.println("MethodA2 running");
            double probability = Math.random();
            System.out.println(probability);

            if(probability<0.5) {
                throw new ExceptionA2("Exception A2 raised!");
            }

        }

        public void methodA3() throws ExceptionA3 {

            System.out.println("MethodA3 running");

            double probability = Math.random();
            System.out.println(probability);

            if(probability<0.5) {
                throw new ExceptionA3("Exception A3 raised!");
            }

        }
        public void testExceptions1() throws ExceptionA1 {

            //This method is supposed to handle any exceptions that could
            //potentially raised.
            //Please add proper code to fix the error
            //
            try {
                TestExceptions.A a = new A();
                a.methodA1();
            } catch (ExceptionA1 e) {
                System.out.println(e);
            }
        }

        public void testExceptions2() throws ExceptionA1, ExceptionA2, ExceptionA3 {

            //This method is supposed to handle any exceptions that could
            //potentially raised.
            //Please add proper code to fix the errors
            //Also, Add code to inform the user about the total number of
            //exceptions that have raised.
            try {
                TestExceptions.A a = new A();
                a.methodA1();
                a.methodA2();
                a.methodA3();
            } catch (ExceptionA1 a1) {
                throw new RuntimeException(a1);
            }

        }

        public void main(){
            TestExceptions test = new TestExceptions();
            test.testExceptions1();
            test.testExceptions2();
        }
    }

    private void testExceptions2() {
        A a1 = new A();
        try {
            a1.testExceptions2();
        } catch (ExceptionA1 e) {
            throw new RuntimeException(e);
        } catch (ExceptionA2 e) {
            throw new RuntimeException(e);
        } catch (ExceptionA3 e) {
            throw new RuntimeException(e);
        }
    }

    private void testExceptions1() {
        A a2 = new A();
        try {
            a2.testExceptions1();
        } catch (ExceptionA1 e) {
            throw new RuntimeException(e);
        }
    }
}
