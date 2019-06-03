package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public String name;
    public int age;
    public PetOwner owner;

    public Pet() {
        this.name = "";
        this.age = 0;
        this.owner = new PetOwner(null, this);
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.name = name;
        this.age = 0;
        this.owner = new PetOwner(null, this);
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        this.age = age;
        this.owner = new PetOwner(null, this);
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
        this.owner = new PetOwner(null, this);
    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
        newPetOwner.isOwnerOf(this);
        this.owner = newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return this.owner;
    }
}
