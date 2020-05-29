package demo.swt.mycalc.main;

import demo.swt.mycalc.ui.Application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application
				.instance
				.setTitle("Mixed Layout Demo")
				.build(new AppUiBuilder())
				.run();
	}

}
