/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package URLFileAPI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

/**
 *
 * @author jomar9255
 */
public class WeatherFile extends FileInterface{
    
    public WeatherFile(String fileName) throws IOException
    {
        super(fileName);
    }
    
    public WeatherFile(String fileName, String url) throws MalformedURLException, IOException
    {
        super(fileName, url);
    }
    
     public void UpDateWeather()
    {
                try {
                    
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileURL.openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(URLFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
