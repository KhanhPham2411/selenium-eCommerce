package helper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.apache.commons.io.IOUtils;

public class ResourceHelper {
	public String getAbsolutePath(String resourceRelativePath) {
        ClassLoader classLoader = getClass().getClassLoader();
		File resourceFile = new File(classLoader.getResource(resourceRelativePath).getFile());
        String resourceAbsolutePath = resourceFile.getAbsolutePath();
        
        try {
			resourceAbsolutePath = URLDecoder.decode(resourceAbsolutePath, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
        }
        
        return resourceAbsolutePath;
    }

    public String readAllText(String resourceRelativePath){
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream resourceStream = classLoader.getResourceAsStream(resourceRelativePath);

        String text = "";
        try {
            text = IOUtils.toString(resourceStream, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}

