package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ivan on 01.03.2016.
 */
public class JokeReader {


    public static List<String> initArrFromFile() {
        List<String> jokes;

        Scanner s = null;
        jokes = new ArrayList<String>();

        try {
            s = new Scanner(new File("/home/ivan/IdeaProjects/untitled/src/com/company/jokes.txt"));
            while (s.hasNextLine()) {
                jokes.add(s.nextLine());
            }
        } catch (IOException e) {
            throw new JokeReaderException();

        } finally {
            if (s != null) {
                s.close();
            }
        }
        return jokes;
    }
}