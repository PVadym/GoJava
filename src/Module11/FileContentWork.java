package Module11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Вадим on 16.01.2017.
 */
public class FileContentWork {
    private File file;// = new File("C:/Users/Вадим/Desktop/FileText.txt");

    public FileContentWork(File file) {
        this.file = file;
    }

    //Task1
    public  String replacer(Map<String, String> map){
        String string = fromFileToStringTryResours(file);

        for (Map.Entry<String,String> pair : map.entrySet()){
            String regex = pair.getKey();
            String replacer = pair.getValue();
            string = string.replaceAll(regex,replacer);
        }
        return string;
    }
    //Task2
    public  File fileContentReplacer(Map <String,String> map){
        String newString = replacer(map);
        return saveToFile(newString,false);
    }

    //Task3
    public  File fileContentMerger(Map <String,String> map){
        String newString = replacer(map);

        return saveToFile(newString,true);
    }

    //Method that save string to the file
    public  File saveToFile (String s, boolean append){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, append))) {
            bw.write(s);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }


    //Method that return string from text file:

    //try with resources
    public  String fromFileToStringTryResours(File file){
        String output = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine())!=null){
                output+=line+System.lineSeparator();
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
        return output;
    }

    //usual try
    public  String fromFileToStringUsualTry(File file){
        String output = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine())!=null){
                output+=line+System.lineSeparator();
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }
        if (br!=null) try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

    //Task 4

    public  int checkWord(String word){
        String string = fromFileToStringUsualTry(file);
        int result = string.split(word).length-1;

        return result;
    }




}
