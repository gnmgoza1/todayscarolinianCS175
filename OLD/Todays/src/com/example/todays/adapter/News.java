package com.example.todays.adapter;

import java.util.ArrayList;

import com.example.todays.R;

public class News {
	String title;
	String description;
	String date;
	String author;
	int image;

	public static ArrayList<News> populateItems() {
		ArrayList<News> items = new ArrayList<News>();
		
		for (int x=0; x<10; x++){
			News itemNews = new News();
			
			switch(x) {
			case 0: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.author = "Mark Paulo Valenzuya";
				itemNews.title = "Victory is upon Us: The Closing Program of USC Intramurals 2014";
				itemNews.image =R.drawable.win;
				itemNews.description = "an image macro series featuring a photo of a blonde teenage boy wearing a plaid sweater vest and braces, accompanied by captions that describe a variety of embarrassing and tragic occurrences.";
			}
			
	
				break;
				
			case 1: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.author = "Paulo Nick Poro";
				itemNews.title = "USC Hosts 4th BINISAYA Film Festival";
				itemNews.image = R.drawable.sports;
				itemNews.description = "an exploitable rage comic character that is used to express loneliness and disappointment with life.";
			}
				break;
			
			case 2: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.author = "Faith Paulo Valeno";
				itemNews.title = "The water supply problem in the USC Dormitories remains unsolved.";
				itemNews.image = R.drawable.uscdormwater;
				itemNews.description = "an image macro series that uses a still of Fry squinting his eyes from the TV show Futurama, and is typically paired with overlaid text using a phrasal template.";
			}
				break;
				
			case 3: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.author = "Gio Valendoza";
				itemNews.title = "Engineering students now prepped for mandatory CES";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "a rage comic face that is typically used to express one�s approval of an awkward or perverse situation.";
			}
				break;
			
			case 4: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.author = "John Doe";
				itemNews.title = "USC-SSC Elections 2014: Interview with Candidates";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "an American astrophysicist and advocate of science and free thought.";
			}
				break;
				
			case 5: {

				itemNews.date = "18 JUL,2014";
				itemNews.author = "Glyde Mendoza";
				itemNews.title = "The water supply problem in the USC Dormitories remains unsolved.";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "an advice animal image macro series featuring a baby with a cocked eyebrow.";
			}
				break;
				
			case 6: {

				itemNews.date = "18 JUL,2014";
				itemNews.author = "Nicole Poro";
				itemNews.title = "Department of Political Science Holds Role of Political Science in ASEAN Integration Forum";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "a rage comic character wearing a mischievous smile that is meant to represent the facial expression of an Internet troll.";
			}
				break;
				
			case 7: {

				itemNews.date = "18 JUL,2014";
				itemNews.author = "Pazel Harmes";
				itemNews.title = "Victory is upon Us: The Closing Program of USC Intramurals 2014";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "a rage comic-style contour drawing of the professional basketball player Yao Ming wearing a hearty smile.";
			}
				break;
				
			case 8: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.author = "Deja Boo";
				itemNews.title = "USC initiates Mission Operations in CPDRC";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "a rage comic face based on a contour drawing of Nicolas Cage that is that is used as a sarcastic response to an obvious observation or statement, in similar vein to �O RLY� image macros.";
			}
				break;
				
			case 9: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.author = "Dong Juana";
				itemNews.title = "Victory is upon Us: The Closing Program of USC Intramurals 2014";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "an image macro series using SMS shorthands and carefree grammar as a way to bring someone�s attention on a particular subject or issue.";
			}
				break;
				
			}
			
			items.add(itemNews);
		}
		
		return items;
	}
}
