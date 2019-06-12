package Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xltestfile {
	
	public static String DESKTOP_PATH = (System.getProperty("user.home")+"/Desktop/");
	
		public static String TESTDATA_SHEET_PATH = DESKTOP_PATH + "/GofmproTestData.xlsx";

	 public static void main(String[] args) {
String envFilePath = System.getProperty("/home/zentere/Desktop/xltest.xlsx");

// upload list of files/directory to blob storage
File folder = new File(envFilePath);
File[] listOfFiles = folder.listFiles();

for (int i = 0; i < listOfFiles.length; i++) {
    if (listOfFiles[i].isFile()) {
        System.out.println("File " + listOfFiles[i].getName());

    Workbook workbook;
    //int masterSheetColumnIndex = 0;
    try {
            workbook = WorkbookFactory.create(new FileInputStream(envFilePath + "\\"+ listOfFiles[i].getName()));
            // Get the first sheet.
            Sheet sheet = workbook.getSheetAt(0);
            // Get the first cell.
            Row row = sheet.getRow(0);
            //Cell cell = row.getCell(0);
            for (Cell cell1 : row) {
                // Show what is being read.
                System.out.println(cell1.toString());   
                //masterSheetColumnIndex++;
            }
            //we will search for column index containing string "Your Column Name" in the row 0 (which is first row of a worksheet
            String columnWanted = "Modality Name";
            Integer columnNo = null;
            //output all not null values to the list
            List<Cell> cells = new ArrayList<Cell>();

            Row firstRow = sheet.getRow(0);

            for(Cell cell1:firstRow){
                if (cell1.getStringCellValue().equals(columnWanted)){
                    columnNo = cell1.getColumnIndex();
                }
            }

            if (columnNo != null){
			for (Row row1 : sheet) {
		   Cell c = row1.getCell(columnNo);
		   if (c == null || c.getCellType() == Cell.CELL_TYPE_BLANK) {
		      // Nothing in the cell in this row, skip it
		   } else {
		      cells.add(c);
		   }
			}
                System.out.println("");
            }else{
                System.out.println("could not find column " + columnWanted + " in first row of " + listOfFiles[i].getName());
                    }

            } catch (InvalidFormatException | IOException e) {
                e.printStackTrace();
        }
        }
    	}
	 	}
		}

