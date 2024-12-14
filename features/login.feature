Feature: User Login

  #Scenario: Successful Login
    Given the user is on the nopcommerce loginpage
    When the user enter valid credentials(username:"shilpa@gmail.com",password:"shilpa@123")
    And the user clicks on login button
    Then the user shoud be redirected to myaccountpage
    And user should see welcome msg

  Scenario: successful login
    Given the user is on the orangeHRM login page
    When the user enter login info (username:"Admin" , password:"admin123")
    And clicks on login button
    