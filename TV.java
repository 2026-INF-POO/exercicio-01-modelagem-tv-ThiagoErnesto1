class TV{
  int polegadas;
  int volume=5;
  String marca;
  int voltagem;
  int canal;
  int ligar() {
    if (
  }
  void desligar() {
    // Lógica para desligar tv
  }
  int aumentarvol() {
    if (volume<10){
      volume++;
    }
    return volume;
  }
  int diminuirvol(){
    if (volume>1){
      volume--;
    }
    return volume;
  }  
  void canalmais(){
    if (canal<10){
      canal++;
    }
    return canal;
  }
  void canalmenos(){
    if (canal>1){
      canal--;
    }  
    return canal;
  } 
}
