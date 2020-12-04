package Lab_03;

import java.util.ArrayList;

public class Num1 {
    public static void main(String[] args) {
        PetOwner po = new PetOwner();
        po.addPet("Charlie", 7);
        po.addPet("Billy", 6);
        po.addPet("Lay", 7);
        po.addPet("Tom", 5);
        po.addPet("Jully", 6);
        po.addPet("Muk", 5);
        po.addPet("Lucky", 8);
        po.showPet();
        HomePets home = new HomePets();
        ArrayList owners1 = new ArrayList();
        owners1.add("Julia");
        owners1.add("Alex");
        owners1.add("Katie");
        owners1.add("Jake");
        home.addHomePet("Billy", owners1);
        ArrayList owners2 = new ArrayList();
        owners2.add("Annie");
        owners2.add("Billy");
        home.addHomePet("Charlie", owners2);
        ArrayList owners3 = new ArrayList();
        owners3.add("Danny");
        owners3.add("Danny's mom");
        owners3.add("Danny's dad");
        home.addHomePet("Lay", owners3);
        ArrayList owners4 = new ArrayList();
        owners4.add("Molly");
        owners4.add("Molly's mom");
        owners4.add("Molly's dad");
        home.addHomePet("Tom", owners4);
        ArrayList owners5 = new ArrayList();
        owners5.add("Christina");
        owners5.add("Marcus");
        home.addHomePet("Jully", owners5);
        ArrayList owners6 = new ArrayList();
        owners6.add("Roger");
        owners6.add("Roger's mom");
        owners6.add("Roger's dad");
        home.addHomePet("Muk", owners6);
        ArrayList owners7 = new ArrayList();
        owners7.add("Liam");
        owners7.add("Katie");
        owners7.add("Chuck");
        home.addHomePet("Lucky", owners7);
        home.showHomePets();
    }
}
