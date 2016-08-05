import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class internationalTimes
{

public static void main(String argv[])
{

Calendar cal = Calendar.getInstance();

//Default time zone is America/New_York
TimeZone time = TimeZone.getDefault();

System.out.println("Time zone:            City:             Time:");

//Prints out the time and timezone in Washington DC
SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

System.out.println();

if (cal.get(Calendar.AM_PM) == 0)
System.out.println(time.getID() + "      " + "Washington DC     " + sdf.format(cal.getTime()) + " AM");
else
System.out.println(time.getID() + "      " + "Washington DC     " + sdf.format(cal.getTime()) + " PM");

//Prints out the time in Los Angeles
time = TimeZone.getTimeZone("America/Los_Angeles");
sdf.setTimeZone(time);

if (cal.get(Calendar.AM_PM) == 0)
System.out.println(time.getID() + "   " + "Los Angeles       " + sdf.format(cal.getTime()) + " AM");
else
System.out.println(time.getID() + "   " + "Los Angeles       " + sdf.format(cal.getTime()) + " PM");

System.out.println();

//Prints out the time in Amsterdam
time = TimeZone.getTimeZone("Europe/Amsterdam");
sdf.setTimeZone(time);

if (cal.get(Calendar.AM_PM) == 1)
System.out.println("The time in Amsterdam is: " + sdf.format(cal.getTime()) + " AM");
else
System.out.println("The time in Amsterdam is: " + sdf.format(cal.getTime()) + " PM");

System.out.println();

//Prints out the time in Jerusalem
time = TimeZone.getTimeZone("Asia/Jerusalem");
sdf.setTimeZone(time);

if (cal.get(Calendar.AM_PM) == 1)
System.out.println("The time in Jerusalem is: " + sdf.format(cal.getTime()) + " AM");
else
System.out.println("The time in Jerusalem is: " + sdf.format(cal.getTime()) + " PM");

System.out.println();

//Prints out the time in Hong Kong
time = TimeZone.getTimeZone("Asia/Hong_Kong");
sdf.setTimeZone(time);

if (cal.get(Calendar.AM_PM) == 1)
System.out.println("The time in Hong Kong is: " + sdf.format(cal.getTime()) + " AM");
else
System.out.println("The time in Hong Kong is: " + sdf.format(cal.getTime()) + " PM");

}

}