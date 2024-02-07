package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LeaderboardIcon extends SVGIcon {

    public LeaderboardIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.9);
    }

    public LeaderboardIcon(double size) {
        super(size, size * 0.9);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.5 21H2V9h5.5zm7.25-18h-5.5v18h5.5zM22 11h-5.5v10H22z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "leaderboard-icon";
    }
}
