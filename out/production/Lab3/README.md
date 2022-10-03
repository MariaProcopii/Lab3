# Lab3

# UML Class Diagram
![Lab3 OOP](https://user-images.githubusercontent.com/77497709/193453260-51099230-ac73-4cc0-a4a9-a2cb29da3be7.png)

# Description:

The root class, common-to-all classes, which ties all my actors in the simulation, is the `SuperClass`. It contains common atributes as `playerNr`, `deckNr`, `cardNr` ... `reputation`. I'm using this atributes to provide a statistic in the end of my simulation. Also it has setters and getters and `printStatistic()` method which prints the statistic table.

`SuperClass` is inherited by `Entities` and `Human` abstract classes. `Human` is used to store atributes common to all descendent classes `names`  - array with names for actors, `phrases` - array of phrases for actors, `random`, `name` - randomly choosed name, `opinion` and methods (`greeting()`, `speak()`, `goodbye()`).

`Human` is inherited by `Cook`, `Waiter`, `Cleaner`, `Barman`, `Admin`, `Player`. All this classes overrides methos from `Human` class to provide greeting message, randomly speek or say goodbye.

`Entities` is inherited by `Card`, `Deck`, `Meal`, `Menu`, `Table`. All classes use `change()` to change the object if it's too old. In this momnet, we increase the value of atributes from `SuperClass` by 1. Second method `qualityCheck()` is used to analize the quality of object. If it's new, user can keep it, if not he'll change it and the `reputation` will decrease.
