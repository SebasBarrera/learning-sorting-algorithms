package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bubbleCTest {
	private String folderTestName = "testcases"; 
	
	@Test
	public void bubbleC_10() {
		int numberCase = 10;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleC-"+numberCase+".ref", 
					folderTestName+"/bubbleC-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleC failed");
	}

	@Test
	public void bubbleC_1() {
		int numberCase = 1;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleC-"+numberCase+".ref", 
					folderTestName+"/bubbleC-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleC failed");
	}

	@Test
	public void bubbleC_2() {
		int numberCase = 2;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleC-"+numberCase+".ref", 
					folderTestName+"/bubbleC-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleC failed");
	}

	@Test
	public void bubbleC_3() {
		int numberCase = 3;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleC-"+numberCase+".ref", 
					folderTestName+"/bubbleC-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleC failed");
	}

	@Test
	public void bubbleC_4() {
		int numberCase = 4;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleC-"+numberCase+".ref", 
					folderTestName+"/bubbleC-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleC failed");
	}

	@Test
	public void bubbleC_5() {
		int numberCase = 5;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleC-"+numberCase+".ref", 
					folderTestName+"/bubbleC-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleC failed");
	}

	@Test
	public void bubbleC_6() {
		int numberCase = 6;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleC-"+numberCase+".ref", 
					folderTestName+"/bubbleC-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleC failed");
	}

	@Test
	public void bubbleC_7() {
		int numberCase = 7;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleC-"+numberCase+".ref", 
					folderTestName+"/bubbleC-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleC failed");
	}

	@Test
	public void bubbleC_8() {
		int numberCase = 8;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleC-"+numberCase+".ref", 
					folderTestName+"/bubbleC-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleC failed");
	}

	@Test
	public void bubbleC_9() {
		int numberCase = 9;
		assertTrue(
			FileUtil.areEqualsTextFiles(
					folderTestName+"/bubbleC-"+numberCase+".ref", 
					folderTestName+"/bubbleC-"+numberCase+".out"), 
			"Case "+numberCase+" from bubbleC failed");
	}

}
