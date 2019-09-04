package effectivejava.chapter2.item3.staticfactory;

import java.io.Serializable;

/**
 * static factory 单例
 *
 * @author xuanjian
 */
public class Elvis implements Serializable {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }

}
