class test{
    int a;
    static test t3 = new test();
    public static void main(String[] args){
        int a = 100;
        test t1 = new test();
        System.out.println("main"+a);
        t1.A();
        t3.A();
    }
    public  void A(){
        int a= 200;
        test t2 = new test();
        System.out.println("A"+a);
        t2.B();
       
        
    }
    public void B(){
        int b = 300;
        System.out.println("B"+b);
        System.out.println("DONE");

    }
   
}