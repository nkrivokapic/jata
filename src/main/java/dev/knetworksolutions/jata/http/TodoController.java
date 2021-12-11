package dev.knetworksolutions.jata.http;

import dev.knetworksolutions.jata.entity.TodoItem;
import dev.knetworksolutions.jata.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

	private final TodoService service;

	@Autowired
	public TodoController(TodoService service) {
		this.service = service;
	}

	@GetMapping("/")
	public List<TodoItem> getAll() {
		return this.service.getAllItems();
	}

	@GetMapping("/{id}")
	public TodoItem getItemById(@PathVariable long id) {
		return this.service.getItemById(id);
	}

}
