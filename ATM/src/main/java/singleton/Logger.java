package singleton;

import java.io.*;

public class Logger {
    //Singleton Creational Pattern
    public static OutputStream writer = null;

    private static void initialize(){
        try {
            writer = new FileOutputStream(new File("E:\\FACULTATE\\AN 3\\SEMESTRU 6\\DP\\DesignPatterns\\ATM\\logger.txt"));
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    public static void log(String message){
        if(writer == null){
            initialize();
        }

        try{
            Logger.writer.write(message.getBytes(), 0 , message.length());
            Logger.writer.write("\n".getBytes());

        }catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
