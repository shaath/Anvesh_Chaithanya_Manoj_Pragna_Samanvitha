package driverScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import methods.OrgMaster;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Hybrid 
{
	@Test
	public void test() throws IOException
	{
		OrgMaster om=new OrgMaster();
		String  res=null;
		String xlpath="F:\\Evening 9 30 New\\SeleniumProject\\src\\testData\\Hybrid.xlsx";
		String xlout="F:\\Evening 9 30 New\\SeleniumProject\\src\\results\\Hybridres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Testcase");
		XSSFSheet ws1=wb.getSheet("Teststeps");
		XSSFSheet ws2=wb.getSheet("Empreg");
		
		int tcRc=ws.getLastRowNum();
		int tsRc=ws1.getLastRowNum();
		int emprc=ws2.getLastRowNum();
		
		for (int i = 1; i <= tcRc; i++) 
		{
			ws.getRow(i).createCell(3);
			String exe=ws.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String tcId=ws.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= tsRc; j++) 
				{
					String tstcId=ws1.getRow(j).getCell(0).getStringCellValue();
					if (tcId.equalsIgnoreCase(tstcId)) 
					{
						String key=ws1.getRow(j).getCell(3).getStringCellValue();
						System.out.println(key);
						switch (key) 
						{
						case "Launch":
							res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
							break;
						case "login":
							res=om.org_Login("Admin", "admin");
							break;
						case "logout":
							res=om.org_Logout();
							om.org_Close();
							break;
						case "Empreg":	
							for (int k = 1; k <= emprc; k++) 
							{
								String f=ws2.getRow(k).getCell(0).getStringCellValue();
								String l=ws2.getRow(k).getCell(1).getStringCellValue();
								res=om.org_Empreg(f, l);
								ws2.getRow(k).createCell(2).setCellValue(res);
							}
							
							break;
						case "Usereg":	
							res=om.org_Userreg("Sharath Chandra", "SharathChandra", "SharathChandra", "SharathChandra");
							break;
						case "Ulogin":
							res=om.org_Login("SharathChandra", "SharathChandra");
							break;
						default:
							System.out.println("Select a proper kweyword");
							break;
						}
						//Result updation in test steps sheet
						ws1.getRow(j).createCell(4).setCellValue(res);
						//Result updation in test Case sheet
						if (!ws.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							ws.getRow(i).getCell(3).setCellValue(res);
						}
					}
				}
			}
			else
			{
				ws.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}


}
