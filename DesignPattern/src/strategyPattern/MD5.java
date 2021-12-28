package strategyPattern;

public class MD5 implements Encrypt {
    @Override
    public void encrypt() {
        System.out.println("使用MD5加密中");
    }
}
