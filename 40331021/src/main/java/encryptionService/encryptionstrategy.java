package encryptionService;

public interface EncryptionStrategy {

    String encrypt(String message);

    String decrypt(String message);

}