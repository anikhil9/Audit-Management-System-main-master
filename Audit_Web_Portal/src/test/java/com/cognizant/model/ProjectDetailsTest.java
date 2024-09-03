package com.cognizant.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectDetailsTest {

	ProjectDetails projectDetails = new ProjectDetails();
	/**
	 * test the allArgsConstructor of ProjectDetails model class
	 */
	@Test
	public void testProjectDetailsAllConstructor()
	{
		ProjectDetails project=new ProjectDetails("myProject", "Amartya","Supreet");
		assertEquals( "myProject" , project.getProjectName());
	}
	/**
	 * test the Getter and Setter of ProjectName in ProjectDetails model class
	 */
	@Test
	public void testProjectName()
	{
		projectDetails.setProjectName("myProject");;
		assertEquals( "myProject",  projectDetails.getProjectName());
	}
	/**
	 * test the Getter and Setter of projectManagerName in ProjectDetails model class
	 */
	@Test
	public void testProjectManagerName()
	{
		projectDetails.setProjectManagerName("Amartya");;
		assertEquals( "Amartya" , projectDetails.getProjectManagerName());
	}
	/**
	 * test the Getter and Setter of applicationOwnerName in ProjectDetails model class
	 */
	@Test
	public void testApplicationOwnerName()
	{
		projectDetails.setApplicationOwnerName("Supreet");
		assertEquals("Supreet", projectDetails.getApplicationOwnerName());
	}
	
	
	
}
