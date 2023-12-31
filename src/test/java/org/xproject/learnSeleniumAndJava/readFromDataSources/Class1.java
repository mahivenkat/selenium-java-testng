package org.xproject.learnSeleniumAndJava.readFromDataSources;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.Date;

public class Class1 {
    public static void main(String[] args) throws IOException, ParseException {
//        readTextFile();
//        writeTextFile();
        readJsonFile();
    }
    public static void readTextFile() throws IOException {
        System.out.println("Start read text file");
        // File path is passed as parameter
        File file = new File("src/test/java/org/xproject/learnSeleniumAndJava/readFromDataSources/file1.txt");

        // Creating an object of BufferedReader class
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Declaring a string variable
        String st;
        // Condition holds true till there is character in a string
        while ((st = br.readLine()) != null) {
            // Print the string
            System.out.println(st);
        }

    }
    public static void writeTextFile() throws IOException {
        System.out.println("Start write text file");
        // File path is passed as parameter
        File file = new File("src/test/java/org/xproject/learnSeleniumAndJava/readFromDataSources/file2.txt");

        FileWriter fw = new FileWriter(file);
        Date d = new Date();
        fw.append("Last run time was : " + d.toString());
        fw.close();
    }

    public static void readJsonFile() throws IOException, ParseException {
        System.out.println("Start read json file");
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(
                new FileReader(
                        "src/test/java/org/xproject/learnSeleniumAndJava/readFromDataSources/file1.json"));

        for (Object o : jsonArray) {
            JSONObject person = (JSONObject) o;

            String strName = (String) person.get("name");
            System.out.println("Name::::" + strName);

            String strCity = (String) person.get("city");
            System.out.println("City::::" + strCity);

            JSONArray arrays = (JSONArray) person.get("cars");
            for (Object object : arrays) {
                System.out.println("cars::::" + object);
            }
            String strJob = (String) person.get("job");
            System.out.println("Job::::" + strJob);
            System.out.println();

        }
    }

    public void readExcel(){
        System.out.println("Start read excel ile");
    }
}
