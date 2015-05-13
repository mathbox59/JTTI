package dao;

import java.util.List;

import domain.Attend;
import domain.AttendType;

public interface AttendTypeDao {

		AttendType get(Integer id);

		Integer save(AttendType attendType);

		void update(Attend attend);

		void delete(AttendType attendType);

		void delete(Integer id);

		List<AttendType> findAll();

}
