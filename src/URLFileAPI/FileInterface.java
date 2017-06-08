/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package URLFileAPI;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * The WeatherInfo class is designed to gather and store the RSS weather 
 * documentation as supplied by the Government of Canada's public weather feed.
 *
 * @author Joshua Marquardt
 */
public class FileInterface {
 
    protected File URLFile;
    protected URL fileURL;
    
    /** 
     * 
     * @param fileName 
     */
    public FileInterface(String fileName) throws IOException
    {
        URLFile = new File(fileName);
        initFile();
        
    }
    
    /**
     * 
     * @param fileName
     * @param url
     */ 
    public FileInterface(String fileName, String url) throws MalformedURLException, IOException
    {
        URLFile = new File(fileName);
        fileURL = new URL(url);
        initFile();
        
    }
    
    /**
     * 
     * @return 
     */
    public URL getURL()
    {
        return fileURL;
    }
    
    /**
     * 
     * @param url 
     */
    public void setURL(URL url)
    {
        fileURL = url;
    }
    
    /**
     * 
     * @return 
     */
     public File getFile()
    {
        return URLFile;
    }
     
     /**
      * 
      * @return 
      */
    public String getFileName()
    {
        return URLFile.toString();
    }
    
    /**
     * 
     * @param file 
     */
    public void setFile(File file)
    {
        URLFile = file;
    }

    protected void initFile() throws IOException
    {
       
        BufferedWriter writer = new BufferedWriter(new FileWriter(URLFile));
        writer.close();
    }
}
