package edu.guilford;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * JavaFX App
 */
public class final_project extends EmissionPane {
    
    
}
    // private static Scene scene;
    // private static String CSV_File = "Emisions_Past_Future.csv";
    // private List <EmissionsData> final_project("Emissions") 
    // List<EmissionsData> emissionsDataList = new ArrayList<EmissionsData>();

    // @Override
    // public void start(Stage stage) { 
    //     //Defining the axes               
    //     CategoryAxis xAxis = new CategoryAxis(); 
    //     xAxis.setLabel("Year");
        
    //     List<String> years = new ArrayList<String>();
    //     for (int year = 1800; year < 2018; year++) {
    //         years.add(Integer.toString(year));
    //     }

    //     NumberAxis yAxis = new NumberAxis(0, 10000, 2500); 
    //     yAxis.setLabel("Emissions");     
        
    //     //Creating the Area chart 
    //     StackedAreaChart<String, Number> areaChart = new StackedAreaChart(xAxis, yAxis);
    //     areaChart.setTitle("Emissions Past and Future");
        
    //     List<EmissionsData> emisionsdataList = Appfromcsv(CSV_File);
                  
    //     //Setting the data to area chart        
    //     areaChart.getData().addAll(series1, series2, series3, series4, series5); 
           
    //     //Creating a Group object  
    //     Group root = new Group(areaChart); 
            
    //     //Creating a scene object 
    //     Scene scene = new Scene(root, 600, 400); 
        
    //     //Setting title to the Stage 
    //     stage.setTitle("Stacked Area Chart"); 
           
    //     //Adding scene to the stage 
    //     stage.setScene(scene); 
           
    //     //Displaying the contents of the stage 
    //     stage.show();         
    //  } 
    //  public static void main(String args[]){ 
    //     launch(args); 
    //  } 

   

