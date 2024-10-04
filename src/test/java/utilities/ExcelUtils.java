package utilities;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelUtils {
        public static Map<String, String> readExcel(String filePath) throws IOException {
            Map<String, String> data = new HashMap<>();
            try (FileInputStream fis = new FileInputStream(filePath);
                 Workbook workbook = new XSSFWorkbook(fis)) {
                Sheet sheet = workbook.getSheetAt(0);
                Row headerRow = sheet.getRow(0);
                for (Cell cell : headerRow) {
                    int columnIndex = cell.getColumnIndex();
                    String columnName = cell.getStringCellValue();
                    String cellValue = sheet.getRow(1).getCell(columnIndex).toString();
                    data.put(columnName, cellValue);
                }
            }
            return data;
        }
    }

