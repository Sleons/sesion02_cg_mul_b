package CG;
 /*Bajo el sistema de coordenadas cartesianas referir un punto  en un plano
  *  2Dcon sus respectivas propiedades y valores. DIchos valores deben asignarse
  *   como una entrada por teclado
  */
public class SistemasCoordenadas2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cartesiana2D punto = new Cartesiana2D();
		   punto.setX(4);
		   punto.setX(2);
	}

}

class Cartesiana2D{
   private int x, y;
   
   public void setX(int x) {
   this.x = x;
   
   }
   
   public void setY(int y) {
	   this.y = y;
	   
	   }
}