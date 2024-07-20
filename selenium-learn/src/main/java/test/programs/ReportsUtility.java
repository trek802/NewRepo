package test.programs;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ReportsUtility {
		//Making the path string as they should be included in the report as a string
		public static String extentRepFolderString=null;
		public static String screenshotsFolderString=null;
		
		
		public void createReportFolders() {
			
			//Set AutomationResultsFolder path
			Path automationResultsFolderPath=Paths.get(System.getProperty("user.dir")+"/AutomationResults");
			
			//Set datefolder name and Set path
			String todayDate=new SimpleDateFormat("ddMMMyyyy").format(new Date());
			Path dateFolderPath=Paths.get(automationResultsFolderPath+"/"+todayDate);
			
			//Set timefolder name and Set path
			String currentTime=new SimpleDateFormat("HHmmss").format(new Date());
			Path timeFolderPath=Paths.get(dateFolderPath+"/"+currentTime);
			
			//Set extentRepfolder path
			Path extentRepFolderPath=Paths.get(timeFolderPath+"/ExtentReport");
			
			//Set screenshotfolder path
			Path screenshotFolderPath=Paths.get(timeFolderPath+"/Screenshots");
			
			try{
			if(Files.notExists(automationResultsFolderPath)) {
				Files.createDirectory(automationResultsFolderPath);
			}
			if(Files.notExists(dateFolderPath)) {
				Files.createDirectory(dateFolderPath);
			}
			Files.createDirectory(timeFolderPath);   
			Files.createDirectory(extentRepFolderPath);
			Files.createDirectory(screenshotFolderPath);
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			//Making the path string as they should be included in the report as a string
			extentRepFolderString=extentRepFolderPath.toString();
			screenshotsFolderString=screenshotFolderPath.toString();
		}
		
		
		public static void main(String[] args) {
			ReportsUtility r=new ReportsUtility();
			r.createReportFolders();
		}
	

}
