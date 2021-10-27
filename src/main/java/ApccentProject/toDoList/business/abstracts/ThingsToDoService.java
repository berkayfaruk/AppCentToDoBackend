package ApccentProject.toDoList.business.abstracts;

import java.util.List;
import ApccentProject.toDoList.core.utilities.result.DataResult;
import ApccentProject.toDoList.core.utilities.result.Result;
import ApccentProject.toDoList.entities.concretes.ThingsToDo;

public interface ThingsToDoService {
	
	DataResult<List<ThingsToDo>> getAll();
	
	Result add(ThingsToDo toDo);
	
	Result update(ThingsToDo toDo);
	
	Result delete(int id);

}
