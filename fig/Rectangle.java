public class Rectangle extends Figure{
     
	 private double largeur; 
                 
	 public double getLargeur(){
                     return this.largeur;
                }
              public void setLargeur(double largeur){
                 this.largeur=largeur;
              }
                public double demiPerimetre(){
                     return this.longueur + this.largeur;
                }
                 public double surface(){
                  return this.longueur * this.largeur;
                }
                public double diagonale(){
                  return Math.sqrt(Math.pow(this.longueur,2)+Math.pow(this.largeur,2));
                }
}