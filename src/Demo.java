import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        MyList trans = new MyListImpl();
        Bus b = new Bus("ПАЗ", "Евро-5");
        b.setHorsePower(300);
        b.setNumOfSits(55);
        Offroad off = new Offroad("Toyota", "Land Rover");
        off.setHorsePower(520);
        off.setNumOfSits(6);
        Sportcar sp = new Sportcar("Audi", "TT");
        sp.setHorsePower(440);
        sp.setNumOfSits(2);
        Atv at = new Atv("Hammer", "Tipper 200");
        at.setHorsePower(120);
        at.setNumOfSits(1);
        Bicycle cu = new Bicycle("Cube", "Rouge 3000");
        cu.setHorsePower(0);
        cu.setNumOfSits(1);
        trans.add(b);
        trans.add(off);
        trans.add(sp);
        trans.add(at);
        trans.add(cu);
        for (Transport t : trans) {
            System.out.println(t);
            t.makeVroom();
        }
        Iterator<Transport> it = trans.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(trans);
    }
}

