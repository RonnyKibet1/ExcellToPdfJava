import com.spire.xls.FileFormat;
import com.spire.xls.Workbook;

public class main {
    public static void main(String[] args) {
        ExcelToPDF();
    }


    private static void ExcelToPDF() {

            //Load the input Excel file
            Workbook workbook = new Workbook();
            workbook.loadFromFile("Financial Sample.xlsx");

            //Fit to page
            workbook.getConverterSetting().setSheetFitToPage(true);

            //Save as PDF document
            workbook.saveToFile("ExcelToPDF.pdf", FileFormat.PDF);
        }

}
