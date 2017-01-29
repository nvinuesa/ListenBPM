package com.github.underscorenico.listenbpm;

import com.github.underscorenico.listenbpm.connectors.bpm.ActivitiConnector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StatusTest {

	@Test
	public void EmptyStatusTest() {
		Status<String> status = new Status<>(new ActivitiConnector());
	}
}
