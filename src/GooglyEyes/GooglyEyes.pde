void setup () {
      PImage face = loadImage("face.png");
      size(400, 600);
      face.resize(width, height);
    background(face);
  
}
void draw () {
  
  if (mouseX > 170) {
    mouseX=165;
  }
  if (mouseX < 130) {
    mouseX=130;
  }
  if (mouseY > 190) {
    mouseY=190;
  }
  if (mouseY < 160) {
    mouseY=160;
  }
  fill(#FFFFFF);
  ellipse(150, 175, 60, 50);
  ellipse(250, 150, 60, 50);
  fill(#050505);
  ellipse(mouseX, mouseY, 20, 20);
  ellipse(mouseX+100, mouseY-25, 20, 20);

}
