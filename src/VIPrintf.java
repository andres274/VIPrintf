/*
@author Andres Montenegro
Purpose: To learn to use printf instead of println
Date: 10/3/2017
Contact: am23828@email.vccs.edu
 */

/**
 * The purpose of this program is to learn about printf and its different commands as well as if-else statements
 * @author Andres Montenegro
 * Date: 10/3/2017
 * Contact: am23828@email.vccs.edu
 */

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;

public class VIPrintf extends Application {

    @Override
    public void start (Stage primaryStage) {
        TextInputDialog textInputDialog = new TextInputDialog("1"); //1 will be the default in the inout box
        textInputDialog.setTitle("Println vs. Printf");
        textInputDialog.setContentText("Select option 1 for println or option 2 for printf");
        Optional<String> input = textInputDialog.showAndWait();
        String option = input.get();

        if(option.equals("1")) {
            System.out.println("You chose to println, get hip!"); // "get hip!" is meant to encourage the user to learn to use printf
        } else if (option.equals(2)) {
            System.out.printf("Good choice %s \n","brave one"); // %s ise the place holder for the rest of the statement
            System.out.printf("Character: %c \n", 123); // look at acsii table for more character options and confirmation
            System.out.printf("Decimal: %8d \n", 4321); // a total of 8 characters and 4321 will be the last four
            System.out.printf("Exponents: %+.3e \n",123.456); // 123.456 will be raised by 10^2 with 3 decimal places
            System.out.printf("Float: %6.4f \n", 7.8910); // a total of 6 characters and 4 after the decimal point
        }
    }
}
