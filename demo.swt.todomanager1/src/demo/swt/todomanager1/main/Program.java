package demo.swt.todomanager1.main;

import org.eclipse.swt.widgets.Shell;

import demo.swt.todomanager1.model.DummyProjectSource;
import demo.swt.todomanager1.model.ProjectManager;
import demo.swt.todomanager1.ui.Application;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application
				.instance
				.addService("project-manager", new ProjectManager())
				.addService("dummy-project-source",new DummyProjectSource())
				
				
				.setTitle("Task Manager -- (New Project)")
				.build(new TaskManagerMainScreen())
				
				//.packShell()
				
				.center()				
				.run();
		
	}

}
