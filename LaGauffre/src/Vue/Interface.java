/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Vue.InterfacePlateau;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Adeline
 */
public class Interface extends Application{
    public int HEIGHT=600;
    public int WIDTH=800;
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, WIDTH, HEIGHT, Color.LIGHTBLUE);
        InterfacePlateau p=new InterfacePlateau(/*p,*/ HEIGHT-160, WIDTH-160);
        root.getChildren().add(p);
        
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
    
        
    }
    
}
