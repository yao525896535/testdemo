public class Test3 {
    public static void call1(){
        staticmethod();
//        nonstaticmethod(); //注释这行
    }

//	public static void call2(Test3 o1){
//		o1.nonstaticmethod();
//		Test3 o2=new Test3 ();
//		o2.nonstaticmethod();
//	}


    public void nonstaticmethod(){
        System.out.println("非静态方法被调用");
    }

    public static void staticmethod(){
        System.out.println("静态方法被调用");
    }

    public static void main(String[] arg){
        Test3 obj=new Test3 ();
        Test3.call1();
//        Test3.call2(obj);
    }
}
