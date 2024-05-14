class test{
    int inst =1000;
    static int a = 100;
    public static void main(String[] args){
        int loc = 10000;
        test e1 = new test();
        System.out.println("hi"+a);
        System.out.println(loc);
        System.out.println(e1.inst);
    }
}