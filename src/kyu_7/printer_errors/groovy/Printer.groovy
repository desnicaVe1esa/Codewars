package kyu_7.printer_errors.groovy

class Printer {
    static String printerError(s) {
        def errorCount = s.findAll { it < 'a' || it > 'm' }.size()
        def totalLength = s.size()
        return "$errorCount/$totalLength"
    }
}
