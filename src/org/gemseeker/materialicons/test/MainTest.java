package org.gemseeker.materialicons.test;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import org.gemseeker.materialicons.*;

public class MainTest extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FilteredList<IconView> filteredList = new FilteredList<>(FXCollections.observableArrayList(
                new IconView("Search", new SearchIcon(20), "search-icon"),
                new IconView("Home", new HomeIcon(20), "home-icon"),
                new IconView("Menu", new MenuIcon(20), "menu-icon"),
                new IconView("Menu Open", new MenuOpenIcon(20), "menu-open-icon"),
                new IconView("Close", new CloseIcon(20), "close-icon"),
                new IconView("Settings", new SettingsIcon(20), "settings-icon"),
                new IconView("Check", new CheckIcon(20), "check-icon"),
                new IconView("Expand More", new ExpandMoreIcon(20), "expand-more-icon"),
                new IconView("Expand Less", new ExpandLessIcon(20), "expand-less-icon"),
                new IconView("Expand Circle Down", new ExpandCircleDown(20), "expand-circle-down-icon"),
                new IconView("Check Circle", new CheckCircleIcon(20), "check-circle-icon"),
                new IconView("Favorite", new FavoriteIcon(20), "favorite-icon"),
                new IconView("Add", new AddIcon(20), "add-icon"),
                new IconView("Add Box", new AddBoxIcon(20), "add-box-icon"),
                new IconView("Delete", new DeleteIcon(20), "delete-icon"),
                new IconView("Delete Forever", new DeleteForeverIcon(20), "delete-forever-icon"),
                new IconView("Arrow Back", new ArrowBackIcon(20), "arrow-back-icon"),
                new IconView("Arrow Forward", new ArrowForwardIcon(20), "arrow-forward-icon"),
                new IconView("Arrow Up", new ArrowUpIcon(20), "arrow-up-icon"),
                new IconView("Arrow Down", new ArrowDownIcon(20), "arrow-down-icon"),
                new IconView("Star", new StarIcon(20), "star-icon"),
                new IconView("Star Half", new StarHalfIcon(20), "star-half-icon"),
                new IconView("Chevron Left", new ChevronLeftIcon(20), "chevron-left-icon"),
                new IconView("Chevron Right", new ChevronRightIcon(20), "chevron-right-icon"),
                new IconView("Logout", new LogoutIcon(20), "logout-icon"),
                new IconView("Login", new LoginIcon(20), "login-icon"),
                new IconView("Arrow Back IOS", new ArrowBackIosIcon(20), "arrow-back-ios-icon"),
                new IconView("Arrow Forward IOS", new ArrowForwardIosIcon(20), "arrow-forward-ios-icon"),
                new IconView("Add Circle", new AddCircleIcon(20), "add-circle-icon"),
                new IconView("Cancel", new CancelIcon(20), "cancel-icon"),
                new IconView("Arrow Drop Down", new ArrowDropDownIcon(20), "arrow-drop-down-icon"),
                new IconView("Arrow Drop Up", new ArrowDropUpIcon(20), "arrow-drop-up-icon"),
                new IconView("Arrow Right", new ArrowRightIcon(20), "arrow-right-icon"),
                new IconView("Arrow Right Alt", new ArrowRightAltIcon(20), "arrow-right-alt-icon"),
                new IconView("More Vert", new MoreVertIcon(20), "more-vert-icon"),
                new IconView("More Horiz", new MoreHorizIcon(20), "more-horiz-icon"),
                new IconView("Check Box", new CheckBoxIcon(20), "check-box-icon"),
                new IconView("Toggle On", new ToggleOnIcon(20), "toggle-on-icon"),
                new IconView("Toggle Off", new ToggleOffIcon(20), "toggle-off-icon"),
                new IconView("Open In New", new OpenInNewIcon(20), "open-in-new-icon"),
                new IconView("Open In Full", new OpenInFullIcon(20), "open-in-full-icon"),
                new IconView("Check Box Outline Blank", new CheckBoxOutlineBlankIcon(20), "check-box-outline-blank-icon"),
                new IconView("Refresh", new RefreshIcon(20), "refresh-icon"),
                new IconView("Radio Button Unchecked", new RadioButtonUncheckedIcon(20), "radio-button-unchecked-icon"),
                new IconView("Radio Button Checked", new RadioButtonCheckedIcon(20), "radio-button-checked-icon"),
                new IconView("Apps", new AppsIcon(20), "apps-icon"),
                new IconView("Download", new DownloadIcon(20), "download-icon"),
                new IconView("Remove", new RemoveIcon(20), "remove-icon"),
                new IconView("Bolt", new BoltIcon(20), "bolt-icon"),
                new IconView("Filter List", new FilterListIcon(20), "filter-list-icon"),
                new IconView("Sort", new SortIcon(20), "sort-icon"),
                new IconView("Auto Renew", new AutoRenewIcon(20), "auto-renew-icon"),
                new IconView("Key", new KeyIcon(20), "key-icon"),
                new IconView("Sync", new SyncIcon(20), "sync-icon"),
                new IconView("Block", new BlockIcon(20), "block-icon"),
                new IconView("Restart Alt", new RestartAltIcon(20), "restart-alt-icon"),
                new IconView("Shopping Cart Checkout", new ShoppingCartCheckoutIcon(20), "shopping-cart-checkout-icon"),
                new IconView("Backspace", new BackspaceIcon(20), "backspace-icon"),
                new IconView("Arrow Circle Right", new ArrowCircleRightIcon(20), "arrow-circle-right-icon"),
                new IconView("Undo", new UndoIcon(20), "undo-icon"),
                new IconView("Done All", new DoneAllIcon(20), "done-all-icon"),
                new IconView("Done Outline", new DoneOutlineIcon(20), "done-outline-icon"),
                new IconView("Do Not Disturb", new DoNotDisturbIcon(20), "do-not-disturb-icon"),
                new IconView("Double Arrow", new DoubleArrowIcon(20), "double-arrow-icon"),
                new IconView("Manage Search", new ManageSearchIcon(20), "manage-search-icon"),
                new IconView("Sync Alt", new SyncAltIcon(20), "sync-alt-icon"),
                new IconView("Zoom In", new ZoomInIcon(20), "zoom-in-icon"),
                new IconView("Drag Indicator", new DragIndicatorIcon(20), "drag-indicator-icon"),
                new IconView("Fullscreen", new FullscreenIcon(20), "fullscreen-icon"),
                new IconView("Keyboard Double Arrow Right", new KeyboardDoubleArrowRightIcon(20), "keyboard-double-arrow-right-icon"),
                new IconView("Settings Accessibility", new SettingsAccessibilityIcon(20), "settings-accessibility-icon"),
                new IconView("Ios Share", new IosShareIcon(20), "ios-share-icon")
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
            this(name, icon, null);
        }

        IconView(String name, SVGIcon icon, String tooltip) {
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

            if (tooltip != null) {
                Tooltip.install(this, new Tooltip(tooltip));
            }

            getChildren().addAll(this.icon, label);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
