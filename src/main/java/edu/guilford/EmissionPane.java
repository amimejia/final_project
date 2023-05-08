package edu.guilford;

import java.net.URISyntaxException;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.nio.file.Path;
import java.nio.file.Paths;
import javafx.stage.Stage;

public class EmissionPane extends BorderPane {
    private String fileName = ("cleaned_emissions_past_future.csv");
    private Path dataLocation;
    public EmissionPane() {
        try {
            dataLocation = Paths.get(final_project.class.getResource( "cleaned_emissions_past_future.csv").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
