import processing.core.PApplet;


public class UseRobots extends PApplet{
    Robot[] ObjRobot;
    
    public static void main(String [] args){
        PApplet.main("UseRobots");
    }

    //It determines my screen size
    public void settings(){
 	size(500,500);
    }
    
    //my three Robots Constructor 
    public void setup(){
        ObjRobot = new Robot[3];
        ObjRobot[0] = new Robot(this,color(255,0,0),(width/20+5),(height/50),(width/50-5),(height/20+15),(width/10+10),(height/20+15) ,1,1,5,5,1,1);
        ObjRobot[1] = new Robot(this, color(0,255,0),(width/2),(height/2),(width/2),(height/2+40),(width/2+60),(height/2+20),1,1,5,5,1,1);
        ObjRobot[2] = new Robot(this,color(0,0,255),(width/10+10),(height/2+30),(width/10+10),(height/2+70),(width/5-10),(height/2+70),1,1,5,5,1,1);


    }

    //My draw function with Object Oriented programming of my Three Robots.
    public void draw(){
      	background(255);
        ObjRobot[0].display();
        ObjRobot[0].drive();
        ObjRobot[0].walk();
        ObjRobot[1].display();
        ObjRobot[1].rwalk();
        ObjRobot[2].display();
        

        //Keyboard Function activated 
        if (keyPressed) {
            if (keyCode == UP) {
                ObjRobot[2].goUp();
                ObjRobot[2].drive();
                ObjRobot[2].walk();
            }
            if (keyCode == DOWN) {
                ObjRobot[2].goDown();
                ObjRobot[2].drive();
                ObjRobot[2].walk();
            }
            if (keyCode == LEFT) {
                ObjRobot[2].goLeft();
                ObjRobot[2].drive();
                ObjRobot[2].walk();
            }
            if (keyCode == RIGHT) {
                ObjRobot[2].goRight();
                ObjRobot[2].drive();
                ObjRobot[2].walk();
            }            
        }
    }
}