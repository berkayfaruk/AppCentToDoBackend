package ApccentProject.toDoList.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ApccentProject.toDoList.entities.concretes.ThingsToDo;

public interface ThingsToDoDao extends JpaRepository<ThingsToDo,Integer> {

	
}
