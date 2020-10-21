import org.apache.log4j.Logger;
import java.io.FilenameFilter;
import java.util.Scanner;
import java.io.File;

public class Main {

    final static Logger logger=Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner userKeys = new Scanner(System.in);

        String userWord;
        System.out.print("შეიყვანეთ საძიებო სიტყვა: ");
        userWord = userKeys.next();


        File directory = new File("C:\\Users\\user\\Desktop\\Java");

        String[] insideDirectory = directory.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().startsWith(userWord.toLowerCase())) {
                    return true;
                }else {
                    return false;
                }
            }
        });

        logger.info("შემოტანილი სიტყვა : " + userWord);

        for(String fileName: insideDirectory) {
            logger.info("მოიძებნა " + fileName);
        }
    }
}