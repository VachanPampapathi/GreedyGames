package Package;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//use this class to run on any single paid app

public class AppDetailsPaid {
	public static void main(String [] args)throws IOException, ParseException{
		String url = "https://play.google.com/store/apps/details?id=inc.trilokia.pubgfxtool";
		try {
			Document doc = Jsoup.connect(url).userAgent("jsoup Scrapper").get();
			Elements temp = doc.select("div.T4LgNb");
			
			for (Element Applist:temp) {
				String appname = Applist.getElementsByClass("AHFaub").first().text();
				System.out.println("Name of the app is "+ appname);
				
				String reviews = Applist.getElementsByClass("EymY4b").first().text();
				System.out.println("No of reviews = "+ appname);
				
				String updatedate = Applist.getElementsByClass("htlgb").remove(2).text();
				System.out.println("Last updated date is on "+ appname);
				
				
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
      			LocalDate date = LocalDate.parse(updatedate, formatter);				
				LocalDate now = LocalDate.now();
				long noOfDaysBetween = ChronoUnit.DAYS.between(date, now);	
				
				int noofreviews = Integer.parseInt(reviews.replaceAll("[^0-9]", ""));
				
				float score = noofreviews/noOfDaysBetween;
				System.out.printf("Score of the app is %.2f \n", score);
			}
			
					
		} catch (IOException e) {
			// TODO Auto-generated catch      block
			e.printStackTrace();
		}
}

	private static Elements getElementsByClass(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
