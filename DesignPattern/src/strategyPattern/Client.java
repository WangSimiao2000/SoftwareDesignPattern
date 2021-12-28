package strategyPattern;

public class Client {
    public static void main(String[] args) {
        new EncryptSystem(new MD5()).display();
        new EncryptSystem(new KaiSaLa()).display();
    }
}
