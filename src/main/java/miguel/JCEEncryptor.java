package miguel;

import org.eclipse.persistence.internal.security.Securable;

public class JCEEncryptor implements Securable {
    @Override
    public String encryptPassword(String s) {
        System.out.println("encrypt " + s + " to " + s);
        return s;
    }

    @Override
    public String decryptPassword(String s) {
        System.out.println("decrypt " + s + " to " + s);
        return s;
    }
}
