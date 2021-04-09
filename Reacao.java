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
    quantA += a;
  }
  public void adicionarB(int b){
    quantB += b;
  }
  public void agitar(){
      i = x;
      contA = 0;
      contB = 0;
     while( i< quantA + 1){
       contA++;
       i +=x;
     }
      j = y;
     while( j< quantB + 1 ){
       contB++;
       
       j +=y;
     }
     if(contA > 0  && contB > 0){
       if(contA > contB){
         quantC += contB;
         quantA -= contB * x;
         quantB -= contB * y;
       }
       else if(contB > contA){
         quantC += contA;
         quantA -= contA * x;
         quantB -= contA * y;
       }
       else{
         quantC += contA;
         quantA -= contA * x;
         quantB -= contA * y;
       }
     }else{
       quantC += 0;
     }
     
  }
  public int getC(){
    return quantC;
  }
}