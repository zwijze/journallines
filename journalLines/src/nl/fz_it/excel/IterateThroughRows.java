package nl.fz_it.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class IterateThroughRows {
	
	String fileCsvInput;
	String fileXlsx;
	String fileCsvOutput;
	
	public IterateThroughRows(String fileCsvInput, String fileXlsx, String fileCsvOutput){
	}

	public ArrayList <String []> startIteration(String fileInput,int maxNumberElementsRow) throws IOException{
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
  

}

