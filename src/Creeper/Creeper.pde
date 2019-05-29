PImage creeper; 
//at the top of your program

//in setup method
void setup () {
  size(1000, 500);
  PImage minecraft = loadImage("creeperLandscape.jpg");    
minecraft.resize(width, height);        
background(minecraft);

creeper=loadImage("creeper.png"); 
creeper.resize(30, 30);
}

void draw() {
  image(creeper, 900, 450);
  fill(#FF0000);

boolean x = isNear(900, mouseX);
boolean y = isNear(450,mouseY);
if (x == true && y == true) {
  fill(0, 255, 0);
  print("You found the creeper");
}
ellipse(mouseX, mouseY, 5, 5);
}

boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
