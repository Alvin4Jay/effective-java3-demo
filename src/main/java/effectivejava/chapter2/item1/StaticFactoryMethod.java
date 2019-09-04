package effectivejava.chapter2.item1;

import java.io.BufferedReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.Date;
import java.util.EnumSet;

/**
 * item1: 用静态工厂方法替代构造器
 *
 * @author xuanjian
 */
public class StaticFactoryMethod {

    public static void main(String[] args) throws Throwable {
        // from类型转换方法
        Instant now = Instant.now();
        Date nowDate = Date.from(now);
        System.out.println(nowDate.toString());

        // of聚合方法
        EnumSet<Rank> faceCards = EnumSet.of(Rank.JACK, Rank.QUEUE, Rank.KING);

        // valueOf
        BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);

        // create和newInstance
        Object newArray = Array.newInstance(int.class, 10);

        // getType
        FileStore fs = Files.getFileStore(Paths.get("/"));

        // newType
        BufferedReader br = Files.newBufferedReader(Paths.get("/"));
    }

    private enum Rank {
        JACK, QUEUE, KING
    }

}
