package ooP_Encaspulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("Launching Browser!!!!!");
		checkBrowserVersion();
		interactOSServices();
		checkRamSpace();
	}
	private void checkBrowserVersion() {
		System.out.println("checking Browser OS Version");
	}
	private void interactOSServices() {
		System.out.println("interacting with Operating System Services");
	}
	private void checkRamSpace() {
		System.out.println("checking Ram Space");
	}

}
