package day17.Task2;

public enum AnimalTypes {
    CAT("Cat", "meow"),
    DOG("Dog", "woof"),
    COW("Cow", "mooo");

    private final String name;
    private final String voice;

    AnimalTypes(String name, String voice){
        this.name = name;
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public static void getAnimalVoice(){
        for(AnimalTypes animal: AnimalTypes.values()){
            System.out.println(animal.getVoice());

        }
    }
}
