package diff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Provides basic operations with files.
 *
 * User: Oleg_Kariakin
 * Date: 11/27/15
 */
public class Reader {

    public List<String> fileToLines(String fileName) throws IOException {
        InputStream in = getClass().getResourceAsStream(fileName);
        List<String> lines = new LinkedList<String>();
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
