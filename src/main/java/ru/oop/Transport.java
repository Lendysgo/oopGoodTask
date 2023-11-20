package ru.oop;

public interface Transport extends Position {

    void addPeople(Person person);

    void goToNearest(Position destination);
}
