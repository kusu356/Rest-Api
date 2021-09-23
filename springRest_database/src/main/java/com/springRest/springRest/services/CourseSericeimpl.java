package com.springRest.springRest.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springRest.springRest.dao.CourseDao;
import com.springRest.springRest.entities.Course;
@Service
public class CourseSericeimpl implements CourseService
{  @Autowired
	private CourseDao courseDao;
	public CourseSericeimpl()
	{
	}
	@Override
	public List<Course> getCourses()
	{
		return courseDao.findAll();
	}
	@Override
	public Course addCourse(Course course)
	{
		courseDao.save(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course)
	{
		courseDao.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long parseLong)
	{
		Course entity=courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
}
