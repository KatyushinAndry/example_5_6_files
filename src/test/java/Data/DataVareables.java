package Data;

import java.io.File;

public class DataVareables {
    public static String txtFilePath="./src/test/resources/files/TxtFile.txt",
            expectedTxtFileData="Text to check from txt file",

            xlsFilePath="./src/test/resources/files/XlsFile.xls",
            expectedXlsFileData="6063c29dff38ab0df333587b",

            xlsxFilePath="./src/test/resources/files/XlsxFile.xlsx",
            expectedXlsxFileData="6063d3caa6e985090324e986",

            pdfFilePath="./src/test/resources/files/PdfFile.pdf",
            expectedPgfFileData="belkatan/example",

            zipFileWithoutPass="./src/test/resources/files/ZipFileWithoutPass.zip",
            unzipFolder="./src/test/resources/files/unzip",
            zipPassword="123456",
            unzipFileWithoutPass="./src/test/resources/files/unzip/ZipFileWithoutPass.txt",
            expectedZipFileWithoutPassData="ZipFileWithoutPass",

            zipFileWithPass="./src/test/resources/files/ZipFileWithPass.zip",
            unzipFileWithPass="./src/test/resources/files/unzip/ZipFileWithPass.txt",
            expectedZipFileWithPassData="ZipFileWithPass",

            //docxFilePath="./src/test/resources/files/DocxFile.docx",
            expectedDocData="Text to check from Doc file",
            expectedDocxData="Text to check from Docx file";

    public static File docFilePath=new File("./src/test/resources/files/DocFile.doc");
    public static File docxFilePath=new File("./src/test/resources/files/DocxFile.docx");
}
