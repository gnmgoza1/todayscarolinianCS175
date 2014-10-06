package com.example.todays.adapter;

import java.util.ArrayList;

import com.example.todays.R;

public class News {
	String title;
	String description;
	String date;
	String type;
	int image;
	
	public static ArrayList<News> populateItems() {
		ArrayList<News> items = new ArrayList<News>();
		
		for (int x=0; x<10; x++){
			News itemNews = new News();
			
			switch(x) {
			case 0: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.type = "NEWS";
				itemNews.title = "Homer Simpsons";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "an image macro series featuring a photo of a blonde teenage boy wearing a plaid sweater vest and braces, accompanied by captions that describe a variety of embarrassing and tragic occurrences.";
			}
				break;
				
			case 1: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.type = "NEWS";
				itemNews.title = "Forever Alone";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "an exploitable rage comic character that is used to express loneliness and disappointment with life.";
			}
				break;
			
			case 2: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.type = "NEWS";
				itemNews.title = "Futurama Fry";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "an image macro series that uses a still of Fry squinting his eyes from the TV show Futurama, and is typically paired with overlaid text using a phrasal template.";
			}
				break;
				
			case 3: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.type = "SPORTS";
				itemNews.title = "Me Gusta";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "a rage comic face that is typically used to express one’s approval of an awkward or perverse situation.";
			}
				break;
			
			case 4: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.type = "OPINIONS";
				itemNews.title = "Neil deGrasse Tyson";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "an American astrophysicist and advocate of science and free thought.";
			}
				break;
				
			case 5: {

				itemNews.date = "18 JUL,2014";
				itemNews.type = "NEWS";
				itemNews.title = "Skeptical Baby";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "an advice animal image macro series featuring a baby with a cocked eyebrow.";
			}
				break;
				
			case 6: {

				itemNews.date = "18 JUL,2014";
				itemNews.type = "NEWS";
				itemNews.title = "Troll Face";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "a rage comic character wearing a mischievous smile that is meant to represent the facial expression of an Internet troll.";
			}
				break;
				
			case 7: {

				itemNews.date = "18 JUL,2014";
				itemNews.type = "NEWS";
				itemNews.title = "Yao Ming Face";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "a rage comic-style contour drawing of the professional basketball player Yao Ming wearing a hearty smile.";
			}
				break;
				
			case 8: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.type = "FEATURES";
				itemNews.title = "You Don't Say?";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "a rage comic face based on a contour drawing of Nicolas Cage that is that is used as a sarcastic response to an obvious observation or statement, in similar vein to “O RLY” image macros.";
			}
				break;
				
			case 9: {
				 
				itemNews.date = "18 JUL,2014";
				itemNews.type = "SPORTS";
				itemNews.title = "Y U NO? Guy";
				itemNews.image = R.drawable.ic_launcher_web;
				itemNews.description = "an image macro series using SMS shorthands and carefree grammar as a way to bring someone’s attention on a particular subject or issue.";
			}
				break;
				
			}
			
			items.add(itemNews);
		}
		
		return items;
	}
}
