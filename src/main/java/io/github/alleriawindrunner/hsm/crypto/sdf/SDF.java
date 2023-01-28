/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.alleriawindrunner.hsm.crypto.sdf;

public class SDF {
    public static SDFCryptoResult KeyGen(AlgorithmType algorithm) {
        return new SDFCryptoResult(SDFJNI.KeyGen(algorithm.swigValue()), true);
    }

    public static SDFCryptoResult Sign(String privateKey, AlgorithmType algorithm, String digest) {
        return new SDFCryptoResult(SDFJNI.Sign(privateKey, algorithm.swigValue(), digest), true);
    }

    public static SDFCryptoResult SignWithInternalKey(
            long keyIndex, String password, AlgorithmType algorithm, String digest) {
        return new SDFCryptoResult(
                SDFJNI.SignWithInternalKey(keyIndex, password, algorithm.swigValue(), digest),
                true);
    }

    public static SDFCryptoResult Verify(
            String publicKey, AlgorithmType algorithm, String digest, String signature) {
        return new SDFCryptoResult(
                SDFJNI.Verify(publicKey, algorithm.swigValue(), digest, signature), true);
    }

    public static SDFCryptoResult VerifyWithInternalKey(
            long keyIndex, AlgorithmType algorithm, String digest, String signature) {
        return new SDFCryptoResult(
                SDFJNI.VerifyWithInternalKey(keyIndex, algorithm.swigValue(), digest, signature),
                true);
    }

    public static SDFCryptoResult Hash(String key, AlgorithmType algorithm, String message) {
        return new SDFCryptoResult(SDFJNI.Hash(key, algorithm.swigValue(), message), true);
    }

    public static SDFCryptoResult ExportInternalPublicKey(long keyIndex, AlgorithmType algorithm) {
        return new SDFCryptoResult(
                SDFJNI.ExportInternalPublicKey(keyIndex, algorithm.swigValue()), true);
    }

    public static SDFCryptoResult makeResult(
            String signature,
            String publicKey,
            String privateKey,
            boolean result,
            String hash,
            long code,
            String arg6) {
        return new SDFCryptoResult(
                SDFJNI.makeResult(signature, publicKey, privateKey, result, hash, code, arg6),
                true);
    }
}
