package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngtest {

	@Test(priority = -2, enabled = false)
	private void tc0() {
		System.out.println("For Testing case 01");
	}

	@BeforeSuite
	private void tc111() {
		System.out.println("@BeforeSuite For Testing case 02");

	}

	@Test(priority = -1)
	private void tc1() {
		System.out.println("For Testing case 03");

	}

	@Test(priority = -1)
	private void tc2() {
		System.out.println("For Testing case 04");

	}

	@BeforeTest
	public void tc3() {
		System.out.println("@BeforeTest For Testing case 05");
	}

	@BeforeClass
	private void tc4() {
		System.out.println("@BeforeClass For Testing case 06");
	}

	@BeforeGroups
	private void tc5() {
		System.out.println("@BeforeGroups For Testing case 07");
	}

	@BeforeMethod
	private void tc6() {
		System.out.println("@BeforeMethod For Testing case 08");
	}

	@Test
	private void tc7() {
		System.out.println("For Testing case 09");
	}

	@AfterClass
	private void tc8() {
		System.out.println("@AfterClass For Testing case 10");
	}

	@AfterGroups
	private void tc9() {
		System.out.println("@AfterGroups For Testing case 11");
	}

	@AfterMethod
	public void tc10() {
		System.out.println("@AfterMethod For Testing case 12");
	}

	@AfterSuite
	private void tc11() {
		System.out.println("@AfterSuite For Testing case 13");
	}

	@AfterTest
	private void tc12() {
		System.out.println("@AfterTest For Testing case 14");
	}

	@Test(priority = -10)
	private void tc13() {
		System.out.println("For Testing case 15");
	}

	@Test
	private void tc14() {
		System.out.println("For Testing case 16");
	}

//	@Test
//	private void tc15() {
//		System.out.println("For Testing case 17");
//	}
//
//	@Test
//	private void tc16() {
//		System.out.println("For Testing case 18");
//	}
//	@Test
//	private void tc17() {
//		System.out.println("For Testing case 19");
//	}
//
//	@Test
//	private void tc18() {
//		System.out.println("For Testing case 20");
//	}

}
