package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static Data.DataVareables.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.*;

public class XlsFileTests {

    @Test
    void xlsSimpleTest() throws IOException{
        XLS xls=getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedXlsFileData));
    }

    @Test
    void xlsCellTest() throws IOException{
        XLS xls=getXls(xlsFilePath);
        String actualData=xls.excel.getSheetAt(0).getRow(3).getCell(1).toString();
        assertThat(actualData, containsString(expectedXlsFileData));
    }

    @Test
    void xlsxTest(){
        String actualData=readXlsxFromPath(xlsxFilePath);
        assertThat(actualData, containsString(expectedXlsxFileData));
    }

}