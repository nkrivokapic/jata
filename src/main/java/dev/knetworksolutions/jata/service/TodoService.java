package dev.knetworksolutions.jata.service;

import dev.knetworksolutions.jata.entity.TodoItem;
import dev.knetworksolutions.jata.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

	private final TodoRepository repository;

	@Autowired
	public TodoService(TodoRepository repository) {
		this.repository = repository;
	}

	public List<TodoItem> getAllItems() {
		return this.repository.getAllTodoItems();
	}

	public TodoItem getItemById(long id) {
		return this.repository.getTodoItemById(id);
	}

}
