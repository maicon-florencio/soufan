package com.learning.feign.soufan.util;

import jakarta.xml.bind.DatatypeConverter;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashUtil implements Serializable {

    private HashUtil(){}

    public static String encodeForHashPorParams(String codigoASerCriptografado, String tipoCriptografia) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(tipoCriptografia);
        byte[] digest = md.digest(codigoASerCriptografado.getBytes(StandardCharsets.UTF_8));
        return DatatypeConverter.printHexBinary(digest).toLowerCase();
    }

}
