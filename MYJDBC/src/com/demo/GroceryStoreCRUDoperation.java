//Q.2)Perform all Crud operation on your project topic using Jdbc.
//topic - Grocery store management
/*Create Crude operation for grocery item details accepting the  input from user for confirming the operations
1.Enter the grocery item  details, 
2.Retrieve the grocery item details,
3.delete the grocery item details, 
4.edit the grocery item details.*/
package com.demo;

//Importing the Connection class for managing database connections.
import java.sql.Connection;
//Importing the DriverManager class for database connection setup.
import java.sql.DriverManager;
//Importing the PreparedStatement class for executing parameterized SQL queries.
import java.sql.PreparedStatement;
//Importing the ResultSet class for handling query results.
import java.sql.ResultSet;
//Importing SQLException for handling database-related errors.
import java.sql.SQLException;
//Importing the Statement class for executing SQL queries.
import java.sql.Statement;
//Importing the Scanner class for user input.
import java.util.Scanner;

//Creating a class with a name GroceryStoreCRUDoperation
public class GroceryStoreCRUDoperation 
{
    public static void main(String[] args) throws ClassNotFoundException,SQLException 
    {
        // Step 1: Loading the MySQL JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver"); 

        // Step 2: Establishing a database connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store_manage", "root", "root");

        // Step 3: Creating a Statement
        Statement stmt = connection.createStatement();

        //Scanner class to take input from user
        Scanner sc = new Scanner(System.in);
        
        //Integer input for variable operation
        int operation;

        do 
        {
            // Display menu for CRUD operations
            System.out.println("Available Operations:");
            System.out.println("1. Create");
            System.out.println("2. Retrive");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            //Prompts user to enter a operation number
            System.out.print("Please Enter a Operation number you want to Perform: ");
            operation = sc.nextInt();
            
            // Consume newline
            sc.nextLine(); 
            
            // Use a switch statement to perform different actions based on the user's choice
            switch (operation) 
            {
            // Create operation: Add a new student record to the database
            case 1:
                	// Prompt for and collect grocery information
        		System.out.println("Enter item's id:");
        		int id = sc.nextInt();
        		System.out.println("Enter item's name:");
        		String Name = sc.next();
        		System.out.println("Enter item's BrandName:");
        		String BrandName = sc.next();
        		System.out.println("Enter item's cost per pack:");
        		int Cost = sc.nextInt();
        		System.out.println("Enter item's expairy date:");
        		String Exp_date = sc.next();
        		

                    // SQL query to insert a new item record
                    String createSql = "insert into grocery_items values(?,?,?,?,?)";
                    
                    // Creating a PreparedStatement object for executing the SQL query.
                    try (PreparedStatement createStatement = connection.prepareStatement(createSql)) 
                    {
                    	// Set the value for the first placeholder ('?') in the SQL query with the id.
                    	createStatement.setInt(1, id);
                    	
                    	// Set the value for the second placeholder ('?') in the SQL query with the name.
                        createStatement.setString(2, Name);
                       
                        // Set the value for the third placeholder ('?') in the SQL query with the BrandName.
                        createStatement.setString(3, BrandName);
                        
                        // Set the value for the fourth placeholder ('?') in the SQL query with the Cost.
                        createStatement.setInt(4, Cost);
                        
                        // Set the value for the fifth placeholder ('?') in the SQL query with the Exp_date.
                        createStatement.setString(5, Exp_date);
                       
                        // Execute the SQL query and get the number of rows affected in the database.
                        int rowsAffected = createStatement.executeUpdate();
                       
                        // Check if any rows were affected (record added successfully) and provide appropriate feedback.
                        if (rowsAffected > 0) 
                        {
                            System.out.println("Item added successfully.");
                        } else 
                        {
                            System.out.println("Failed to add Item.");
                        }
                    }
                    // End of try-with-resources block for PreparedStatement
                    //jump out of the switch statement after completing the insert operation.
                    break;

                case 2:
                    // Read operation: Retrieve and display grocery item records from the database
                    String readSql = "SELECT * FROM grocery_items";
                    
                    // Creating a Statement object for executing the SQL query.
                    try (Statement readStatement = connection.createStatement()) 
                    {
                    	// Execute the SQL query and obtain a ResultSet containing the results.
                        ResultSet resultSet = readStatement.executeQuery(readSql);

                        // While Loop through the ResultSet to extract and display item information.
                        while (resultSet.next()) 
                        {
                        	// Extract and display item information
                            int grocery_itemsId = resultSet.getInt("id");
                            String grocery_itemsName = resultSet.getString("Name");
                            String grocery_itemsBrandName = resultSet.getString("BrandName");
                            int grocery_itemsCost = resultSet.getInt("Cost");
                            String grocery_itemsExp_date= resultSet.getString("Exp_date");
                            // Display the extracted item information
                            System.out.println(
                                    "ID: " + grocery_itemsId + ", Name: " + grocery_itemsName + ", Brand Name: " + grocery_itemsBrandName + ", Cost: " + grocery_itemsCost + ", Exp_date: " + grocery_itemsExp_date);
                        }
                    }
                    // Jump out of the switch statement after completing the read operation.
                    break;

                case 3:
                    // Update operation: Modify item records 
                	// Prompt for item ID and update choice
                    System.out.print("Enter grocery item's ID to update: ");
                    int ItemIdToUpdate = sc.nextInt();
                    // Consume newline character
                    sc.nextLine(); 

                    // Display options for what the user can update
                    System.out.println("Choose what to update:");
                    System.out.println("1. Update item name");
                    System.out.println("2. Update Brand name");
                    System.out.println("3. Update cost");
                    System.out.println("4. Update expairy date");
                    
                    //Prompts to user to enter a choice 
                    System.out.print("Enter your choice: ");
                    int updateChoice = sc.nextInt();
                    // Consume newline
                    sc.nextLine(); 

                    String updateSql;
                    PreparedStatement updateStatement;
                    
                    // Use a switch statement to handle different update choices
                    switch (updateChoice) 
                    {
                        case 1:
                            // Update item name
                            System.out.print("Enter new item name: ");
                            String newName = sc.nextLine();
                            
                            // SQL query to update name
                            updateSql = "UPDATE grocery_items SET Name WHERE id = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setString(1, newName);
                            
                            break;

                        case 2:
                            // Update brand name
                            System.out.print("Enter new item's Brand name: ");
                            int newbrandName = sc.nextInt();

                            // SQL query to update brand name
                            updateSql = "UPDATE grocery_items SET BrandName = ? WHERE id = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setInt(1, newbrandName);
                            break;

                        case 3:
                            // Update cost
                            sc.nextLine(); // Consume newline
                            System.out.print("Enter new cost: ");
                            int newCost = sc.nextInt();

                            // SQL query to update cost
                            updateSql = "UPDATE grocery_items SET Cost = ? WHERE id = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setInt(1, newCost);
                            break;
                          
                        case 4:
                            // Update Expairy date
                            sc.nextLine(); // Consume newline
                            System.out.print("Enter new expairy date: ");
                            String newExp_date = sc.nextLine();

                            // SQL query to update Expairy date
                            updateSql = "UPDATE grocery_items SET Exp_date = ? WHERE id = ?";
                            updateStatement = connection.prepareStatement(updateSql);
                            updateStatement.setString(1, newExp_date);
                           
                            break;

                        default:
                            System.out.println("Invalid choice for update. Please try again.");
                            // Continue the loop to re-enter the update operation
                            continue; 
                    }

                    // Set item ID and execute the update query
                    updateStatement.setInt(2, ItemIdToUpdate);
                    int rowsAffected = updateStatement.executeUpdate();
                    
                    // Check if the update was successful and provide feedback
                    if (rowsAffected > 0) 
                    {
                        System.out.println("Grocery item updated successfully.");
                    } else 
                    {
                        System.out.println("Grocery item not found or update failed.");
                    }
                    break;

                case 4:
                    // Delete operation: Remove a item record from the database
                	// Prompt for item ID to delete
                	System.out.print("Enter item ID to delete: ");
                    int ItemIdToDelete = sc.nextInt();

                    // SQL query to delete a item record
                    String deleteSql = "DELETE FROM grocery_items WHERE id = ?";
                    try (PreparedStatement deleteStatement = connection.prepareStatement(deleteSql)) 
                    {
                        deleteStatement.setInt(1, ItemIdToDelete);
                        int rowsAffected1 = deleteStatement.executeUpdate();
                        if (rowsAffected1 > 0) 
                        {
                            System.out.println("Item deleted successfully.");
                        } else 
                        {
                            System.out.println("Item not found or delete failed.");
                        }
                    }
                    // Jump out of the switch statement after completing the update operation
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting program.....................");
                    //Jump out of the loop
                    break;

                default:
                	//handles any invalid user input.
                    System.out.println("Invalid choice. Please try again.........................");
            }
        } 
        
        // This loop continues as long as the user's choice (operation) is not equal to 5.
        while (operation != 5);

    
        // Close the Scanner used for user input.
        sc.close();
        // Close a Statement object
        stmt.close();
        // Close the database connection.
        connection.close();
    }
}