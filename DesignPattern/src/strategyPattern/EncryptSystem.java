package strategyPattern;

public class EncryptSystem {
    private Encrypt encrypt;

    public EncryptSystem(Encrypt encrypt) {
        this.encrypt = encrypt;
    }
    public void display(){
        encrypt.encrypt();
    }
}
