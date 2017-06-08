/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package urlreadpagedemo;

import URLFileAPI.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlReadPageDemo {
    
    public static void main(String[] args) throws MalformedURLException, IOException {
        
        WeatherFile weather = new WeatherFile("weather","https://weather.gc.ca/rss/city/on-5_e.xml");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(weather.getFile()));
            
            weather.UpDateWeather();
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); 
            }

            reader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
