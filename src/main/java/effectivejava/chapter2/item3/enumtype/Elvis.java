package effectivejava.chapter2.item3.enumtype;

/**
 * 枚举单例
 *
 * @author xuanjian
 */
public enum Elvis {

    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

}
