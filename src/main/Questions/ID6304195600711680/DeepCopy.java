package main.Questions.ID6304195600711680;

import java.io.*;

public class DeepCopy {

    public SomeRandomObject exec(SomeRandomObject someRandomObject) {
        SomeRandomObject  deepCopy = null;

        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(someRandomObject);
            objectOutputStream.flush();
            objectOutputStream.close();
            byteArrayOutputStream.close();
            byte[] bytes = byteArrayOutputStream.toByteArray();

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            deepCopy = (SomeRandomObject) objectInputStream.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return deepCopy;
    }
}
