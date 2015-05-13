package dao;

import java.util.List;

import domain.Application;
import domain.Employee;

public interface ApplicationDao {

		//Load application instance by id
		Application get(Integer id);

		//save application
		Integer save(Application application);

		//update application
		void update(Application application);

		//delete application
		void delete(Application application);

		//delete application by id
		void delete(Integer id);

		//return all application
		List<Application> findAll();

		//find application by employee
		List<Application> findByEmp(Employee emp);

}
