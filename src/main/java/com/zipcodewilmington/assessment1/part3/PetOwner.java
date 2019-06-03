package com.zipcodewilmington.assessment1.part3;

//import com.sun.tools.javac.tree.DCTree;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public String name;
    public Pet[] pets;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
        if (pets != null) {
            for (Pet p : pets) p.setOwner(this);
        } else {
            this.pets = new Pet[1];
            this.pets[0] = null;
        }

    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        int length = (pets == null) ? 1 : pets.length;
        Pet[] newArray = new Pet[length];
        for (int i = 0; i < length-1; i++) newArray[i] = pets[i];
        newArray[newArray.length-1] = pet;
        this.pets = newArray;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        int length = (pets == null) ? 0 : pets.length;
        if (length == 1) {
            this.pets = new Pet[1];
            this.pets[0] = null;
            return;
        }
        Pet[] newArray = new Pet[length-1];
        int keepCount = 0;
        for (int i = 0; i < length; i++) {
            if (!pets[i].equals(pet)) {
                newArray[keepCount] = pets[i];
            }
        }
        this.pets = newArray;
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        if (pets == null) return null;
        for (Pet p : pets) if (p.equals(pet)) return true;
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        if (pets == null) return null;
        Pet youngest = pets[0];
        for (int i = 1; i < pets.length; i++) {
            if (pets[i].getAge() < youngest.getAge()) youngest = pets[i];
        }
        return youngest.getAge();
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        if (pets == null) return null;
        Pet oldest = pets[0];
        for (int i = 1; i < pets.length; i++) {
            if (pets[i].getAge() > oldest.getAge()) oldest = pets[i];
        }
        return oldest.getAge();
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        if (pets == null) return null;
        Float sum = new Float(0);
        for (Pet p : pets) sum += p.getAge();
        Float average = sum/(float)pets.length;
        return average;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        if (pets == null) return 0;
        return pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return pets;
    }
}
