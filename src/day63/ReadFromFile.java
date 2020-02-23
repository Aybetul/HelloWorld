package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import day63.MethodsAndMap.*;
public class ReadFromFile {
    public static void main(String[] args) {


        // List<String> all=  Files.readAllLines(Paths.get("/src/day63/mapPractice.txt"));
        try {

            List<String> allLines = Files.readAllLines(Paths.get("src/day63/mapPractice.txt"));
            System.out.println("allLines = " + allLines);
String str=allLines.toString();
//Map<String ,Integer> map=MethodsAndMap.wordCount(allLines.toString());
        } catch (IOException e) {
            System.out.println("ERRORR!!!");
        }
    } }