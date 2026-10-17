// this activity is mainly to explain multilevel inheritance

// Parent Class
class Animal {
    void eat(){
        System.out.println("eating...Animal class...eat method");
    }
}

// Child Class
class Lion extends Animal {
    void roar(){
        System.out.println("Roar...Lion class...roar method");
    }
}

// Child of child
class BabyLion extends Lion{
    void weep() {
        System.out.println("Weeping...BabyLion class...weep method");
    }
}

class animals {
    public static void main(String args[]) {
        BabyLion obj=new BabyLion(); //object of child of child class
        obj.weep();
        obj.roar();
        obj.eat();
    }
}
