package com.yash.streams;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileListing {
    public static void main(String[] args) throws IOException {
        try {
            Files.list(Paths.get(".")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Specifying current directory

        try {
            Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //return Selected file
       /* final String[] file = new File(".").list((File dir, String name)->name.endsWith(".java"));
        System.out.println(file);*/

        //return selected file
        Files.newDirectoryStream(Paths.get("."),
                path -> path.toString().endsWith(".java")).forEach(System.out::println);

        //return hidden files
        File[] file = new File(".").listFiles(File::isHidden);
        System.out.println(file.toString());

        //converting directory into streams

        List<File> files = Stream.of(new File(".").listFiles()).collect(Collectors.toList());
        System.out.println(files);
    }
}
