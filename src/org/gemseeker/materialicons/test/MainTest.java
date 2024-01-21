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

import java.util.ArrayList;
import java.util.Arrays;

public class MainTest extends Application {

    private static final double SIZE = 24;
    private static final ArrayList<String> categories = new ArrayList<>(Arrays.asList(
            "UI Actions", "Social"
    ));

    // UI Actions Icons
    private final FilteredList<IconView> uiActions = new FilteredList<>(FXCollections.observableArrayList(
            new IconView("Search", new SearchIcon(SIZE), "search-icon"),
            new IconView("Search Check", new SearchCheckIcon(SIZE), "search-check-icon"),
            new IconView("Search Off", new SearchOffIcon(SIZE), "search-off-icon"),
            new IconView("Saved Search", new SeavedSearchIcon(SIZE), "saved-search-icon"),
            new IconView("Youtube Searched", new YotubeSearchedIcon(SIZE), "youtube-searched-icon"),
            new IconView("Zoom In", new ZoomInIcon(SIZE), "zoom-in-icon"),
            new IconView("Zoom Out", new ZoomOutIcon(SIZE), "zoom-out-icon"),
            new IconView("Home", new HomeIcon(SIZE), "home-icon"),
            new IconView("Menu", new MenuIcon(SIZE), "menu-icon"),
            new IconView("Menu Open", new MenuOpenIcon(SIZE), "menu-open-icon"),
            new IconView("Clear All", new ClearAllIcon(SIZE), "clear-all-icon"),
            new IconView("Close", new CloseIcon(SIZE), "close-icon"),
            new IconView("Settings", new SettingsIcon(SIZE), "settings-icon"),
            new IconView("Settings Application", new SettingsApplicationIcon(SIZE), "settings-application-icon"),
            new IconView("Check", new CheckIcon(SIZE), "check-icon"),
            new IconView("Check Small", new CheckSmallIcon(SIZE), "check-small-icon"),
            new IconView("Expand More", new ExpandMoreIcon(SIZE), "expand-more-icon"),
            new IconView("Expand Less", new ExpandLessIcon(SIZE), "expand-less-icon"),
            new IconView("Expand Circle Down", new ExpandCircleDown(SIZE), "expand-circle-down-icon"),
            new IconView("Check Circle", new CheckCircleIcon(SIZE), "check-circle-icon"),
            new IconView("Favorite", new FavoriteIcon(SIZE), "favorite-icon"),
            new IconView("Heart Plus", new HeartPlusIcon(SIZE), "heart-plus-icon"),
            new IconView("Heart Minus", new HeartMinusIcon(SIZE), "heart-minus-icon"),
            new IconView("Add", new AddIcon(SIZE), "add-icon"),
            new IconView("Add Box", new AddBoxIcon(SIZE), "add-box-icon"),
            new IconView("Delete", new DeleteIcon(SIZE), "delete-icon"),
            new IconView("Restore From Trash", new RestoreFromTrashIcon(SIZE), "restore-from-trash-icon"),
            new IconView("Delete Forever", new DeleteForeverIcon(SIZE), "delete-forever-icon"),
            new IconView("Delete Sweep", new DeleteSweepIcon(SIZE), "delete-sweep-icon"),
            new IconView("Arrow Back", new ArrowBackIcon(SIZE), "arrow-back-icon"),
            new IconView("Arrow Forward", new ArrowForwardIcon(SIZE), "arrow-forward-icon"),
            new IconView("Arrow Up", new ArrowUpIcon(SIZE), "arrow-up-icon"),
            new IconView("Arrow Down", new ArrowDownIcon(SIZE), "arrow-down-icon"),
            new IconView("Star", new StarIcon(SIZE), "star-icon"),
            new IconView("Star Half", new StarHalfIcon(SIZE), "star-half-icon"),
            new IconView("Chevron Left", new ChevronLeftIcon(SIZE), "chevron-left-icon"),
            new IconView("Chevron Right", new ChevronRightIcon(SIZE), "chevron-right-icon"),
            new IconView("Logout", new LogoutIcon(SIZE), "logout-icon"),
            new IconView("Login", new LoginIcon(SIZE), "login-icon"),
            new IconView("Publish", new PublishIcon(SIZE), "publish-icon"),
            new IconView("File Upload Off", new FileUploadOffIcon(SIZE), "file-upload-off-icon"),
            new IconView("Arrow Back IOS", new ArrowBackIosIcon(SIZE), "arrow-back-ios-icon"),
            new IconView("Arrow Forward IOS", new ArrowForwardIosIcon(SIZE), "arrow-forward-ios-icon"),
            new IconView("Add Circle", new AddCircleIcon(SIZE), "add-circle-icon"),
            new IconView("Cancel", new CancelIcon(SIZE), "cancel-icon"),
            new IconView("Arrow Drop Down", new ArrowDropDownIcon(SIZE), "arrow-drop-down-icon"),
            new IconView("Arrow Drop Up", new ArrowDropUpIcon(SIZE), "arrow-drop-up-icon"),
            new IconView("Arrow Right", new ArrowRightIcon(SIZE), "arrow-right-icon"),
            new IconView("Arrow Left", new ArrowLeftIcon(SIZE), "arrow-left-icon"),
            new IconView("Arrow Drop Down Circle", new ArrowDropDownCircleIcon(SIZE), "arrow-drop-down-circle-icon"),
            new IconView("Arrow Right Alt", new ArrowRightAltIcon(SIZE), "arrow-right-alt-icon"),
            new IconView("More Vert", new MoreVertIcon(SIZE), "more-vert-icon"),
            new IconView("More Horiz", new MoreHorizIcon(SIZE), "more-horiz-icon"),
            new IconView("Check Box", new CheckBoxIcon(SIZE), "check-box-icon"),
            new IconView("Indeterminate Check Box", new IndeterminateCheckBoxIcon(SIZE), "indeterminate-check-box-icon"),
            new IconView("Check Box Outline Blank", new CheckBoxOutlineBlankIcon(SIZE), "check-box-outline-blank-icon"),
            new IconView("Select Check Box", new SelectCheckBoxIcon(SIZE), "select-check-box-icon"),
            new IconView("Toggle On", new ToggleOnIcon(SIZE), "toggle-on-icon"),
            new IconView("Toggle Off", new ToggleOffIcon(SIZE), "toggle-off-icon"),
            new IconView("Open In New", new OpenInNewIcon(SIZE), "open-in-new-icon"),
            new IconView("New Window", new NewWindowIcon(SIZE), "new-window-icon"),
            new IconView("Open In New Off", new OpenInNewOffIcon(SIZE), "open-in-new-off-icon"),
            new IconView("Open In Full", new OpenInFullIcon(SIZE), "open-in-full-icon"),
            new IconView("Refresh", new RefreshIcon(SIZE), "refresh-icon"),
            new IconView("Radio Button Unchecked", new RadioButtonUncheckedIcon(SIZE), "radio-button-unchecked-icon"),
            new IconView("Radio Button Checked", new RadioButtonCheckedIcon(SIZE), "radio-button-checked-icon"),
            new IconView("Apps", new AppsIcon(SIZE), "apps-icon"),
            new IconView("Apps Outage", new AppsOutageIcon(SIZE), "apps-outage-icon"),
            new IconView("App Registration", new AppRegistrationIcon(SIZE), "app-registration-icon"),
            new IconView("Download", new DownloadIcon(SIZE), "download-icon"),
            new IconView("File Download Off", new FileDownloadOffIcon(SIZE), "file-download-off-icon"),
            new IconView("Download For Offline", new DownloadForOfflineIcon(SIZE), "download-for-offline"),
            new IconView("Downloading", new DownloadingIcon(SIZE), "downloading-icon"),
            new IconView("Download Done", new DownloadDoneIcon(SIZE), "download-done-icon"),
            new IconView("Remove", new RemoveIcon(SIZE), "remove-icon"),
            new IconView("Bolt", new BoltIcon(SIZE), "bolt-icon"),
            new IconView("Filter List", new FilterListIcon(SIZE), "filter-list-icon"),
            new IconView("Filter List Off", new FilterListOffIcon(SIZE), "filter-list-off-icon"),
            new IconView("Sort", new SortIcon(SIZE), "sort-icon"),
            new IconView("Auto Renew", new AutoRenewIcon(SIZE), "auto-renew-icon"),
            new IconView("Cached", new CachedIcon(SIZE), "cached-icon"),
            new IconView("Key", new KeyIcon(SIZE), "key-icon"),
            new IconView("Key Off", new KeyOffIcon(SIZE), "key-off-icn"),
            new IconView("Sync", new SyncIcon(SIZE), "sync-icon"),
            new IconView("Sync Problem", new SyncProblemIcon(SIZE), "sync-problem-icon"),
            new IconView("Sync Disabled", new SyncDisabledIcon(SIZE), "sync-disabled-icon"),
            new IconView("Block", new BlockIcon(SIZE), "block-icon"),
            new IconView("Restart Alt", new RestartAltIcon(SIZE), "restart-alt-icon"),
            new IconView("Shopping Cart Checkout", new ShoppingCartCheckoutIcon(SIZE), "shopping-cart-checkout-icon"),
            new IconView("Backspace", new BackspaceIcon(SIZE), "backspace-icon"),
            new IconView("Arrow Circle Right", new ArrowCircleRightIcon(SIZE), "arrow-circle-right-icon"),
            new IconView("Arrow Circle Left", new ArrowCircleLeftIcon(SIZE), "arrow-circle-left-icon"),
            new IconView("Arrow Circle Up", new ArrowCircleUpIcon(SIZE), "arrow-circle-up-icon"),
            new IconView("Arrow Circle Down", new ArrowCircleDownIcon(SIZE), "arrow-circle-down-icon"),
            new IconView("Undo", new UndoIcon(SIZE), "undo-icon"),
            new IconView("Redo", new RedoIcon(SIZE), "redo-icon"),
            new IconView("Done All", new DoneAllIcon(SIZE), "done-all-icon"),
            new IconView("Remove Done", new RemoveDoneIcon(SIZE), "remove-done-icon"),
            new IconView("Done Outline", new DoneOutlineIcon(SIZE), "done-outline-icon"),
            new IconView("Do Not Disturb", new DoNotDisturbIcon(SIZE), "do-not-disturb-icon"),
            new IconView("Do Not Disturb Off", new DoNotDisturbOffIcon(SIZE), "do-not-disturb-off-icon"),
            new IconView("Double Arrow", new DoubleArrowIcon(SIZE), "double-arrow-icon"),
            new IconView("Manage Search", new ManageSearchIcon(SIZE), "manage-search-icon"),
            new IconView("Sync Alt", new SyncAltIcon(SIZE), "sync-alt-icon"),
            new IconView("Drag Indicator", new DragIndicatorIcon(SIZE), "drag-indicator-icon"),
            new IconView("Fullscreen", new FullscreenIcon(SIZE), "fullscreen-icon"),
            new IconView("Fullscreen Exit", new FullscreenExitIcon(SIZE), "fullscreen-exit-icon"),
            new IconView("Close Fullscreen", new CloseFullscreenIcon(SIZE), "close-fullscreen-icon"),
            new IconView("Keyboard Double Arrow Right", new KeyboardDoubleArrowRightIcon(SIZE), "keyboard-double-arrow-right-icon"),
            new IconView("Keyboard Double Arrow Left", new KeyboardDoubleArrowLeftIcon(SIZE), "keyboard-double-arrow-left-icon"),
            new IconView("Keyboard Double Arrow Down", new KeyboardDoubleArrowDownIcon(SIZE), "keyboard-double-arrow-down-icon"),
            new IconView("Keyboard Double Arrow Up", new KeyboardDoubleArrowUpIcon(SIZE), "keyboard-double-arrow-up"),
            new IconView("Settings Accessibility", new SettingsAccessibilityIcon(SIZE), "settings-accessibility-icon"),
            new IconView("Ios Share", new IosShareIcon(SIZE), "ios-share-icon"),
            new IconView("Reply", new ReplyIcon(SIZE), "reply-icon"),
            new IconView("Forward", new ForwardIcon(SIZE), "forward-icon"),
            new IconView("Reply All", new ReplyAllIcon(SIZE), "reply-all-icon"),
            new IconView("Exit To App", new ExitToAppIcon(SIZE), "exit-to-app-icon"),
            new IconView("Unfold More", new UnfoldMoreIcon(SIZE), "unfold-more-icon"),
            new IconView("Unfold Less", new UnfoldLessIcon(SIZE), "unfold-less-icon"),
            new IconView("Unfold More Double", new UnfoldMoreDoubleIcon(SIZE), "unfold-more-double-icon"),
            new IconView("Unfold Less Double", new UnfoldLessDoubleIcon(SIZE), "unfold-less-double-icon"),
            new IconView("Library Add", new LibraryAddIcon(SIZE), "library-add-icon"),
            new IconView("Terminal", new TerminalIcon(SIZE), "terminal-icon"),
            new IconView("Change Circle", new ChangeCircleIcon(SIZE), "change-circle-icon"),
            new IconView("Disabled By Default", new DisabledByDefaultIcon(SIZE), "disabled-by-default-icon"),
            new IconView("Swap Horiz", new SwapHorizIcon(SIZE), "swap-horiz-icon"),
            new IconView("Swap Vert", new SwapVertIcon(SIZE), "swap-vert-icon"),
            new IconView("Compare Arrows", new CompareArrowsIcon(SIZE), "compare-arrows-icon"),
            new IconView("Hide", new HideIcon(SIZE), "hide-icon"),
            new IconView("File Open", new FileOpenIcon(SIZE), "file-open-icon"),
            new IconView("Minimize", new MinimizeIcon(SIZE), "minimize-icon"),
            new IconView("Open With", new OpenWithIcon(SIZE), "open-with-icon"),
            new IconView("Dataset", new DatasetIcon(SIZE), "dataset-icon"),
            new IconView("Dataset Linked", new DatasetLinkedIcon(SIZE), "dataset-linked-icon"),
            new IconView("Data Thresholding", new DataThresholdingIcon(SIZE), "data-thresholding-icon"),
            new IconView("Add Task", new AddTaskIcon(SIZE), "add-task-icon"),
            new IconView("Start", new StartIcon(SIZE), "start-icon"),
            new IconView("Keyboard Voice", new KeyboardVoiceIcon(SIZE), "keyboard-voice-icon"),
            new IconView("Create New Folder", new CreateNewFolderIcon(SIZE), "create-new-folder-icon"),
            new IconView("Html", new HtmlIcon(SIZE), "html-icon"),
            new IconView("One Two Three", new OneTwoThreeIcon(SIZE), "one-two-three-icon"),
            new IconView("Javascript", new JavascriptIcon(SIZE), "javascript-icon"),
            new IconView("CSS", new CssIcon(SIZE), "css-icon"),
            new IconView("ABC", new AbcIcon(SIZE), "abc-icon"),
            new IconView("PHP", new PhpIcon(SIZE), "php-icon"),
            new IconView("Token", new TokenIcon(SIZE), "token-icon"),
            new IconView("Deployed Code", new DeployedCodeIcon(SIZE), "deployed-code-icon"),
            new IconView("Switch Access Shortcut", new SwitchAccessShortcutIcon(SIZE), "switch-access-shortcut-icon"),
            new IconView("Switch Access Shortcut Add", new SwitchAccessShortcutAddIcon(SIZE), "switch-access-shortcut-add-icon"),
            new IconView("Short By Alpha", new SortByAlphaIcon(SIZE), "sort-by-alpha-icon"),
            new IconView("First Page", new FirstPageIcon(SIZE), "first-page-icon"),
            new IconView("Last Page", new LastPageIcon(SIZE), "last-page-icon"),
            new IconView("View Timeline", new ViewTimelineIcon(SIZE), "view-timeline-icon"),
            new IconView("Settings Backup Restore", new SettingsBackupRestoreIcon(SIZE), "settings-backup-restore-icon"),
            new IconView("Assistant Navigation", new AssistantNavigationIcon(SIZE), "assistant-navigation-icon"),
            new IconView("Assistant Direction", new AssistantDirectionIcon(SIZE), "assistant-direction"),
            new IconView("Density Large", new DensityLargeIcon(SIZE), "density-large-icon"),
            new IconView("Density Medium", new DensityMediumIcon(SIZE), "density-medium-icon"),
            new IconView("Density Small", new DensitySmallIcon(SIZE), "density-small-icon"),
            new IconView("Filter Alt Off", new FilterAltOffIcon(SIZE), "filter-alt-off-icon"),
            new IconView("Expand", new ExpandIcon(SIZE), "expand-icon"),
            new IconView("Subdirectory Arrow Right", new SubdirectoryArrowRightIcon(SIZE), "subdirectory-arrow-right-icon"),
            new IconView("Subdirectory Arrow Left", new SubdirectoryArrowLeftIcon(SIZE), "subdirectory-arrow-left-icon"),
            new IconView("Arrow Outward", new ArrowOutwardIcon(SIZE), "arrow-outward-icon"),
            new IconView("Arrow Insert", new ArrowInsertIcon(SIZE), "arrow-insert-icon"),
            new IconView("Swipe Left", new SwipeLeftIcon(SIZE), "swipe-left-icon"),
            new IconView("Swipe Right", new SwipeRightIcon(SIZE), "swipe-right-icon"),
            new IconView("Swipe Up", new SwipeUpIcon(SIZE), "swipe-up-icon"),
            new IconView("Swipe Down", new SwipeDownIcon(SIZE), "swipe-down-icon"),
            new IconView("Swipe Vertical", new SwipeVerticalIcon(SIZE), "swipe-vertical-icon"),
            new IconView("Pinch", new PinchIcon(SIZE), "pinch-icon"),
            new IconView("Auto Mode", new AutoModeIcon(SIZE), "auto-mode-icon"),
            new IconView("System Update Alt", new SystemUpdateAltIcon(SIZE), "system-update-alt-icon"),
            new IconView("Place Item", new PlaceItemIcon(SIZE), "place-item-icon"),
            new IconView("Output", new OutputIcon(SIZE), "output-icon"),
            new IconView("Fit Screen", new FitScreenIcon(SIZE), "fit-screen-icon"),
            new IconView("Select All", new SelectAllIcon(SIZE), "select-all-icon"),
            new IconView("Dynamic Form", new DynamicFormIcon(SIZE), "dynamic-form-icon"),
            new IconView("Hide Source", new HideSourceIcon(SIZE), "hide-source-icon"),
            new IconView("Browse Gallery", new BrowseGalleryIcon(SIZE), "browse-gallery-icon"),
            new IconView("Move Up", new MoveUpIcon(SIZE), "move-up-icon"),
            new IconView("Move Down", new MoveDownIcon(SIZE), "move-down-icon"),
            new IconView("Swap Horizontal Circle", new SwapHorizontalCircleIcon(SIZE), "swap-horizontal-circle-icon"),
            new IconView("Swap Vertical Circle", new SwapVerticalCircleIcon(SIZE), "swap-vertical-circle-icon"),
            new IconView("Install Mobile", new InstallMobileIcon(SIZE), "install-mobile-icon"),
            new IconView("Install Desktop", new InstallDesktopIcon(SIZE), "install-desktop-icon"),
            new IconView("Enable", new EnableIcon(SIZE), "enable-icon"),
            new IconView("Keyboard Command Key", new KeyboardCommandKeyIcon(SIZE), "keyboard-command-key-icon"),
            new IconView("Keyboard Control Key", new KeyboardControlKeyIcon(SIZE), "keyboard-control-key-icon"),
            new IconView("Keyboard Option Key", new KeyboardOptionKeyIcon(SIZE), "keyboard-option-key-icon"),
            new IconView("View Kanban", new ViewKanbanIcon(SIZE), "view-kanban-icon"),
            new IconView("View Cozy", new ViewCozyIcon(SIZE), "view-cozy-icon"),
            new IconView("View Comfy Alt", new ViewComfyAltIcon(SIZE), "view-comfy-alt-icon"),
            new IconView("View Compact Alt", new ViewCompactAltIcon(SIZE), "view-compact-alt-icon"),
            new IconView("Browse Activity", new BrowseActivityIcon(SIZE), "browse-activity-icon"),
            new IconView("Sync Saved Locally", new SyncSavedLocallyIcon(SIZE), "sync-saved-locally-icon"),
            new IconView("Switch Left", new SwitchLeftIcon(SIZE), "switch-left-icon"),
            new IconView("Switch Right", new SwitchRightIcon(SIZE), "switch-right-icon"),
            new IconView("Compress", new CompressIcon(SIZE), "compress-icon"),
            new IconView("More Up", new MoreUpIcon(SIZE), "more-up-icon"),
            new IconView("More Down", new MoreDownIcon(SIZE), "more-down-icon"),
            new IconView("Transcribe", new TranscribeIcon(SIZE), "transcribe-icon"),
            new IconView("Send Time Extension", new SendTimeExtensionIcon(SIZE), "send-time-extension-icon"),
            new IconView("Extension Off", new ExtensionOffIcon(SIZE), "extension-off-icon"),
            new IconView("Width Normal", new WidthNormalIcon(SIZE), "width-normal-icon"),
            new IconView("Width Wide", new WidthWideIcon(SIZE), "width-wide-icon"),
            new IconView("Width Full", new WidthFullIcon(SIZE), "width-full-icon"),
            new IconView("Share Reviews", new ShareReviewsIcon(SIZE), "share-reviews-icon"),
            new IconView("RepartitionIcon", new RepartitionIcon(SIZE), "repartition-icon"),
            new IconView("Swipe Left Alt", new SwipeLeftAltIcon(SIZE), "swipe-left-alt-icon"),
            new IconView("Swipe Down Alt", new SwipeDownAltIcon(SIZE), "swipe-down-alt-icon"),
            new IconView("Swipe Right Alt", new SwipeRightAltIcon(SIZE), "swipe-right-alt-icon"),
            new IconView("Swipe Up Alt", new SwipeUpAltIcon(SIZE), "swipe-up-alt-icon"),
            new IconView("Cycle", new CycleIcon(SIZE), "cycle-icon"),
            new IconView("Rebase", new RebaseIcon(SIZE), "rebase-icon"),
            new IconView("Rebase Edit", new RebaseEditIcon(SIZE), "rebase-edit-icon"),
            new IconView("Expand Content", new ExpandContentIcon(SIZE), "expand-content-icon"),
            new IconView("Empty Dashboard", new EmptyDashboardIcon(SIZE), "empty-dashboard-icon"),
            new IconView("Magic Exchange", new MagicExchangeIcon(SIZE), "magic-exchange-icon"),
            new IconView("Question Exchange", new QuestionExchangeIcon(SIZE), "question-exchange-icon"),
            new IconView("Quick Reference", new QuickReferenceIcon(SIZE), "quick-reference-icon"),
            new IconView("Quick Reference All", new QuickReferenceAllIcon(SIZE), "quick-reference-all-icon"),
            new IconView("Acute", new AcuteIcon(SIZE), "acute-icon"),
            new IconView("Clock Loader 10", new ClockLoader10Icon(SIZE), "clock-loader-10-icon"),
            new IconView("Clock Loader 20", new ClockLoader20Icon(SIZE), "clock-loader-20-icon"),
            new IconView("Clock Loader 40", new ClockLoader40Icon(SIZE), "clock-loader-40-icon"),
            new IconView("Clock Loader 60", new ClockLoader60Icon(SIZE), "clock-loader-60-icon"),
            new IconView("Clock Loader 80", new ClockLoader80Icon(SIZE), "clock-loader-80-icon"),
            new IconView("Clock Loader 90", new ClockLoader90Icon(SIZE), "clock-loader-90-icon"),
            new IconView("Data Alert", new DataAlertIcon(SIZE), "data-alert-icon"),
            new IconView("Data Check", new DataCheckIcon(SIZE), "data-check-icon"),
            new IconView("Data Info Alert", new DataInfoAlertIcon(SIZE), "data-info-alert-icon"),
            new IconView("Preliminary", new PreliminaryIcon(SIZE), "preliminary-icon"),
            new IconView("Step Into", new StepIntoIcon(SIZE), "step-into-icon"),
            new IconView("Point Scan", new PointScanIcon(SIZE), "point-scan-icon"),
            new IconView("Magnification Small", new MagnificationSmallIcon(SIZE), "magnification-small-icon"),
            new IconView("Magnification Large", new MagnificationLargeIcon(SIZE), "magnification-large-icon"),
            new IconView("Captive Portal", new CaptivePortalIcon(SIZE), "captive-portal-icon"),
            new IconView("Left Click", new LeftClickIcon(SIZE), "left-click-icon"),
            new IconView("Drag Pan", new DragPanIcon(SIZE), "drag-pan-icon"),
            new IconView("Unknown Med", new UnknownMedIcon(SIZE), "unknown-med-icon"),
            new IconView("Patient List", new PatientListIcon(SIZE), "patient-list-icon"),
            new IconView("Left Panel Close", new LeftPanelCloseIcon(SIZE), "left-panel-close-icon"),
            new IconView("Move Group", new MoveGroupIcon(SIZE), "move-group-icon"),
            new IconView("Capture", new CaptureIcon(SIZE), "capture-icon"),
            new IconView("Chip Extraction", new ChipExtractionIcon(SIZE), "chip-extraction-size"),
            new IconView("Iframe", new IframeIcon(SIZE), "iframe-icon"),
            new IconView("Resize", new ResizeIcon(SIZE), "resize-icon"),
            new IconView("Chronic", new ChronicIcon(SIZE), "chronic-icon"),
            new IconView("Input Circle", new InputCircleIcon(SIZE), "input-circle-icon"),
            new IconView("Bottom Right Click", new BottomRightClickIcon(SIZE), "bottom-right-click-icon"),
            new IconView("Stack", new StackIcon(SIZE), "stack-icon"),
            new IconView("Stack Off", new StackOffIcon(SIZE), "stack-off-icon"),
            new IconView("Right Panel Close", new RightPanelCloseIcon(SIZE), "right-panel-close-icon"),
            new IconView("Go To Line", new GoToLineIcon(SIZE), "goto-line-icon"),
            new IconView("Page Info", new PageInfoIcon(SIZE), "page-info-icon"),
            new IconView("Shelf Position", new ShelfPositionIcon(SIZE), "shelf-position-icon"),
            new IconView("Step", new StepIcon(SIZE), "step-icon"),
            new IconView("All Match", new AllMatchIcon(SIZE), "all-match-icon"),
            new IconView("Right Click", new RightClickIcon(SIZE), "right-click-icon")
    ));

