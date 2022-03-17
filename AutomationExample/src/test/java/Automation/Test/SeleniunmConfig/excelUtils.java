package Automation.Test.SeleniunmConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Row;

public class excelUtils {
    private HSSFSheet ExcelWSheet = null;
    private HSSFWorkbook ExcelWBook = null;
    FileInputStream ExcelFile;
    String path = "";

    //Constructor to connect to the Excel with sheetname and Path
    public excelUtils(String Path) throws Exception {

        try {
        	path = Path;
            // Open the Excel file
            ExcelFile = new FileInputStream(Path);
            // Access the required test data sheet
            ExcelWBook = new HSSFWorkbook(ExcelFile);
            //ExcelWSheet = ExcelWBook.getSheet(SheetName);
        }
        catch (Exception e){
            throw (e);
        }
    }
    public int numSheets ()throws Exception{
        int numSheets =  ExcelWBook.getNumberOfSheets();
        return numSheets;
    }
    public void setSheet(String SheetName)throws Exception{
        try{
            ExcelWSheet = ExcelWBook.getSheet(SheetName);
        }catch (Exception e){
            throw (e);
        }

    }
    public List<String> getSheetsName () throws Exception{
        List<String> nameSehets = new ArrayList<String>();
        int numSheets = numSheets();
        System.out.println("Numero de sheets="+numSheets);
        for (int i = 0;i < numSheets;i++) {
            nameSehets.add(ExcelWBook.getSheetName(i));
            //System.out.println("Nombre = "+nameSehets.get(i)+"_numeroSheets= "+i);
        }
        return nameSehets;
    }
    public List<String> getNameColum(){
        List<String> nameColums = new ArrayList<String>();
        int lastcell= ExcelWSheet.getRow(0).getLastCellNum();
        //Non empty Last cell Number or index return
        for(int i=0;i<=lastcell;i++)
        {
            try
            {
                //System.out.println("Num Columna = "+i+" exelLetra = "+CellReference.convertNumToColString(i));
                String CellData = ExcelWSheet.getRow(0).getCell(i).getStringCellValue();
               System.out.println(i+"_"+CellData+"="+CellReference.convertNumToColString(i));
                //System.out.println(numCol);
                nameColums.add(i,CellData);
            }catch(Exception e)
            {}
        }
        return nameColums;

    }

    //This method is to set the rowcount of the excel.
    public int excel_get_rows() throws Exception {

        try{
            //String rowActive = ExcelWSheet.getActiveCell();
            return ExcelWSheet.getPhysicalNumberOfRows();
        }
        catch (Exception e){
            throw (e);
        }
    }
    public void setStadeOfTelefon(double numero, int col,int colEstado, String value){
        int cont = 1;
        int numFilas = 0;
        double getNumero = 0;
        try {
            numFilas = excel_get_rows();
            while ((numero == getNumero || cont >= numFilas) == false){
                System.out.println("buscando en ="+cont);
                if (col == -1){
                    System.out.println("Error DataTable: NO SE ENCONTRO LA COLUMNA");
                    cont = numFilas+1;
                }else {
                    getNumero = getCellDataasnumber(cont, col);
                    cont++;
                }

            }
            setCellValueString(cont,colEstado,value);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public int filaExe (String estado, int colEstado){
        int fila = 1;
        int cont = 1;
        int numFilas = 0;
        String estadoDataTable = "";
        try {
            numFilas = excel_get_rows();
            while ((estado.equals(estadoDataTable) || cont >= numFilas) == false){
                if (colEstado == -1){
                    System.out.println("Error DataTable: NO SE ENCONTRO LA COLUMNA");
                    cont = numFilas+1;
                    fila = -1;
                }else {
                    System.out.println("buscando en ="+cont);
                    estadoDataTable= getCellDataasstring(cont, colEstado);
                    fila = cont;
                    cont++;
                }

            }
            return fila;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    //This method to get the data and get the value as number.
    public double getCellDataasnumber(int RowNum, int ColNum) throws Exception {

        try {
            double CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
            System.out.println("The value of CellData " + CellData);
            return CellData;
        }
        catch (Exception e){
            return 0.0;
        }
    }

    //This method to get the data and get the value as strings.
    public String getCellDataasstring(int RowNum, int ColNum) throws Exception {

        try {
            if(ColNum > 0){
                ExcelWSheet.getColumnBreaks();
                String CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getRichStringCellValue().getString();
                System.out.println("The value of CellData " + CellData);
                return CellData;
            }else{
                System.out.println("NO HAY COLUMNA");
                return null;
            }

        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Errors in Getting Cell Data");
            return null;
        }
    }

    //This method to get the data and get the value as strings.

    public String getCellDate(int RowNum, int ColNum) throws Exception {

        try {
            ExcelWSheet.getColumnBreaks();
            Date CellData = ExcelWSheet.getRow(RowNum).getCell(ColNum).getDateCellValue();
            String stgCellData = CellData.toString();
            System.out.println("The value of CellData " + CellData);
            return stgCellData;
        }
        catch (Exception e) {
            e.printStackTrace();
            return "Errors in Getting Cell Data";
        }
    }
    public void setCellValueString(int RowNum, int ColNum,String value) throws Exception {

        try {
            if (ColNum > -1){
                ExcelWSheet.getColumnBreaks();
                ExcelWSheet.getRow(RowNum).getCell(ColNum).setCellValue(value);
            }else {
                System.out.print("NO HAY EXISTE LA COLUMNA");
            }
        }
        catch (Exception e) {
            e.printStackTrace();

        }
    }
	 public void saveFileExcel() {
    	FileOutputStream ExcelFileOut;
		try {
			ExcelFileOut = new FileOutputStream(new File(path));
			ExcelWBook.write(ExcelFileOut);
			ExcelFileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
