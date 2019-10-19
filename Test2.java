public class Test2 {
    private int i = -100;

    public void test1(int b) {
        b = 100;
    }

    public void test2(Test2 b) {
        b.i = 100;
    }

    public void test3(Test2 b) {
        b = this;
    }

    public static void main(String[] args) {
        Test2 obj = new Test2();
        int temp = 100;
        obj.test1(temp);
        System.out.println(temp);

        obj.test2(obj);
        System.out.println(obj.i);

        obj.i=100;
        Test2 newobj = new Test2();
        obj.test3(newobj);
        System.out.println(newobj.i);
    }
}
