package lesson7.lecture.reviewofinner.member.inner;

class MyOuterClass {
    MyInnerClass inner;
    private String param;

    MyOuterClass(String param) {
        inner = new MyInnerClass("innerStr");
        this.param = param; // the outer class version of this
    }

    public static void main(String[] args) {
        (new MyOuterClass("outerStr")).outerMethod();
    }

    void outerMethod() {
        System.out.println(inner.innerParam);
        inner.innerMethod();
//		String t = inner.this.innerParam; //compiler error
    }

    class MyInnerClass {
        private static final int count = 0;
        private String innerParam;

        MyInnerClass(String innerParam) {
            // the inner class version of 'this'
            this.innerParam = innerParam;
        }

        void innerMethod() {
            // accessing enclosing class's version of this
            System.out.println(MyOuterClass.this.param);

            // same as the following
            System.out.println(param);
        }
    }
}
