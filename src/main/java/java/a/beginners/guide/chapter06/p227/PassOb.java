package main.java.java.a.beginners.guide.chapter06.p227;

class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 имеет те же размеры, что и ob2: " + ob1.sameBlock(ob2));

        System.out.println("ob1 имеет те же размеры, что и ob3: " + ob1.sameBlock(ob3));

        System.out.println("ob1 имеет те же объем, что и ob3: " + ob1.sameVolume(ob3));
    }
}