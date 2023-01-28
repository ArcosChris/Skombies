package com.skombie;

import java.util.List;
import java.util.Objects;

public class Character {
    private String name;
    private String description;
    private List<String> dialogue;

    public Character(String name, String description, List<String> dialogue) {
        setName(name);
        setDescription(description);
        setDialogue(dialogue);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public List<String> getDialogue() {
        return dialogue;
    }

    private void setDialogue(List<String> dialogue) {
        this.dialogue = dialogue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return getName().equals(character.getName()) && getDescription().equals(character.getDescription()) && getDialogue().equals(character.getDialogue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getDialogue());
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dialogue=" + dialogue +
                '}';
    }
}