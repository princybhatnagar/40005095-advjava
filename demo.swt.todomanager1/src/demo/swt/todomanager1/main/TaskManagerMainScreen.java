package demo.swt.todomanager1.main;







import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

import demo.swt.todomanager1.model.DummyProjectSource;
import demo.swt.todomanager1.model.ProjectManager;
import demo.swt.todomanager1.ui.Application;
import demo.swt.todomanager1.ui.ControlBuilder;
import demo.swt.todomanager1.ui.Grid;
import demo.swt.todomanager1.ui.MessageDialog;
import demo.swt.todomanager1.ui.UIBuilder;



public class TaskManagerMainScreen implements UIBuilder {

	ControlBuilder builder;
	
	String imageBasePath="/images/";

	ProjectManager projectManager;
	
	public TaskManagerMainScreen() {
		// TODO Auto-generated constructor stub
		projectManager=Application.instance.getService("project-manager", ProjectManager.class);
		

		//NOT for final version. Just Testing
		//Remove this code from the production
		addDummyData();
		
	}


	private void addDummyData() {
		DummyProjectSource source=Application.instance.getService("dummy-project-source", DummyProjectSource.class);
		source.addTasks(projectManager);
	}
	

	@Override
	public void build(Composite parent) {
		
		builder=new ControlBuilder(parent);
		
		parent.setSize(900,600);
		GridLayout layout=new GridLayout();
		layout.numColumns=1;
		parent.setLayout(layout);
		
		
		buildMenu(parent);		
		ToolBar toolBar = buildToolbar((Shell) parent);
		toolBar.setLayoutData(Grid.data().horizontalStretch().get());
		
		
		SashForm splitter=new SashForm(parent, SWT.VERTICAL);
		splitter.setLayoutData(Grid.data().stretch().grab().get());
		
		Composite tableContainer=new Composite(splitter,SWT.BORDER);
		tableContainer.setLayout(new FillLayout());
		tableContainer.setBackground(new Color(Display.getCurrent(), new RGB(200,100,0)));
		
		Composite taskEditPanel=new Composite(splitter, SWT.BORDER);
		taskEditPanel.setLayout(new FillLayout());
		Table table=new Table(taskEditPanel, SWT.BORDER|SWT.FULL_SELECTION);
		table.setHeaderVisible(true); //show table header row
		table.setLinesVisible(true);  //show intermediate lines
		
		String [] labels= {"Basic","Subtasks","Notes"};
		int [] size= {50,100,100};
		
		
		
		for(int i=0;i<labels.length;i++) {
			TableColumn column= new TableColumn(table,0);
			column.setText(labels[i]); //set column heading
			column.setWidth(size[i]);
		}
		
		
		Composite add=new Composite(splitter, SWT.BORDER|SWT.RIGHT);
		add.setLayout(new GridLayout());
		Button bt=new Button(add,0);
		bt.setText("ADD");
		bt.setLayoutData(new GridData(SWT.HORIZONTAL,SWT.RIGHT,false,false));
		
		
		
		//text.setLayoutData(new FillData(SWT.FILL,SWT.BOTTOM,false,false,4,1));
//		Label label=new Label(taskEditPane1,SWT.CENTER);
//		label.setText("basic");
		
		
		
		
		
		new TaskListScreen(projectManager.getTasks())
			.build(tableContainer);
		
		
		
		
		
	}


	private ToolBar buildToolbar(Shell shell) {
		
		
		
		
		
		
		// TODO Auto-generated method stub
		ToolBar toolBar=new ToolBar(shell, SWT.BORDER|SWT.HORIZONTAL|SWT.WRAP);
		GridLayout grid=new GridLayout();
		grid.numColumns=5;
		grid.makeColumnsEqualWidth=true;
		grid.horizontalSpacing=5;
		//toolBar.setLayout(grid);
		toolBar.setSize(300,40);
		
		
		ToolItem newTask=new ToolItem(toolBar, SWT.PUSH);
		newTask.setImage(image("add-icon.jpg"));

		
		ToolItem removeTask=new ToolItem(toolBar, SWT.PUSH);
		removeTask.setImage(image("eraser.jpg"));
		
		
		toolBar.pack();
		
		return toolBar;
		
	}


