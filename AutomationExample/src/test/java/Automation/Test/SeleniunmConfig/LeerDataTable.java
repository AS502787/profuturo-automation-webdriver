package Automation.Test.SeleniunmConfig;

import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeerDataTable{
	
	public void leerDataTable() throws Exception {
		String nombreArchivo = "DataTable_Google.xlsx";
		String rutaArchivo = "C:\\Datas\\" + nombreArchivo;
		String hoja = "crearcuenta";
 
		try (FileInputStream file = new FileInputStream(new File(rutaArchivo))) {
			
			// leer archivo excel
			XSSFWorkbook worbook = new XSSFWorkbook(file);
			
			//obtener la hoja que se va leer
			XSSFSheet sheet = worbook.getSheetAt(0);
			
			//obtener todas las filas de la hoja excel
			Iterator<Row> rowIterator = sheet.iterator();
			Row row;
			
			// se recorre cada fila hasta el final
			while (rowIterator.hasNext()) {
				row = rowIterator.next();
				
				//se obtiene las celdas por fila
				Iterator<Cell> cellIterator = row.cellIterator();
				Cell cell;
				
				//se recorre cada celda
				while (cellIterator.hasNext()) {
					
					// se obtiene la celda en específico y se la imprime
					cell = cellIterator.next();
					System.out.print(cell.getStringCellValue()+" | ");
		
				}
				System.out.println();
			}
			
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
    public static void main( String[] args ) throws Exception
    {
    	LeerDataTable MyClase=new LeerDataTable();
    	MyClase.leerDataTable();
    	
    }
}
