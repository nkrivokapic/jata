package dev.knetworksolutions.jata.repository;

import dev.knetworksolutions.jata.entity.TodoItem;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TodoRepositoryInMemory implements TodoRepository {

	private final Map<Long, TodoItem> items = new HashMap<>();

	@Override
	public List<TodoItem> getAllTodoItems() {
		return this.items.values().stream().toList();
	}

	@Override
	public TodoItem getTodoItemById(long id) {
		return this.items.get(id);
	}
}
