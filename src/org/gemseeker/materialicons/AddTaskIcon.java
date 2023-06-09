package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AddTaskIcon extends SVGIcon {

    public AddTaskIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public AddTaskIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 976q-85 0-158-30.5T195 861q-54-54-84.5-127T80 576q0-84 30.5-157T195 292q54-54 " +
                "127-85t158-31q75 0 140 24t117 66l-43 43q-44-35-98-54t-116-19q-145 0-242.5 97.5T140 576q0 145 " +
                "97.5 242.5T480 916q37 0 71.5-7t66.5-21l45 46q-41 20-87 31t-96 11Zm290-90V766H650v-60h120V586h60v" +
                "120h120v60H830v120h-60ZM421 758 256 592l45-45 120 120 414-414 46 45-460 460Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "add-task-icon";
    }
}
