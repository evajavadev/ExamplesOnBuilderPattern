# Examples On Builder Pattern

<br>

> Below some different program examples on the builder design pattern. 

<br>

My own *simple definition* of what a builder pattern does, is that its `Builder class` replaces `setters`. This is great when for example a complex object needs to create several different representations, using the same construction proccess. 

The purpose among others, is to protect the data. So only the `Builder` knows the specifics. Also, if the program besides its required elements has optional elements.   

To make this happen, a `public static Builder class` together with its `constructor` are created. These two guys must reside inside the `public class of the Data`.   

<br>
<br>


### In Robot Style

This program is from [Derek Banas](https://www.youtube.com/user/derekbanas) video [Builder Design Pattern](https://www.youtube.com/watch?v=9XnsOpjclUg). 

I have changed some [code](https://github.com/evajavadev/ExamplesOnBuilderPattern/tree/master/InRobotStyle), text and class names. First below the compiled result.     

![promt on a robot](/images/aRobotOnWay.jpg) 

<br>

...and how the corresponding main method's code in the file `RobotLauncher.java` looks. 

![code for the result on one robot](/images/soutFirstRobotBuilderImpl.jpg) 

<br> 

But I had to test. How would the code look if I create several robots?

![code for serveral robots](/images/RobotsOnWay.jpg)

<br>

This is nice. But there must be a shorter way to code.

![promt on the result for several robots](/images/soutRobotsOnWay.jpg)

<br>
<br>


### Computer Components

Here [Pankaj](https://www.youtube.com/user/JournalDev), guiding on how to code `builders` from his article [Builder Design Pattern in Java](https://www.journaldev.com/1425/builder-design-pattern-in-java). 

I did a "sout" (IntelliJ's `System.out.println`) to start out. When printing an object to a `print stream`, it will return a string representation of a `hash code`. This integer simply just shows the object's physical address.

The highest class in Java is the [`Object class`](https://docs.oracle.com/javase/10/docs/api/java/lang/Object.html). From here all objects inherit methods. One of the methods is `toString()`. And when this method isn't overridden, it usually returns an object's physical address.
 

![the first promt on computer components](/images/soutComputerComponents1.jpg)

<br>

![code for ...](/images/ComputerComponents_ComputerClient.jpg)

<br>

![code for ...](/images/ComputerComponents_ComputerBuilderDirector.jpg)

...

<br>
<br>


### Person Review

...

<br>
<br>


### The Flower Garden

Once upon a time ...
