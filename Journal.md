# Journal

## Phase 1
If I try to create new DigitalMonster(), Java will give a compilation error because it is an abstract class. Abstract classes are used as a base for other classes, and each subclass must provide its own implementation of the abstract attack method.

## Phase 2
Using interfaces is more flexible because not every monster has the same abilities. The Flyable interface allows only certain monsters to fly, while the Electric interface allows others to use electric attacks. This keeps the base class simple and makes it easier to add different abilities.

## Phase 3
Polymorphism allows me to store different types of monsters in one ArrayList because they all extend DigitalMonster. Each monster can still use its own attack method. This is easier than creating separate lists for every monster type because I can manage all the monsters using one list and one loop.
