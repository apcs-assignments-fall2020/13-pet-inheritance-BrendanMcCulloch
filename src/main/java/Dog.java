public class Dog extends Pet {
    private String breed;

    public Dog() {
        super();
        this.breed = "unknown";
    }

        public Dog(String name, int age, String breed){
            super(name, age);
                this.breed = breed;
        }


    // Constructors
    

    // makeNoise() method
    public void makeNoise() {
        System.out.println("Bark!");
    }

    // toString method
    public String toString() {
        String dogthings = "Name: " + this.getName() + ", Age: " + this.getAge() + ", breed: " + breed;
        return dogthings;
    }


    // Getter
    public String getBreed() {
        return this.breed;
    }

    // Setter
    public void setBreed(String breed) {
        if(breed.trim().length() != 0){
            this.breed = breed;
        }
    }
}