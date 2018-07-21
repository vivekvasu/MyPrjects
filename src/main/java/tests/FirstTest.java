package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.BaseTests;

public class FirstTest extends BaseTests
{
	@Test(description = "Test to verify the split method using a single constructors.", groups = {"Regression"})
	public void verifySplitterClassUsingOneParam()
	{
		StringSplitter splitter = null;
		String text = "";
		text = "foo.bar#baz";
		splitter = new StringSplitter(Separator.PERIOD);
		splitter.split(text);
		Assert.assertTrue(splitter.split(text).size() > 0, "List size is zero.");
	}

	@Test(description = "Test to verify the split method using two constructors." , groups = {"Sanity"})
	public void verifySplitterClassUsingTwoParam()
	{
		StringSplitter splitter = null;
		String text = "";
		text = "foo.bar#baz";
		splitter = new StringSplitter(Separator.HASH, Separator.PERIOD);
		Assert.assertTrue(splitter.split(text).size() > 0, "List size is zero.");
	}
}
