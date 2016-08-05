//Kheirallah Ashkar
//August 5th, 2016

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class internationalTimes
{

   public static void main(String argv[])
   {

   //Gets a calendar set to the default time zone
   Calendar cal = Calendar.getInstance();

   //Sets TimeZone variable time to our default time zone (America/New_York)
   TimeZone time = TimeZone.getDefault();

   //Sets table format for output
   System.out.println("Time zone:            City:             Time:");
   System.out.println();

   //Sets a time format for the output
   SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
   
      //Prints out the time and timezone in Washington DC
      
      //If cal.get(Calendar.AM_PM returns a value of 0 than AM is printed, 
      //otherwise PM is printed
      if (cal.get(Calendar.AM_PM) == 0)
         System.out.println(time.getID() + "      " + "Washington DC     " + sdf.format(cal.getTime()) + " AM");
      else
         System.out.println(time.getID() + "      " + "Washington DC     " + sdf.format(cal.getTime()) + " PM");

   //Prints out the time in Los Angeles
   time = TimeZone.getTimeZone("America/Los_Angeles");
      
   //Sets the SimpleDateFormat variable to the time zone given by the time variable
   //to display the time
   sdf.setTimeZone(time);
   
   //Sets the calendar to the time zone given by the time variable to display AM/PM
   cal.setTimeZone(time);

      if (cal.get(Calendar.AM_PM) == 0)
         System.out.println(time.getID() + "   " + "Los Angeles       " + sdf.format(cal.getTime()) + " AM");
      else
         System.out.println(time.getID() + "   " + "Los Angeles       " + sdf.format(cal.getTime()) + " PM");

   //Prints out the time in Amsterdam
   time = TimeZone.getTimeZone("Europe/Amsterdam");
   sdf.setTimeZone(time);
   cal.setTimeZone(time);

      if (cal.get(Calendar.AM_PM) == 0)
         System.out.println(time.getID() + "   " + "   Amsterdam         " + sdf.format(cal.getTime()) + " AM");
      else
         System.out.println(time.getID() + "   " + "   Amsterdam         " + sdf.format(cal.getTime()) + " PM");

   //Prints out the time in Jerusalem
   time = TimeZone.getTimeZone("Asia/Jerusalem");
   sdf.setTimeZone(time);
   cal.setTimeZone(time);

      if (cal.get(Calendar.AM_PM) == 0)
         System.out.println(time.getID() + "   " + "     Jerusalem         " + sdf.format(cal.getTime()) + " AM");
      else
         System.out.println(time.getID() + "   " + "     Jerusalem         " + sdf.format(cal.getTime()) + " PM");

   //Prints out the time in Hong Kong
   time = TimeZone.getTimeZone("Asia/Hong_Kong");
   sdf.setTimeZone(time);
   cal.setTimeZone(time);

      if (cal.get(Calendar.AM_PM) == 0)
         System.out.println(time.getID() + "   " + "     Hong Kong         " + sdf.format(cal.getTime()) + " AM");
      else
         System.out.println(time.getID() + "   " + "     Hong Kong         " + sdf.format(cal.getTime()) + " PM");

   }

}