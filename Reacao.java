public class Reacao{
  private int x;
  private int y;
  private int quantA = 0;
  private int quantB = 0;
  private int quantC = 0;
  private int i;
  private int j;
  private int contA = 0;
  private int contB = 0;

  public Reacao(int x, int y){
    this.x = x;
    this.y = y;
  }
  public void adicionarA(int a){
    this.quantA += a;
  }
  public void adicionarB(int b){
    this.quantB += b;
  }
  public void agitar(){
      this.i = this.x;
      contA = 0;
      contB = 0;
     while( i< this.quantA + 1){
       contA++;
       i +=this.x;
     }
      this.j = this.y;
     while( j< quantB + 1 ){
       contB++;
       
       j +=this.y;
     }
     if(contA > 0  && contB > 0){
       if(contA > contB){
         quantC += contB;
         quantA -= contB * this.x;
         quantB -= contB * this.y;
       }
       else if(contB > contA){
         quantC += contA;
         quantA -= contA * this.x;
         quantB -= contA * this.y;
       }
       else{
         quantC += contA;
         quantA -= contA * this.x;
         quantB -= contA * this.y;
       }
     }else{
       quantC += 0;
     }
     
  }
  public int getC(){
    return quantC;
  }
}