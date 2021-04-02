package tests;

import org.junit.jupiter.api.Test;

import static Data.DataVareables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromDocPath;
import static utils.Files.readTextFromDocxFile;



public class DocFileTests {
    @Test
    void docTest(){
        String actualData=readTextFromDocPath(docFilePath);
        assertThat(actualData, containsString(expectedDocData));
    }

    @Test
    void docxTest(){
        String actualData=readTextFromDocxFile(docxFilePath);
        assertThat(actualData, containsString(expectedDocxData));
    }
}