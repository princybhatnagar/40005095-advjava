//package demo.swt.mycalc.main;
//
//
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.events.SelectionAdapter;
//import org.eclipse.swt.events.SelectionEvent;
//import org.eclipse.swt.layout.FillLayout;
//import org.eclipse.swt.layout.GridData;
//import org.eclipse.swt.layout.GridLayout;
//import org.eclipse.swt.layout.RowLayout;
//import org.eclipse.swt.widgets.Button;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.swt.widgets.Text;
//
//import demo.swt.mycalc.ui.Application;
//import demo.swt.mycalc.ui.UIBuilder;
//
//
//
//
//public class AppUiBuilder2 implements UIBuilder {
////	boolean isFirst=true;
////	String second="0";
////	String first="0"; //first value
////	private String operator;
////	private String display;
////	public String getValue() {
////		
////		if(isFirst)
////			return first;
////		else
////			return second;
////	}
////	
////	public void setValue(String value) {
////		if(isFirst)
////			first=value;
////		else
////			second=value;
////	}
//	
//	@Override
//	public void build(Composite parent) {
//		// TODO Auto-generated method stub
//		GridLayout layout=new GridLayout();		
//		layout.numColumns=4;	
//		//layout.makeColumnsEqualWidth=true;
//		parent.setLayout(layout);
//		parent.setSize(220, 220);
//	
//		
//		
//		
//		
//		Text text=new Text(parent,SWT.RIGHT|SWT.BORDER);
//		text.setEditable(false);
//		text.setDoubleClickEnabled(false);
//		text.setTextLimit(30);
//		text.setLayoutData(new GridData(SWT.FILL,SWT.TOP,true,false,4,1));
//		//text.setText(display);
//		
//		Button b1=new Button(parent,SWT.PUSH);
//		b1.setText("MC");
//		b1.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////	    b1.addSelectionListener(new SelectionAdapter() {
////
////			@Override
////			public void widgetSelected(SelectionEvent e) {
////				// TODO Auto-generated method stub
////				
////				
////		        
////			}
////	    	
////	    	
////		});	
////	    
//	    
//	    
//	    
//	    
//		Button b2=new Button(parent,SWT.PUSH);
//		b2.setText("M+");
//		b2.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b2.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////			        
////				}
////		    	
////		    	
////			});	
//		
//		Button b3=new Button(parent,SWT.PUSH);
//		b3.setText("/");
//		b3.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b3.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					
////			        display="/";
////			        operator="/";
////			        
////				}
////		    	
////		    	
////			});	
//		
//		Button b4=new Button(parent,SWT.PUSH);
//		b4.setText("*");
//		b4.setLayoutData(new GridData(SWT.FILL,4,false,false));
////		 b4.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////			        
////				}
////		    	
////		    	
////			});	
//
//		Button b5=new Button(parent,SWT.PUSH);
//		b5.setText("7");
//		b5.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b5.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////				  setValue("7");
////			        isFirst=false;
////			        display="7";
////			        
////				}
////		    	
////		    	
////			});	
//		
//		Button b6=new Button(parent,SWT.PUSH);
//		b6.setText("8");
//		b6.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b6.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////					 setValue("8");
////				        isFirst=false;
////				        display="8";     
////				}
////			});	
//		
//		Button b7=new Button(parent,SWT.PUSH);
//		b7.setText("9");
//		b7.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b7.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////					 setValue("9");
////				        isFirst=false;
////				        display="9";
////				        
////			        
////				}
////		    	
////		    	
////			});	
//		
//		Button b8=new Button(parent,SWT.PUSH);
//		b8.setText("-");
//		b8.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b8.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////			        
////				}
////		    	
////		    	
////			});	
////		
//		Button b9=new Button(parent,SWT.PUSH);
//		b9.setText("4");
//		b9.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b9.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////			        
////				}
////		    	
////		    	
////			});	
////		
//		Button b10=new Button(parent,SWT.PUSH);
//		b10.setText("5");
//		b10.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b10.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////			        
////				}
////		    	
////		    	
////			});	
//		
//		Button b11=new Button(parent,SWT.PUSH);
//		b11.setText("6");
//		b11.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b11.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////			        
////				}
////		    	
////		    	
////			});	
//		
//		Button b12=new Button(parent,SWT.PUSH);
//		b12.setText("+");
//		b12.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b12.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////			        
////				}
////			});	
//		
//		Button b13=new Button(parent,SWT.PUSH);
//		b13.setText("1");
//		b13.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b13.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////			        
////				}
////		    	
////		    	
////			});	
//		
//		Button b14=new Button(parent,SWT.PUSH);
//		b14.setText("2");
//		b14.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b14.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////			        
////				}
////		    	
////		    	
////			});	
//		
//		Button b15=new Button(parent,SWT.PUSH);
//		b15.setText("3");
//		b15.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b15.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////			        
////				}
////		    	
////		    	
////			});	
//		
//		Button b16=new Button(parent,SWT.PUSH);
//		b16.setText("=");
//		b16.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false,1,2));
////		 b16.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////					double left=Double.parseDouble(first);
////					double right=Double.parseDouble(second);
////					double result=0;
////					switch(operator) {
////					case "+" : result=left+right; break;
////					case "-" : result=left-right; break;
////					case "*" : result=left*right; break;
////					case "/" : result=left/right; break; 
////					}
////					
////					first=""+result;
////					second="0";
////					isFirst=true; 
////					display=first; //display the first result		
////					operator="";
////				}
////		    	
////		    	
////			});	
//		
//		Button b17=new Button(parent,SWT.PUSH);
//		b17.setText("0");
//		b17.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false,2,1));
////		 b17.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////			        
////				}
////		    	
////		    	
////			});	
////		
//		Button b18=new Button(parent,SWT.PUSH);
//		b18.setText(".");
//		b18.setLayoutData(new GridData(SWT.FILL,SWT.FILL,false,false));
////		 b18.addSelectionListener(new SelectionAdapter() {
////
////				@Override
////				public void widgetSelected(SelectionEvent e) {
////					// TODO Auto-generated method stub
////			        
////				}
////		    	
////		    	
////			});	
////		
//		
//		//parent.pack(); //trim to the required size
//				
//		
//	
//	}
//
//}
