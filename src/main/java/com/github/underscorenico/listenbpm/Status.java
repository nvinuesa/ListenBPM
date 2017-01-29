package com.github.underscorenico.listenbpm;

import com.github.underscorenico.listenbpm.connectors.bpm.AbstractBpmConnector;

import java.util.concurrent.Future;

public class Status <T> {

	private Enum states;

	private T previous;

	private Future<T> current;

	private AbstractBpmConnector bpmConnector;

	public Status(AbstractBpmConnector bpmConnector) {
		this.bpmConnector = bpmConnector;
	}

	public Status(AbstractBpmConnector bpmConnector, Enum states) {
		this.bpmConnector = bpmConnector;
		this.states = states;
	}

	public T getPrevious() {
		return this.previous;
	}

	public Future<T> getCurrent() {
		// TODO: call a method in the connector to retrieve the current status from the workflow
		return this.current;
	}
}
