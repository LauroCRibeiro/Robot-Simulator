 import processing.core.PApplet;

//Variables declaration
  public class Robot extends PApplet{
  int colour;   float x1;           float angle;
  float y1;     float x2;           float jitter;
  float y2;     float x3;           boolean key_t;
  float y3;     float xSpeed;       boolean firstexec;
  float ySpeed; float w;
  float h;      float xDelta;
  float yDelta; PApplet parent;
  
  //my Robot constructor
    public Robot(PApplet p, int colour, float x1, float y1, float x2, float y2, float x3, float y3, 
                float xSpeed, float ySpeed, float w, float h, float xDelta, float yDelta){
        parent = p;
        this.colour = colour; 
        this.x1 = x1;
        this.y1= y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.xSpeed= xSpeed;
        this.ySpeed = ySpeed;
        this.w = w;
        this.h = h;
        this.xDelta = xDelta;
        this.yDelta = yDelta;  
        this.key_t = true;
        this.firstexec = true;
    }
    //It displays my robots on the screen
    public void display(){
        parent.rectMode(CENTER);
        parent.fill(colour);
        parent.triangle(x1,y1,x2,y2,x3,y3);
        parent.ellipse(x1,y1,w,h);
    }

    
    //Speed method for movements on the screen
    public void drive(){
     	x1=x1+xSpeed;
      y1=y1+ySpeed;
      x2=x2+xSpeed;
     	y2=y2+ySpeed;
     	x3=x3+xSpeed;
     	y3=y3+ySpeed;
    }

     //Movement Method which goes to the right
    public void goRight(){
     	xSpeed = 5;
     	ySpeed = 0; 
        if(x1==470){
            xSpeed = 0;            
        }          
    }

    //Movement method which goes down
    public void goDown(){
     	xSpeed = 0;
     	ySpeed = 5;
        if(y1==460){
            ySpeed = 0;
        }          
    }

    //Movement method which goes to the left
    public void goLeft(){
     	xSpeed = -5;
     	ySpeed = 0;
        if(x1==0){
            xSpeed = 0;
        }         
    }

    //Movement method which goes up
    public void goUp(){
    	xSpeed=0;
     	ySpeed = -5;
        if(y1==0){
            ySpeed = 0;
        }         
    }

    //Alice`s Patrol Method
    public void walk(){      
        if(x1>=90){
            goDown();
     	}
     	if(y1>=470){
            goLeft();
     	}
     	if(x1<=30){
            goUp();
     	}
     	if(y1<=20 && y1<=20){
            goRight();
     	}
     	if(x1>=470 && y1<20){
            goDown();
     	}
    }

   //BOB`s random walk Method 
    public void rwalk(){     		
        if(firstexec == true){
            xDelta = random(-2,2);
            yDelta = random(-2,2);
            firstexec = false;
        }
        if(key_t == true){
            x1+=xDelta;
            y1+=yDelta;
            x2+=xDelta;
            y2+=yDelta;
            x3+=xDelta;
            y3+=yDelta;            

            if((x1>=0 && x3 <= 500)&&(y1>0 && y2 < 500)){
                key_t = true;            
            }else{                               
                key_t = false;
            }
        }
        else{
            x1-=xDelta;
            y1-=yDelta;
            x2-=xDelta;
            y2-=yDelta;
            x3-=xDelta;
            y3-=yDelta;  
            if((x1>=0 && x3 <= 500)&&(y1>0 && y2 < 500)){
                key_t = false;              
            }else{
                xDelta = random(-2,2);
                yDelta = random(-2,2);
                key_t = true;
            }            
        }     
    }















  }