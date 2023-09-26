package printer_errors.groovy

import org.junit.Test

class TestExample {
    @Test
    void "Basic Tests"() {
        assert "3/56" == Printer.printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")
        assert "6/60" == Printer.printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz")
        assert "11/65" == Printer.printerError("kkkwwwaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyzuuuuu")
    }
}
