public class Personagem{

  private int maxMana;
  private int[] baseMana = new int[4];
  private int[] nivelHabilidade = new int[4];
  private int manaPersonagem;
  private int xp;
  private int nivelPersonagem = 1;
  private int contMelhorias = 1;
  private int calculoMana;

  public Personagem(int maxMana, int baseMana1, int baseMana2, int baseMana3, int baseMana4){
    this.manaPersonagem = maxMana;
    this.maxMana = maxMana;
    this.baseMana[0] = baseMana1;
    this.baseMana[1] = baseMana2;
    this.baseMana[2] = baseMana3;
    this.baseMana[3] = baseMana4;
  }
  public void adicionarXP(int xp){
    this.xp += xp;
    while(this.xp > 99){
      if(nivelPersonagem < 25){
        nivelPersonagem++;
        contMelhorias++;
      }
      
      this.xp -=100;
    }
    
  }
  public int getNivel(){
    return nivelPersonagem;
  }
  public boolean melhorarHabilidade(int poder){
    if(contMelhorias > 0){
      if(poder == 3){
        if(nivelPersonagem > 5){
          if(nivelHabilidade[poder] < 3){
            contMelhorias--;
            nivelHabilidade[poder]++;
            return true;
          }
          else{
            return false;
          }
        }else{
          return false;
        }
      }
      else if(poder == 2){
        if(nivelHabilidade[poder] < 4){
          contMelhorias--;
          nivelHabilidade[poder]++;
          return true;        
        }else{
          return false;
        }
      }
      else{
        if(nivelHabilidade[poder] < 4){
          contMelhorias--;
          nivelHabilidade[poder]++;
          return true;
        }else{
          return false;
        }
      }
    }else{
      return false;
    }
  }
  public boolean usarHabilidade(int habilidade){
    if(nivelHabilidade[habilidade] == 0){
      return false;
    }
    else{
      calculoMana = baseMana[habilidade] * nivelHabilidade[habilidade];
      if(calculoMana < manaPersonagem + 1){
        manaPersonagem -= calculoMana;
        return true;
      }else{
        return false;
      }
    }
  }

  public void consumirPocao(){
    manaPersonagem += 350;
    if(manaPersonagem > this.maxMana){
      manaPersonagem = this.maxMana;
    }
    
  }


}