package pkg2;

import pkg1.MyParent;

class MyChild extends MyParent {
    public void printMembers() {
//        System.out.println(prv); 에러 (private)
//        System.out.println(dft); 에러 (default)
        System.out.println(prt); // protected
        System.out.println(pub); // public
    }
}

public class MyParentTest2 {
    public static void main(String[] args) {

    }
}
