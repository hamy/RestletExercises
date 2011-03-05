package demo00;

import org.junit.Test;

import common.AbstractTestCase;

public class TestHelloServer extends AbstractTestCase {

	@Test
	public void testStartAndStop() throws Exception {
		String mn = debugEntering("testStartAndStop");
		HelloServer hs = new HelloServer();
		hs.start();
		Thread.sleep(500);
		hs.stop();
		debugLeaving(mn);
	}
}
