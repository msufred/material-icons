package org.gemseeker.materialicons.test;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import org.gemseeker.materialicons.*;

import java.util.Locale;

public class MainTest extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FilteredList<IconView> filteredList = new FilteredList<>(FXCollections.observableArrayList(
                new IconView("Search", new SearchIcon(20)),
                new IconView("Home", new HomeIcon(20)),
                new IconView("Menu", new MenuIcon(20)),
                new IconView("Close", new CloseIcon(20)),
                new IconView("Settings", new SettingsIcon(20)),
                new IconView("Check", new CheckIcon(20)),
                new IconView("Expand More", new ExpandMoreIcon(20)),
                new IconView("Check Circle", new CheckCircleIcon(20)),
                new IconView("Favorite", new FavoriteIcon(20)),
                new IconView("Add", new AddIcon(20)),
                new IconView("Delete", new DeleteIcon(20)),
                new IconView("Arrow Back", new ArrowBackIcon(20)),
                new IconView("Star", new StarIcon(20)),
                new IconView("Chevron Right", new ChevronRightIcon(20)),
                new IconView("Logout", new LogoutIcon(20)),
                new IconView("Arrow Forward IOS", new ArrowForwardIosIcon(20)),
                new IconView("Add Circle", new AddCircleIcon(20)),
                new IconView("Cancel", new CancelIcon(20)),
                new IconView("Arrow Back IOS", new ArrowBackIosIcon(20)),
                new IconView("Arrow Forward", new ArrowForwardIcon(20)),
                new IconView("Arrow Dropdown", new ArrowDropdownIcon(20)),
                new IconView("More Vert", new MoreVertIcon(20)),
                new IconView("Check Box", new CheckBoxIcon(20)),
                new IconView("Toggle On", new ToggleOnIcon(20)),
                new IconView("Open In New", new OpenInNewIcon(20)),
                new IconView("Check Box Outline Blank", new CheckBoxOutlineBlankIcon(20)),
                new IconView("Refresh", new RefreshIcon(20))
        ));

        Label lblSearchIcon = new Label();
        lblSearchIcon.setGraphic(new SearchIcon(14));

        TextField tfSearch = new TextField();
        tfSearch.setPromptText("Search Icon");
        tfSearch.setOnKeyTyped(evt -> {
            String search = tfSearch.getText();
            if (search.isEmpty()) filteredList.setPredicate(p -> true);
            else filteredList.setPredicate(icon -> icon.label.getText().toLowerCase().contains(search.toLowerCase()));
        });
        HBox.setHgrow(tfSearch, Priority.ALWAYS);

        HBox toolbar = new HBox();
        toolbar.setAlignment(Pos.CENTER);
        toolbar.setSpacing(4);
        toolbar.setPadding(new Insets(8));
        toolbar.getChildren().addAll(lblSearchIcon, tfSearch);

        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(8);
        flowPane.setVgap(8);
        flowPane.setPadding(new Insets(16));

        Bindings.bindContent(flowPane.getChildren(), filteredList);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        scrollPane.setContent(flowPane);
        VBox.setVgrow(scrollPane, Priority.ALWAYS);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(toolbar, scrollPane);

        Scene scene = new Scene(vBox, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Material Icons");
        primaryStage.show();
    }

    private class IconView extends VBox {
        Label label;
        SVGIcon icon;
        IconView(String name, SVGIcon icon) {
            label = new Label(name);
            label.setWrapText(true);
            label.setTextAlignment(TextAlignment.CENTER);
            this.icon = icon;

            setMinSize(100, 100);
            setMaxSize(100, 100);
            setAlignment(Pos.CENTER);
            setSpacing(8);
            setPadding(new Insets(8));
            setStyle("-fx-background-color: white; -fx-background-radius: 5; -fx-effect: dropshadow(gaussian, rgba(0, 0, 0, 0.2), 3, 0, 0, 0)");
            getChildren().addAll(this.icon, label);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
