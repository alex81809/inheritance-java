// hierarchal classes

//Parent Class
class Mammals {
    void mam(){
        System.out.println("Inside Mammals Class");
    }
}

//Child Class
class Lion extends Mammals {
    void roar(){
        System.out.println("Inside Lion Class");
    }
}

// child
class Human extends Mammals {
    void hum(){
        System.out.println("Inside Human");
    }
}

class mammals{
    public static void main(String args[]) {
        Lion obj=new Lion(); //object of child of child class
        obj.hum(); //this will result in error to run this we have to create object of human
        obj.roar();
        obj.mam();
    }
}
