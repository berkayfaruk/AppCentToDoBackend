package ApccentProject.toDoList.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ApccentProject.toDoList.business.abstracts.ThingsToDoService;
import ApccentProject.toDoList.core.utilities.result.DataResult;
import ApccentProject.toDoList.core.utilities.result.Result;
import ApccentProject.toDoList.core.utilities.result.SuccessDataResult;
import ApccentProject.toDoList.dataAccess.abstracts.ThingsToDoDao;
import ApccentProject.toDoList.entities.concretes.ThingsToDo;


@Service
public class ThingsToDoManager implements ThingsToDoService {

	private ThingsToDoDao thingsToDoDao;
	
	@Autowired
	public ThingsToDoManager(ThingsToDoDao thingsToDoDao) {
		super();
		this.thingsToDoDao = thingsToDoDao;
	}

	@Override
	public DataResult<List<ThingsToDo>> getAll() {
		
		return new SuccessDataResult<List<ThingsToDo>>(this.thingsToDoDao.findAll(),"Data Listelendi.");
	}

	@Override
	public Result add(ThingsToDo toDo) {
		this.thingsToDoDao.save(toDo);
		return new SuccessDataResult("İş eklendi");
	}

	@Override
	public Result update(ThingsToDo toDo) {
		this.thingsToDoDao.save(toDo);
		return new SuccessDataResult("İş güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.thingsToDoDao.deleteById(id);
		return new SuccessDataResult("İş silindi");
	}

}
