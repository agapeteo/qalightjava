package ua.com.qalight.java2.io;

import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by emix on 5/24/14.
 */
public class InputOutputExample {
    /**
     * useful links:
     * http://docs.oracle.com/javase/tutorial/essential/io/index.html
     * http://tutorials.jenkov.com/java-io/overview.html
     * http://www.freejavaguide.com/corejava-io.pdf
     * http://java.novgorod.ru/lect/Java_COURSE_Lec15.pdf
     * http://tutorials.jenkov.com/java-nio/nio-vs-io.html
     * http://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
     * http://en.wikipedia.org/wiki/Java_version_history
     */

    public static void main(String[] args) {
        final InputOutputExample example = new InputOutputExample();
        final String directoryPath = args[0];
        example.printDirectoryFiles(directoryPath);
    }

    private void printDirectoryFiles(String path){
        if (path == null || path.length() == 0) {
            throw new IllegalStateException("path to directory is not given");
        }
        File file = new File(path);

        if (!file.exists()) {
            throw new IllegalStateException(String.format("file %s not exists in file system", path));
        }

        if (!file.isDirectory()) {
            throw new IllegalStateException("given path is not directory: " + path);
        }

        File[] files = file.listFiles();
        for (File eachFile : files){
            System.out.println(eachFile.getAbsolutePath() + " is " + (eachFile.isFile() ? "file" : "directory"));
        }
    }



}
