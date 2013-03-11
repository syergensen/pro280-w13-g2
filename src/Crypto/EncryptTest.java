package Crypto;

public class EncryptTest {

	public static void main(String[] args) {
		System.out.println("admin1: " + Encryption.digest("admin1", EncryptionType.MD5));
		System.out.println("sean1: " + Encryption.digest("sean1", EncryptionType.MD5));
		System.out.println("joe1: " + Encryption.digest("joe1", EncryptionType.MD5));
	}
}
