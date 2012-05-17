package _05_nulls;

import java.io.File;

public class Files {
    public static void main(String[] args) {
        int count = new File("test").listFiles().length;
        System.out.println(count);
    }

}
