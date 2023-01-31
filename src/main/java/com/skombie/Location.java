package com.skombie;

import java.util.List;
import java.util.Objects;

public class Location {
    private String name;
    private String description;
    private List<Character> characters;
    private List<Furniture> furniture = null;
    private int unsecurePoints;
    private boolean hasSkunk = false;
    private List<Item> items;
    private List<Weapon> weapons;
    private boolean isSecure;
    private List<String> availableRooms;

    public Location(String name, String description, List<Character> characters,
                    List<Furniture> furniture, int unsecurePoints, boolean hasSkunk,
                    List<Item> items, List<Weapon> weapons, boolean isSecure, List<String> availableRooms) {
        this.name = name;
        this.description = description;
        this.characters = characters;
        this.furniture = furniture;
        this.unsecurePoints = unsecurePoints;
        this.hasSkunk = hasSkunk;
        this.items = items;
        this.weapons = weapons;
        this.isSecure = isSecure;
        this.availableRooms = availableRooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public List<Furniture> getFurniture() {
        return furniture;
    }

    public void setFurniture(List<Furniture> furniture) {
        this.furniture = furniture;
    }

    public int getUnsecurePoints() {
        return unsecurePoints;
    }

    public void setUnsecurePoints(int unsecurePoints) {
        this.unsecurePoints = unsecurePoints;
    }

    public boolean isHasSkunk() {
        return hasSkunk;
    }

    public void setHasSkunk(boolean hasSkunk) {
        this.hasSkunk = hasSkunk;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public boolean isSecure() {
        return isSecure;
    }

    public void setSecure(boolean secure) {
        isSecure = secure;
    }

    public List<String> getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(List<String> availableRooms) {
        this.availableRooms = availableRooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return unsecurePoints == location.unsecurePoints && hasSkunk == location.hasSkunk && isSecure == location.isSecure && name.equals(location.name) && description.equals(location.description) && characters.equals(location.characters) && furniture.equals(location.furniture) && items.equals(location.items) && availableRooms.equals(location.availableRooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, characters, furniture, unsecurePoints, hasSkunk, items, isSecure, availableRooms);
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", characters=" + characters +
                ", furniture=" + furniture +
                ", unsecurePoints=" + unsecurePoints +
                ", hasSkunk=" + hasSkunk +
                ", items=" + items +
                ", isSecure=" + isSecure +
                ", availableRooms=" + availableRooms +
                '}';
    }
}