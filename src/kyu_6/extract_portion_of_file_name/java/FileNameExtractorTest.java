package kyu_6.extract_portion_of_file_name.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FileNameExtractorTest {
    @Test
    public void testSample() {
        assertEquals(
                "FILE_NAME.EXTENSION",
                FileNameExtractor.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION")
        );
        assertEquals(
                "FILE_NAME.EXTENSION",
                FileNameExtractor.extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34")
        );
    }
}
