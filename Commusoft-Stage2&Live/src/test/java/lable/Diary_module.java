package lable;

import org.testng.annotations.Test;

import action.Baseclass;
import pages.Diary;

 public class Diary_module extends Baseclass
 {
	 @Test(priority = 0)
	 public void diary() throws InterruptedException	 
	 {
		 Diary diary = new Diary(driver);
		 diary.Diary_Module();
		 diary.Diary_Daily();
		 diary.Diary_Today();
		 diary.Diary_Timing2();
		 diary.Diary_recurring();
		 //diary.Diary_Repeats();
		 //diary.Diary_Repeatsevery();
		 diary.Diary_Occurrences(); 
		 diary.Diary_Normal_EvenDescription();
		 diary.Diary_eventnotes();
		 Thread.sleep(3000);
		 diary.Diary_Notifications();
		 Thread.sleep(3000);
		 diary.Diary_NotifyEng();
		 diary.Diary_Notifymethod();
		 diary.Diary_Send_notification();
		 diary.Diary_subject();
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 diary.Diary_message();	
		 Thread.sleep(3000);
		 driver.switchTo().defaultContent();
		 diary.Diary_Save();
		 
	 }
	 
	
 }
