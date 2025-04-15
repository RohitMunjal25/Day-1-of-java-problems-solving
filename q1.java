public class q1{
    static String staticVariable="hello everyone";
    String nonStaticVariable="bye everyone";
    public static void main(String[] args) {
        System.out.println("static variable:"+q1.staticVariable);
        q1 obj=new q1();
        System.out.println("Non static variable:"+obj.nonStaticVariable);
    }

}