	private Image image(String name) {
		
		Display display=Display.getCurrent();
		Image image=new Image(display, Program.class.getResourceAsStream(imageBasePath+name));
		
		return image;
	}


	private void buildMenu(Composite parent) {
		// TODO Auto-generated method stub
		Shell shell=(Shell) parent;
		
		//STEP 1. menuBar can be connected only to a Shell
		//  It creates the large bar
		Menu menuBar=new Menu(shell,SWT.BAR);
		
		
		//STEP 2. create MenuItem to display on the MenuBar. 
		//This item MUST be MenuItem with CASCADE Design
		buildFileMenu(shell, menuBar);
		buildHelpMenu(shell, menuBar);
		
		
		//Final Step — Associate the menuBar as the menuBar of the shell
		shell.setMenuBar(menuBar);
		

		
		
		
	}


	private void buildHelpMenu(Shell shell, Menu menuBar) {
		// TODO Auto-generated method stub
		MenuItem barItem=new MenuItem(menuBar,SWT.CASCADE);
		barItem.setText("&Help");
		
		Menu helpMenu=new Menu(shell,SWT.DROP_DOWN);
		MenuItem helpManual= new MenuItem(helpMenu,SWT.PUSH);
		helpManual.setText("&Manual");
		
		MenuItem helpAbout=new MenuItem(helpMenu, SWT.PUSH);
		helpAbout.setText("&About");
		helpAbout.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				MessageDialog.info("About Todo Manager", "Todo Manager App\nVersion 1\n©conceptarchitect.in");
			}
		});
		
		
		barItem.setMenu(helpMenu);
		
		
		
		
	}


	private void buildFileMenu(Shell shell, Menu menuBar) {
		MenuItem menuBarFile= new MenuItem(menuBar, SWT.CASCADE);
		menuBarFile.setText("&File");
		
		//STEP 3. Menu need to have dropdown list of Menus		
		Menu menuFile=new Menu(shell, SWT.DROP_DOWN);
		MenuItem menuFileNew=new MenuItem(menuFile,SWT.CASCADE);
		menuFileNew.setText("&New");
		
		//-- New has sub Menu --
		Menu menuFileNewSubMenu=new Menu(shell,SWT.DROP_DOWN);
		MenuItem menuFileNewProject= new MenuItem(menuFileNewSubMenu, SWT.PUSH);
		menuFileNewProject.setText("&Project");
		MenuItem menuFileNewTask= new MenuItem(menuFileNewSubMenu, SWT.PUSH);
		menuFileNewTask.setText("&Task");
		
		menuFileNew.setMenu(menuFileNewSubMenu);
		
		
		
		MenuItem menuFileOpen=new MenuItem(menuFile,SWT.PUSH);
		menuFileOpen.setText("&Open");
		new MenuItem(menuFile, SWT.SEPARATOR); //no need to refer this component
		MenuItem menuFileSave=new MenuItem(menuFile,SWT.PUSH);
		menuFileSave.setText("&Save");
		
		
		MenuItem menuFileSaveAs=new MenuItem(menuFile,SWT.PUSH);
		menuFileSaveAs.setText("Save &As");
		
		MenuItem menuFileAutoSave=new MenuItem(menuFile,SWT.CHECK);
		menuFileAutoSave.setText("Auto Sa&ve");
		menuFileAutoSave.setSelection(true);
		menuFileAutoSave.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				System.out.println("Auto Save:"+menuFileAutoSave.getSelection());
			}
		});
		
		
		new MenuItem(menuFile, SWT.SEPARATOR); //no need to refer this component
		
		MenuItem menuFileExit=new MenuItem(menuFile,SWT.PUSH);
		menuFileExit.setText("E&xit");
		menuFileExit.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				Application.instance.getShell().dispose();
			}
		});
		
		//STEP 4. Associate this  Dropdown fileMenu with cascade file menu on the bar 
		menuBarFile.setMenu(menuFile);
	}

}
