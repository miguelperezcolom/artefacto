package miguel;

import org.eclipse.persistence.internal.security.Securable;

public class JCEEncryptor implements Securable {
    @Override
    public String encryptPassword(String s) {
        return s;
    }

    @Override
    public String decryptPassword(String s) {
        return s;
    }
}
