public class DogFactory {
  // This method has the interface type Dog
  public static Dog getDog(String volume) {
    if ( volume.equals("deafening"))
      return new LargeDog();
    if ( volume.equals("bearable"))
      return new MediumDog();
    if ( volume.equals("whisper"))
      return new SmallDog();
    return null;
  }
}


// what does the static do?