    @Override
    public void start(Stage primaryStage) throws Exception {
        TabPane tabPane = new TabPane();
        VBox.setVgrow(tabPane, Priority.ALWAYS);
        for (String category : categories) {
            Tab tab = new Tab(category);
            tab.setClosable(false);
            tabPane.getTabs().add(tab);
        }

        // Search Group
        Label lblSearchIcon = new Label();
        lblSearchIcon.setGraphic(new SearchIcon(14));

        TextField tfSearch = new TextField();
        tfSearch.setPromptText("Search Icon");
        tfSearch.setOnKeyTyped(evt -> {
            String search = tfSearch.getText();
            if (search.isEmpty()) {
                // clear
                uiActions.setPredicate(p -> true);
            } else {
                FilteredList<IconView> filteredList;
                switch (tabPane.getSelectionModel().getSelectedIndex()) {
                    case 1:
                    case 2:
                    case 3:
                        filteredList = null;
                        break;
                    default:
                        filteredList = uiActions;
                }
                if (filteredList != null) {
                    filteredList.setPredicate(icon -> icon.label.getText().toLowerCase().contains(search.toLowerCase()));
                }
            }
        });
        HBox.setHgrow(tfSearch, Priority.ALWAYS);

        HBox toolbar = new HBox();
        toolbar.setAlignment(Pos.CENTER);
        toolbar.setSpacing(4);
        toolbar.setPadding(new Insets(8));
        toolbar.getChildren().addAll(lblSearchIcon, tfSearch);

        tabPane.getSelectionModel().selectedIndexProperty().addListener((observable, oldValue, newValue) -> tfSearch.clear());

        VBox vBox = new VBox();
        vBox.getChildren().addAll(toolbar, tabPane);

        // UI Actions FlowPane
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(8);
        flowPane.setVgap(8);
        flowPane.setPadding(new Insets(16));
        Bindings.bindContent(flowPane.getChildren(), uiActions);
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        scrollPane.setContent(flowPane);
        tabPane.getTabs().get(0).setContent(scrollPane);

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
