import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.KeyGenerator;
import java.security.SecureRandom;
import java.util.Base64;

public class MessageEncryptor {
    private SecretKey secretKey;

    public MessageEncryptor() throws Exception {
        // Geração da chave secreta
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128, new SecureRandom());
        secretKey = keyGenerator.generateKey();
    }

    public String encrypt(String message) throws Exception {
        // Inicialização do Cipher para operação de criptografia
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        
        // Criptografar a mensagem
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());

        // Converter o resultado para Base64 para facilitar o armazenamento ou transmissão
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    public String decrypt(String encryptedMessage) throws Exception {
        // Inicialização do Cipher para operação de descriptografia
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        // Converter a mensagem criptografada de Base64 para bytes
        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedMessage);

        // Descriptografar a mensagem
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

        return new String(decryptedBytes);
    }
}
