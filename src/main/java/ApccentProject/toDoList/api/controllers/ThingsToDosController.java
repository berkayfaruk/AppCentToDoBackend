package ApccentProject.toDoList.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ApccentProject.toDoList.business.abstracts.ThingsToDoService;
import ApccentProject.toDoList.core.utilities.result.DataResult;
import ApccentProject.toDoList.core.utilities.result.Result;
import ApccentProject.toDoList.entities.concretes.ThingsToDo;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/api/toDo")
public class ThingsToDosController {
	
	private ThingsToDoService thingsToDoService;

	@Autowired
	public ThingsToDosController(ThingsToDoService thingsToDoService) {
		
		super();
		this.thingsToDoService = thingsToDoService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<ThingsToDo>> getAll(){
		
		return this.thingsToDoService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ThingsToDo thingsToDo) {
		
		return this.thingsToDoService.add(thingsToDo);
	}
	
	@PutMapping("/uptade")
	public Result update(@RequestBody ThingsToDo thingsToDo) {
		
		return this.thingsToDoService.update(thingsToDo);
	}
	
	@DeleteMapping(value = "/{id}")
	public Result delete(@PathVariable int id) {
		
		return this.thingsToDoService.delete(id);
	}

}
