Feature:Customer

@smoke
Scenario Outline: Add New Customer
Given User Lanch Chrome Browser
When User open url "https://admin-demo.nopcommerce.com/login"
And user enter Email as "admin@yourstore.com" and password as "admin"
And User click on Login button
Then User can view Dashboard 
When user click on customers menu
And user click on customers menu item
And user click on new add button
Then user can view add new customer page
When user enter customer info as "<newEmail>" and "<newPass>" and "<fname>
And user click on save button
Then user ca n view confirmation msg "The new customer has been added succssfully".
And close browser

Examples:
|email|password|newEmail|newPass|fname|lname|gender|conName|adminComment|
|admin@yourstore.com|admin|braj11@gmail.com|1234|Bali17|Raj|Male|ABC|Test1|
|admin@yourstore.com|admin|radha131@gmail.com|4537|Radha|Patel|Female|XYZ|Test2| 
|admin@yourstore.com|admin|Madhu13@gmail.com|4589|Madhu|Patil|Female|PQR|Test3| 