public class Runner {
  public static void main(String[] args) {

    // This new variable "dog" is being overwritten each time a new dog is created.
    // Create a deafening dog
    Dog dog = DogFactory.getDog("deafening");
      dog.speak();

    // Create a bearable dog
    dog = DogFactory.getDog("bearable");
      dog.speak();

    // Create a whispering dog
    dog = DogFactory.getDog("whisper");
      dog.speak();
  }


}