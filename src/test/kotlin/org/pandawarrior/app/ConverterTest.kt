package org.pandawarrior.app

import org.junit.jupiter.api.Test

/**
 * Created by Trung Vo on 9/10/17.
 */
class ConverterTest {

    @Test
    fun writeXMLProcess() {
        println("----")
        var inputFile = "/Users/mtrung3/Downloads/translations - 2.csv"
        //""./src/test/resources/test/csv/test.csv"
        var outputDir = "/Users/mtrung3/Downloads/translated-xml"
        println("- csv file: " + inputFile)
        println("- out dir:  " + outputDir)

        processCSVToXML(inputFile, outputDir, TranslationType.NORMAL)
//            processCSVToXML("./src/test/resources/test/csv/test-plural.csv", "./src/test/resources/result/xml", TranslationType.PLURALS)
//            processCSVToXML("./src/test/resources/test/csv/test-array.csv", "./src/test/resources/result/xml", TranslationType.ARRAYS)

        println("----")
    }
}