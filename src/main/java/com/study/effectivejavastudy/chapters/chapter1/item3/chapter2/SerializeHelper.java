package com.study.effectivejavastudy.chapters.chapter1.item3.chapter2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializeHelper {

    public static void serialize(Test test) {
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("test.obj"));
            out.writeObject(test);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Test deSerialize() {
        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream("test.obj"));
            return (Test) in.readObject();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }


}
