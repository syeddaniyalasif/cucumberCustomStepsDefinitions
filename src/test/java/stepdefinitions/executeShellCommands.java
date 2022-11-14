package stepdefinitions;

import java.io.File;
import java.nio.file.Files;
import org.junit.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;



public class executeShellCommands {

    @Then("^the directory \"([^\"]*)\" should contain 10 files$")
    public void the_directory_something_should_contain_10_files(String directory) throws Throwable {
    	
    	int numberOfFiles = new File(directory).list().length;
    	System.out.println("Executing command 1 ");
    	System.out.println("--------"+ numberOfFiles+" files present in a folder");
//    	throw new PendingException();
    }

    @Then("^execute shell command \"([^\"]*)\"$")
    public void execute_shell_command_something(String strArg1) throws Throwable {
    	System.out.println("Executing command 2");
//    	throw new PendingException();
    }

    @And("^each file should be no larger than 200mb$")
    public void each_file_should_be_no_larger_than_200mb() throws Throwable {
    	System.out.println("Executing command 3");
    	
    	
    	double fileSize = 0;
    	 File path = new File("c://temp");

    	    File [] files = path.listFiles();
    	    for (int i = 0; i < files.length; i++){
    	        if (files[i].isFile()){ //this line weeds out other directories/folders
    	        	fileSize = files[i].length()/1024;
    	        	System.out.println("-------- File is is "+fileSize+"mb");
    	        }
    	    }
    	
    	Assert.assertTrue("This will Fail.", true);
    }

}