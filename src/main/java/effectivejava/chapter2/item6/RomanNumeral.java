package effectivejava.chapter2.item6;

import java.util.regex.Pattern;

/**
 * 避免创建不必要的对象
 *
 * @author xuanjian
 */
public class RomanNumeral {

    // 每次匹配，都需要创建一个Pattern对象
    public static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    // 类加载时已创建可重用的Pattern实例
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");


    // 复用单一的Pattern实例
    public static boolean isRomanNumeral(String exp) {
        return ROMAN.matcher(exp).matches();
    }

}
