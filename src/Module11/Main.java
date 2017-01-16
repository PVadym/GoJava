package Module11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Вадим on 16.01.2017.
 */
public class Main {
    public static void main(String[] args) {

        File file = new File("FileText.txt");
        try(BufferedWriter br = new BufferedWriter(new FileWriter(file)))
        {
            br.write("London is the capital of Great Britain, its political, economic and cultural centre. \n" +
                    "London is situated on the river Thames.");
            br.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileContentWork hw = new FileContentWork(file);


        Map<String,String> map = new HashMap<>();
        map.put("London","Kyiv");
        map.put("Britain","Ukraine");

        System.out.println("Task1. Измененная строка: ");
        System.out.println(hw.replacer(map));

        //Task2
        System.out.println("Task2. Перезаписываем файл с измененной строкой");
        hw.fileContentReplacer(map);

        //Task3
        System.out.println("Task3. Дозаписываем в файл измененную строку");
        hw.fileContentMerger(map);

        //Task4
        String word = "Kyiv";
        System.out.printf("Task4. Слово %s в файле повторяется %d раз.",word,hw.checkWord("Kyiv"));



    }
}
