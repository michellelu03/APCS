

class Vehicle{
  String ret = "";
  int location;
  
  public Vehicle(){
   location = 0; 
  }
  
  public Vehicle(int loc){
    if(loc >= -20 && loc <= 20){
     location = loc; 
    }else
        location = 0;
  }
  
  public void forward(){
    if(location < 20){
      location += 1;
    }
  }
  
  public void backward(){
    if(location > -20){
      location -= 1;
    }
  }
  
  public int getLocation(){
   return location; 
  }
  
  public String toString(){
    for(int i = -20; i < location; i++){
      ret = ret + " ";
    }
    return ret + "@";
  }
}
