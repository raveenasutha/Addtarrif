
Feature: AddCustomer Functionality Validation
@smoke, @dev
  Scenario: Title of your scenario
    Given User launch the browser
    When User click add customer
    Then User validate the custID
    
@regression, @smoke
  Scenario: Title of your scenario
    Given User launch the browser
    When User click add customer list
      | gokul | suthagar | pri@gmail.com | amirthith | 987654345676543 |
    Then User validate the custID
    
@sanity, @smoke
  Scenario: Title of your scenario
    Given User launch the browser
    When User click add customer two-dim-list
      | kolanthaivel   | santhosh | kayal@gmail.com   | pallavaram | 3265987412 |
      | Keerthi | thagvam | keerthi@gmail.com | Andhra     | 9996325874 |
      | Vipin   | hgfdg       | dams@gmail.com    | arunachalapradesh | 2963555555 |
    Then User validate the custID
@smoke
  Scenario: Title of your scenario
    Given User launch the browser
    When User click add customer map
      | fname   | Geethu           |
      | lname   | Harish           |
      | email   | geethu@gmail.com |
      | address | Chithoor         |
      | phno    |       9638885547 |
    Then User validate the custID
@sanity
  Scenario: Title of your scenario
    Given User launch the browser
    When User click add customer two-dim-map
      | fname    | lname  | email           | address | phno       |
      | raveena    | sutha | sutha@gmail.com | chennai   |  23456326666666 |
      | tupakula | geethu | tupa@gmail.com  | Salem   | 98763332666999 |
      | Rithu    | gokul   | ravee@gmail.com | trichy |   69999999 |
    Then User validate the custID
@raveena, @sanity
  Scenario Outline: Title of your scenario outline
    Given User launch the browser
    When User click add customer and enter valid details"<fname>","<lname>","<email>","<address>","<phno>"
    Then User validate the custID

    Examples: 
      | fname  | lname   | email            | address | phno       |
      | Chicku | Vargese | chicku@gmail.com | Trissur | 9632587401 |
      | Rohith | edat    | rohi@gmail.com   | Trissur | 9986532145 |