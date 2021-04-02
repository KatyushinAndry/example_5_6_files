package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static Data.DataVareables.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.*;

public class PdfFileTests {
    @Test
    void pdfTest() throws IOException{
        PDF pdf=getPdf(pdfFilePath);
        assertThat(pdf, PDF.containsText(expectedPgfFileData));
    }

}