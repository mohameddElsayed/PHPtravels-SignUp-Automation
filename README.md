# PHPtravels-SignUp-Automation

Selenium framework project using Java  , Maven  , TestNg  and  POM

Implemented test automation framework with an object oriented design

(One class) 
BageBase class is class > this is the base class for all pages where common elements are identified and the ChromeDriver and 
webdriverWait are identified 
using  clear/submit/sendkeys/click

(Two classes)
RegisterationPage and Confirmationpage classes are contains the  methods to find elements and working with it

(One test run class)
RegisterationTestCase > is the test runner for PHPTravel_SignUp class which contains the test methods :-

1- Before test to open URL using chrome driver
2- Test 
3-After test for quit browser
4-AfterMethod this method to take screenshots  for failures and save it 
5-Dataprovider to read from excel file


I used three type to read data :-

1-Add datar manually in code
2-ExcelRader class and have taken object from it in test runner class 
3-Excelizer 
 Read from excel sheet  directly using path and sheet name only , create excelizer  method in test runner  without (create class)  
                        using Excelizer dependency in pom file
      _______________________________________________________________________________________________________
      
      Note : SimpleDemo_without_oop  package . it's seperated  package before using  OOP
      Http Interceptor Package  :- It's angular , Demo for interceptor but doesn't work
      Data package : contains on excel files and excelreader class 
      
                        
                        
                 
                        
