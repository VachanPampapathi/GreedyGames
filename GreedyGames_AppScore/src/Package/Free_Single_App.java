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

public class Free_Single_App {

	public void single(String URL) throws IOException, ParseException{
		try {
			Document doc = Jsoup.connect(URL).userAgent("jsoup Scrapper").get();
			Elements temp = doc.select("div.T4LgNb");
			
			for (Element Applist:temp) {
				
				String appname = Applist.getElementsByClass("AHFaub").first().text();
				System.out.println("Name of the app is "+ appname);
				
				String reviews = Applist.getElementsByClass("EymY4b").first().text();
				
				
				
				String updatedate = Applist.getElementsByClass("htlgb").first().text();
				
				
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
				LocalDate date = LocalDate.parse(updatedate, formatter);				
				LocalDate now = LocalDate.now();
				long noOfDaysBetween = ChronoUnit.DAYS.between(date, now);	
				
				int noofreviews = Integer.parseInt(reviews.replaceAll("[^0-9]", ""));
				
				float score = noofreviews/noOfDaysBetween;
				System.out.printf("Score of the app is  %.2f \n", score);
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
