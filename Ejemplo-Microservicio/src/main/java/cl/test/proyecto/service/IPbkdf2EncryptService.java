package cl.test.proyecto.service;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public interface IPbkdf2EncryptService {
    String generateHashPassword(String password) throws NoSuchAlgorithmException, InvalidKeySpecException;
    boolean validatePassword(String originalPassword, String storedPassword) throws NoSuchAlgorithmException, InvalidKeySpecException;
}
