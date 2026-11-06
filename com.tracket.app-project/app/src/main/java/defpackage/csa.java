package defpackage;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class csa extends X509Certificate {
    public final byte[] A;
    public final /* synthetic */ int y;
    public final X509Certificate z;

    public /* synthetic */ csa(X509Certificate x509Certificate, byte[] bArr, int i) {
        this.y = i;
        this.z = x509Certificate;
        this.A = bArr;
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        switch (this.y) {
            case 0:
                this.z.checkValidity();
                break;
            default:
                this.z.checkValidity();
                break;
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getBasicConstraints();
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        int i = this.y;
        return this.A;
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getKeyUsage();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getNotBefore();
    }

    @Override // java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getPublicKey();
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.getVersion();
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        switch (this.y) {
            case 0:
                this.z.verify(publicKey);
                break;
            default:
                this.z.verify(publicKey);
                break;
        }
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        switch (this.y) {
            case 0:
                this.z.checkValidity(date);
                break;
            default:
                this.z.checkValidity(date);
                break;
        }
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        switch (this.y) {
            case 0:
                this.z.verify(publicKey, str);
                break;
            default:
                this.z.verify(publicKey, str);
                break;
        }
    }
}
