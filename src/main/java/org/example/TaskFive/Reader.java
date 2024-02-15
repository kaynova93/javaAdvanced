package org.example.TaskFive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Reader {
    String file = "C:/Users/User/IdeaProjects/javaAdvanced/src/main/java/org/example/TaskFive/test.txt";
    List<String> listString;

    /**
     * Метод читает данные из файла
     * @return список
     */
    public List<String> read() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            String line = br.readLine();
            while (line != null) {
                listString = new LinkedList<>( Arrays.asList(line.split(" ")));
                line = br.readLine();
            }
            return listString;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            br.close();
        }
    }
}