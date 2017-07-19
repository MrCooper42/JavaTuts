package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Tippy on 7/4/2017.
 */

@Component
public class FileFortuneService implements FortuneService {

    private String fileName = "./src/fortune-data.txt";
    private List<String> theFortunes;

    // Random Number Generator
    private Random myRandom = new Random();

    public FileFortuneService() {
        System.out.println(">> FileFortuneService: Inside the default constructor");
    }

    @PostConstruct
    public void loadTheFortuneDataFile(){

        System.out.println(">> FileFortuneService: Inside the loadTheFortuneDataFile()");

        File theFile = new File(fileName);

        System.out.println("Reading fortunes from the file: " + theFile);
        System.out.println("File exists: " + theFile.exists());

        // initialize the array list
        theFortunes = new ArrayList<String>();

        // read fortunes from the file
        try(BufferedReader br = new BufferedReader(
                new FileReader(theFile))) {

            String tempLine;

            while((tempLine = br.readLine()) != null) {
                theFortunes.add(tempLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        // pick a random string from the array
        int index = myRandom.nextInt(theFortunes.size());

        String tempFortune = theFortunes.get(index);

        return tempFortune;
    }

}
