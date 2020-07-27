package edu.utep.cs5381.platformer;

import android.content.Context;

public class movingTile extends GameObject{

    // hovering just move on x axis between 2 waypoints

    private float waypointX1;// always on left
    private float waypointX2;// always on right
    private int currentWaypoint;
    final float MAX_X_VELOCITY = 3;

    //Moving Tile
    movingTile(Context context, float worldStartX, float worldStartY, char type, int pixelsPerMetre) {
        final int ANIMATION_FPS = 8;
        final int ANIMATION_FRAME_COUNT = 5;
        final String BITMAP_NAME = "brick";
        final float HEIGHT = 1;
        final float WIDTH = 3;

        setHeight(HEIGHT); // 2 metre tall
        setWidth(WIDTH); //  metres wide

        setType(type);

        setBitmapName("brick");
        // Now for the player's other attributes
        // Our game engine will use these
        setMoves(true);
        setActive(true);
        setVisible(true);

        // Set this object up to be animated
        setAnimFps(ANIMATION_FPS);
        setAnimFrameCount(ANIMATION_FRAME_COUNT);
        setBitmapName(BITMAP_NAME);
        setAnimated(context, pixelsPerMetre, true);

        // Where does the tile start
        // X and y locations from constructor parameters
        setWorldLocation(worldStartX, worldStartY, 0);
        setxVelocity(-MAX_X_VELOCITY);
        currentWaypoint = 1;
        setRectHitbox();
        setFacing(LEFT);
    }

    public void setWaypoints(float x1, float x2){
        waypointX1 = x1;
        waypointX2 = x2;
    }

    public void update(long fps, float gravity) {

        if(currentWaypoint == 1) {// Heading left
            if (getWorldLocation().x <= waypointX1) {
                // Arrived at waypoint 1
                currentWaypoint = 2;
                setxVelocity(MAX_X_VELOCITY);
                setFacing(RIGHT);
            }
        }

        if(currentWaypoint == 2){
            if (getWorldLocation().x >= waypointX2) {
                // Arrived at waypoint 2
                currentWaypoint = 1;
                setxVelocity(-MAX_X_VELOCITY);
                setFacing(LEFT);
            }
        }

        // update the hovering hitbox
        setRectHitbox();

        move(fps);
    }
}