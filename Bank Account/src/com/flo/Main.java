package com.flo;

public class Main {

    public static void main(String[] args) {
//	BankAccount flosAccount = new BankAccount("12345", 0.00, "Flo",
//            "mymail@flo", "(000) 123 - 456789");
//	System.out.println(flosAccount.getNumber());
//	System.out.println(flosAccount.getBalance());
//
//	flosAccount.withdrawal(100.0);
//
//	flosAccount.deposit(50.0);
//	flosAccount.withdrawal(100.0);
//
//	flosAccount.deposit(51.0);
//	flosAccount.withdrawal(100.0);
//
//    VipPerson person1 = new VipPerson();
//    System.out.println(person1.getName());
//
//    VipPerson person2 = new VipPerson("Bob", 25000.00);
//    System.out.println(person2.getName());
//
//    VipPerson person3 = new VipPerson("Flo",100.00, "flo@mail.de");
//    System.out.println(person3.getName());

//    Wall wall = new Wall(5,4);
//    System.out.println("area= " + wall.getArea());
//
//    wall.setHeight(-1.5);
//    System.out.println("width= " + wall.getWidth());
//    System.out.println("height= " + wall.getHeight());
//    System.out.println("area= " + wall.getArea());

     Point first = new Point(6,5);
     Point second = new Point(3,1);
        System.out.println("distance (0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance (2,2)= " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
