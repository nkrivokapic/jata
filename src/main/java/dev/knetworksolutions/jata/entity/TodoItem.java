package dev.knetworksolutions.jata.entity;

public class TodoItem {

	private final long id;
	private final String label;
	private final boolean completed;

	public TodoItem(long id, String label, boolean completed) {
		this.id = id;
		this.label = label;
		this.completed = completed;
	}

	public long getId() {
		return id;
	}

	public String getLabel() {
		return label;
	}

	public boolean isCompleted() {
		return completed;
	}
}
