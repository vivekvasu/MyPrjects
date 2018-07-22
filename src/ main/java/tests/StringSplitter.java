package tests;

import java.util.ArrayList;
import java.util.List;

import Utils.LogManager;

/**
 * Class for splitting strings into lists of substrings. Constructor
 * can have one or more parameters specifying all separator characters
 * as an enum. 
 *
 * Example #1: 
 *    new StringSplitter(Separator.PERIOD).split(“foo.bar#baz”);
 *    returns: {“foo”, “bar#baz”} 
 *
 * Example #2: 
 *    new StringSplitter(Separator.PERIOD, Separator.HASH).split(“foo.bar#baz”);
 *    returns: {“foo”, “bar”, “baz”} 
 *
 * IMPLEMENT FOLLOWING:
 *
 * (1) StringSplitter class and Separator enum supporting at two or 
 *     more different separators. 
 *
 * (2) Some tests for the StringSplitter. TestNG/JUnit approach is preferred 
 *
 */
public class StringSplitter {

	private String[] separator = new String[Separator.values().length];

	// TODO: Constructor
	public StringSplitter (Separator separatorOne, Separator separatorTwo)
	{
		LogManager.info("Entered the constructor#StringSplitter with the parameters " + separatorOne + "and" + separatorTwo);
		this.separator[0] = separatorOne.toString();
		this.separator[1] = separatorTwo.toString();
		LogManager.info("Exiting the constructor#StringSplitter");
	}

	// TODO: Constructor
	public StringSplitter (Separator separatorOne)
	{
		LogManager.info("Entered the constructor#StringSplitter with the parameter '" + separatorOne +'"');
		this.separator[0] = separatorOne.toString();
		LogManager.info("Exiting the constructor#StringSplitter");
	}

	/**
	 * Splits the given string based on the separator(s) given at
	 * in the constructor.
	 * @param string String to be split
	 * @return Resulting list of substrings.
	 */
	public List<String> split(String string) 
	{
		LogManager.info("Entered the method#split with the parameter '" + string +'"');
		String regex = "";
		String [] substring = null;
		List<String> substringList = null;
		List<String> list = new ArrayList<String>();
		substringList = new ArrayList<String>();
		list = new ArrayList<String>();
		for(String s : separator) 
		{
			if(s != null &&  String.valueOf(s).length() > 0)
			{
				list.add(s.toString());
			}
		}
		separator = list.toArray(new String[list.size()]);
		for (int i = 0; i < separator.length; i++)
		{
			regex = regex + separator[i];
		}
		substring = string.split("[" + regex +"]");
		for (int j = 0; j < substring.length; j++)
		{
			substringList.add(substring[j]);
		}
		LogManager.info("Exiting the method#split with the value '" + substringList +'"');
		return substringList;
	}
}