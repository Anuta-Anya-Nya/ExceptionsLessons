package HomeWork3;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private static String format;

    public Writer(String format){
        Writer.format = format;
    }
    
    public void write(PersonCard personCard){
        String fieldForWrite = "surname";
        String fileName = personCard.getPersonInfo().get(fieldForWrite) + format;
        try(FileWriter writer = new FileWriter(fileName, true))
        {
            writer.write(personCard.getTextForWrite());            
            writer.append('\n');             
            writer.flush();
        }
        catch(IOException ex){             
            System.out.println(ex.getStackTrace());
        }
    }

    public String getFormat() {
        return format;
    }

}
