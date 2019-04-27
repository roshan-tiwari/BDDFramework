# BDDFramework
Roshan's BDD Framework
#The main motto of the framework is have one small working BDD framework.
#To write the cucumber(gherkin code) I have made separate directory where it will have all the feature files.
#I have setup my junit runner file which tells the cucumber where my selenium-java code is present which is called as "Step definations"
#In junit file I have integrate "Cucumber Extent Reports" to have the report task.
#Usually code snippets is implemented for the cucumber feature file but what I have is to write the utilities in "Utilities" directory. It will be having all the commmon and re-useable code which will make easy to write my gherkin/business scenarios.
#I have setup property file where it will be having some configuration required in framwork.
#For continuos integration I have steup Jenkins in my local port 8080.
#To push/pull the code to GITHUB account I have intalled and configured GIT.

Why BDD framework?
=> BDD framework makes the stakesholder/buisness people understand the business scenarios or flows through gherkin. Gherkin is written in simple plain english having/using different keywords like "WHEN,GIVEN,THEN,AND,EXAMPLES,SCENARIO,SCENARIO OUTLINE". These keywords are pretty easy to understand what they are doing. People who do not understand the technical flow , gherkin code/cucumber will help them to understand what the automation framework is working.
It simply answer the "What it is doing" for business people  rather than "How it is been done".
