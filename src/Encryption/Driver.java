package Encryption;

public class Driver
{
    public static void main(String[] args)
    {
        String Sentence = RowColumn.encryptRowColumn("This is an encrypted message",3);
        System.out.println(Sentence);
    }

}
