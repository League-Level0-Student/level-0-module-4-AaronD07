import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

   //In setup. Change the file name if you need to

// put these lines where you want the sound to play

PImage donkey;
PImage tail;
int x;
int y;
void setup () {
  Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");  
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.png");
  size(300, 221);
  tail.resize(40, 70);
  image(tail, mouseX-10, mouseY-20);
}
void draw() {
 background(#FFFFFF);
  
  rect(0, 0, 30, 30);
  rect(250, 75, 40, 40);
  if (dist(0, 0, mouseX, mouseY) <30) {
    
     background(donkey);
  }
x = mouseX;
 y = mouseY;
 if (mousePressed) {
   image(tail, x, y);
 }
 if (dist(mouseX, mouseY, 250, 75)<30) {
   background(donkey);
   if (playSound) {
     woohooSound.trigger();
     playSound = false;
    
}
   

 }


}
