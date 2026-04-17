package lk.tech.twentythree;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class MainCSV {

    public static void main(String[] args) throws IOException {

        String csv = IOUtils.resourceToString("/files/table.csv", StandardCharsets.UTF_8);

        CSVFormat format = CSVFormat.DEFAULT
                .builder()
                .setHeader("key", "value", "value2")
                .setSkipHeaderRecord(false)
//                .setTrim(true)
                .setDelimiter(";")
                .get();

        CSVParser parser = CSVParser.parse(
                new StringReader(csv),
                format
        );

        List<CsvDto> list = parser.stream().map(csvRecord -> {
            String key = csvRecord.get("key");
            String value = csvRecord.get("value2");
            return new CsvDto(key, value);
        }).toList();

        System.out.println(list);
    }
}
