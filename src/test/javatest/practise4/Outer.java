package test.javatest.practise4;


//   test1
//public class Outer {
//    private int index = 100;
//
//    void print() {
//        Inner i = new Inner();
//        i.print();
//    }
//
//    class Inner {
//        void print() {
//            System.out.println(index);
//        }
//    }
//}
//class Test{
//    public static void main(String[] args) {
//         Outer o=new Outer();
//        o.print();
//    }
//}


//test2
//public class Outer{
//    private int index=100;
//    class Inner{
//        private int index=50;
//        void print(){
//            int index=30;
//            System.out.println(index);
//            System.out.println(this.index);
//            System.out.println(Outer.this.index);
//        }
//    }
//    void print(){
//        Inner i=new Inner();
//        i.print();
//    }
//}
//class Test{
//    public static void main(String[] args) {
//        Outer o=new Outer();
//        o.print();
//    }
//}

//test3
//class Outer {
//    private static int index = 100;
//
//    class Inner {
//        private int index = 50;
//
//        void print() {
//            int index = 30;
//            System.out.println(index);
//            System.out.println(this.index);
//            System.out.println(Outer.this.index);
//        }
//
//    }
//    void print(){
//        Inner inner=new Inner();
//        inner.print();
//    }
//    Inner getInner(){
//        return new Inner();
//    }
//
//
//
//}
//class Test{
//    public static void main(String[] args) {
//        Outer outer=new Outer();
//       Outer. Inner inner=outer.getInner();
//       inner.print();
//    }
//}

//test4
//class Outer{
//    private static int index=100;
//    class Inner{
//        private int index=50;
//        void print(){
//            int index=30;
//            System.out.println(index);
//            System.out.println(this.index);
//            System.out.println(Outer.this.index);
//        }
//
//    }
//    void print(){
//        Inner inner=new Inner();
//        inner.print();
//    }
//    Inner getInner(){
//        return new Inner();
//    }
//
//}
//class Test{
//    public static void main(String[] args) {
//        Outer outer=new Outer();
//        Outer.Inner inner=outer.getInner();
//        inner.print();
//    }
//}

//test5
//class Outer{
//    private static int index=100;
//    void fn(){
//        if (true){
//            class Middle{
//                private int index=60;
//                class Inner{
//                    private int index=50;
//                    void print(){
//                        int index=30;
//                        System.out.println(index);
//                        System.out.println(this.index);
//                        System.out.println(Middle.this.index);
//                        System.out.println(Outer.this.index);
//                    }
//                }
//            }
//        }
//    }
//
//    void print(){
//
//    }
//
//}



public class Outer {
    private static int index=100;
    void fn() {
        int a=5;
        if(true) {
            class Middle{
                private int index=60;
                class Inner{
                    private int index=50;
                    void print() {
                        int index=30;//方法中的内部类作用范围只在该方法中，外部无法调用方法中的内部类
                        System.out.println(index);
                        System.out.println(this.index);
                        System.out.println(Middle.this.index);
                        System.out.println(Outer.this.index);//外部类.this.变量/方法：访问外部变量
                        System.out.println(a);
                    }
                }
            }
            Middle m=new Middle();
            Middle.Inner in=m.new Inner();
            in.print();
        }
    }

}
class Test {
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.fn();
    }
}