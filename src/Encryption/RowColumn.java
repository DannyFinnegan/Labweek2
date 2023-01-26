package Encryption;

import java.util.Locale;

public class RowColumn {

    public static String encryptRowColumn(String plaintext, int numColumns)
    {
        plaintext=plaintext.toUpperCase();
        StringBuilder encryptedText = new StringBuilder("");
        for (int i=0;i<=plaintext.length()-1;i++)
        {
            if (!Character.isWhitespace(plaintext.charAt(i)))
            {
                encryptedText.append(plaintext.charAt(i));
            }
        }
        return String.valueOf(encryptedText);
    }
}