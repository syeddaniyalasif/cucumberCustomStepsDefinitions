$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/executeShellCommands.feature");
formatter.feature({
  "name": "CustomSteps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test Custom Steps",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the directory \"C://temp\" should contain 10 files",
  "keyword": "Then "
});
formatter.match({
  "location": "executeShellCommands.the_directory_something_should_contain_10_files(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "each file should be no larger than 200mb",
  "keyword": "And "
});
formatter.match({
  "location": "executeShellCommands.each_file_should_be_no_larger_than_200mb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "execute shell command \"rm -rf /dcfdp_workarea/*\"",
  "keyword": "Then "
});
formatter.match({
  "location": "executeShellCommands.execute_shell_command_something(String)"
});
formatter.result({
  "status": "passed"
});
});