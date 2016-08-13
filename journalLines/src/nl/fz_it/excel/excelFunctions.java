package nl.fz_it.excel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelFunctions {

	public ArrayList <String []> IterateThroughRows(String fileInput,int maxNumberElementsRow) throws IOException{
	    File myFile = new File(fileInput);
	    FileInputStream fis = new FileInputStream(myFile);
	    long i=1;
	    
	    ArrayList <String []> cellRowsColumnValues=new ArrayList<String[]>();
	    // Finds the workbook instance for XLSX file
	    XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
	   
	    // Return first sheet from the XLSX workbook
	    XSSFSheet mySheet = myWorkBook.getSheetAt(0);
		
	    // Get iterator to all the rows in current sheet
	    //Iterator<Row> rowIterator = mySheet.iterator();
	    Iterator<Row> rowIterator=mySheet.iterator();
	    
	    // Traversing over each row of XLSX file
	    while (rowIterator.hasNext()) {
	        Row row = rowIterator.next();
	        String[] rowElements=new String[maxNumberElementsRow];
	        int j=0;
	        
	        // For each row, iterate through each columns
	        Iterator<Cell> cellIterator = row.cellIterator();
	        while (cellIterator.hasNext()) {
	
	            Cell cell = cellIterator.next();
	
	            switch (cell.getCellType()) {
	            case Cell.CELL_TYPE_STRING:
	            	rowElements[j]=cell.getStringCellValue();
	                //System.out.print(cell.getStringCellValue() + "\t");
	                break;
	            case Cell.CELL_TYPE_NUMERIC:
	            	rowElements[j]=String.valueOf(cell.getNumericCellValue());
	                //System.out.print(cell.getNumericCellValue() + "\t");
	                break;
	            case Cell.CELL_TYPE_BOOLEAN:
	            	rowElements[j]=String.valueOf(cell.getBooleanCellValue());
	                //System.out.print(cell.getBooleanCellValue() + "\t");
	                break;
	            default :
	         
	            }
	            
	            j++;
	        }
        	cellRowsColumnValues.add(rowElements);
        	i++;
	    }
	    return cellRowsColumnValues;
    
	}	   

	public static void csvToXLSX(String csvFile,String xlsxFile) {
	    try {
	        XSSFWorkbook workBook = new XSSFWorkbook();
	        XSSFSheet sheet = workBook.createSheet("sheet1");
	        String currentLine=null;
	        int RowNum=0;
	        BufferedReader br = new BufferedReader(new FileReader(csvFile));
	        while ((currentLine = br.readLine()) != null) {
	            String str[] = currentLine.split(",");
	            RowNum++;
	            XSSFRow currentRow=sheet.createRow(RowNum);
	            for(int i=0;i<str.length;i++){
	                currentRow.createCell(i).setCellValue(str[i]);
	            }
	        }

	        FileOutputStream fileOutputStream =  new FileOutputStream(xlsxFile);
	        workBook.write(fileOutputStream);
	        fileOutputStream.close();
	        System.out.println("Csv to Excel conversion done!");
	    } catch (Exception ex) {
	        System.out.println(ex.getMessage()+"Exception in try");
	    }
	}	
	
}
