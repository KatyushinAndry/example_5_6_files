package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static Data.DataVareables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;
import static utils.Zip.unzip;

public class ZipFileTests {
    @Test
    void zipWithPasswordTest() throws IOException, ZipException{
        unzip(zipFileWithPass, unzipFolder, zipPassword);
        String actualData=readTextFromPath(unzipFileWithPass);
        assertThat(actualData, containsString(expectedZipFileWithPassData));
    }

    @Test
    void zipTest() throws IOException, ZipException{
        unzip(zipFileWithoutPass, unzipFolder);
        String actualData=readTextFromPath(unzipFileWithoutPass);
        assertThat(actualData, containsString(expectedZipFileWithoutPassData));
    }

}