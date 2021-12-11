package dev.knetworksolutions.jata.repository;

import dev.knetworksolutions.jata.entity.TodoItem;

import java.util.List;

public interface TodoRepository {

	List<TodoItem> getAllTodoItems();
	TodoItem getTodoItemById(long id);

}
