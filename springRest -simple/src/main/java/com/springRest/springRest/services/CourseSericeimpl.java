package com.springRest.springRest.services;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.springRest.springRest.entities.Course;
@Service
public class CourseSericeimpl implements CourseService
{  
	List<Course> list;
	public CourseSericeimpl()
	{
		list=new ArrayList<>();
		list.add(new Course(100,"c++","intermediate"));
		list.add(new Course(4343,"java","basic"));
	}
	@Override
	public List<Course> getCourses()
	{
		return list;
	}
	@Override
	public Course addCourse(Course course)
	{
		list.add(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course)
	{
		list.forEach(e->
		{
		if(e.getId()==course.getId())
		{
			e.setTitle(course.getTitle());
			e.setDescription(course.getDescription());
		}
		});
		
		return course;
	}
	@Override
	public void deleteCourse(long parseLong)
	{
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		// TODO Auto-generated method stub
		
	}
}
