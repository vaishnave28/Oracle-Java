import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;
public class ExcelReader {
    public static void main(String[] args) throws IOException {
        String excelFilePath = "data.xlsx";
        String sheetName = "Sheet1";
        try (Workbook workbook = WorkbookFactory.create(new FileInputStream(excelFilePath))) {
            Sheet sheet = workbook.getSheet(sheetName);
            Row row = sheet.getRow(0);

            String email = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();

            System.out.println("Email: " + email);
            System.out.println("Password: " + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
