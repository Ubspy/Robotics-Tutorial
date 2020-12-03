# Introduction
Welcome! This is a coding guide all the way from basic Java to vision code intended for FRC students, specifically those for Sargon Robotics team 2335 with little to no prior programming experience. My name is Jack Moren, I was the head programmer of the team from 2016 to 2019. Before my arrival, there was not a lot to learn from, with the FRC wiki being spotty at best and there only being one other programmer there wasn't a lot of time for me to learn. Additionally, our team wasn't too advanced in programming, so I had to learn a lot on my own. To preserve all I learned, I decided to write this guide. This is the 2.0 version, first the first one being lost by SMSD erasing my Google Drive. Additionally, with there being a decent gap in FRC because of the pandemic, I figured it would be nice to have this all written down so when the robotics seasons continue, there's a good starting place.


# Basic Java
## Intro
The first set of topics we're going to cover is the basics of the Java programming language. As of my time leaving, there are three official supported languages: Java, C++, and Labview. I chose to have the language for our team be Java, this is for several reasons. This is not because I specifically like Java over the other two, but for learning it's the best decision to start off with. C++, while being very similar to Java, is much more complicated. C++ requires you to work a lot more in depth, which can have many benefits, but it also requires a lot more code for the same actions, as well as understanding that is frankly a lot to learn before the build season. I also chose not to use Labview because simply it's not a real coding language. Learning Java can help you if you wish to further pursue programming, like creating a Minecraft mod, a website, or pursue a computer science degree. While Labview is used in the field, it's for specific products made by National Instruments and is much more limited. Furthermore, learning Java will teach you coding, Labview will teach you Labview, especially when it will come to vision coding I believe learning how a program works on a fundamental level is much more important.

## Getting started with an IDE
Before we jump into coding we need to have the software.

> But why do I need software to write code?

I hear you asking, well writing code you can do even on paper but we need software to run it. When a programmer like you writes code, the computer can't understand it directly. What's the point of writing the code then? Well something the computer **can** understand don't make any sense in English. The point of the code we will write is that it can easily be turned into something the computer can understand using a `compiler`. A compiler is a piece of software that turns our code into an executable file, which we can run.

So which one do you choose? If you look up `Java compiler` you'll probably find tons and tons of different ones, and they all have their own nuances. For robot coding, there will be a specific one you should download, but for basic Java I recommend using [repl.it](https://repl.it) because you don't need to install anything! It's all online! All you need it to make an account, start a new file and make sure it's using Java, then press the `run` button.

Create a new file:
![New File Photo](pictures/repl-1.png)

Select Java:
![Select Java](pictures/repl-2.png)
You can give what ever name you like for the file, but I'd recommend something you can look at later and know what you were working on. While the default names can be funny, they're not practical when you're trying to find when you were learning about functions, for example.

## Hello World!
Finally, we can start coding! When you open up your file you'll notice there's already a program written in there. My interface might look different from yours, that's because I have `dark mode` turned on, don't worry though other than my eyes hurting less, there's no other differences.
![Hello World](pictures/hello-world.png)
 If you press the run button on the top, your program will run on the left, you'll notice the program outputted
 > Hello, world!

 This is tradition for learning a new programming language, your first program is always something that just prints out "Hello, world!"
 Now you're a real programmer! Well not quite, because as I'm sure you've figured out you didn't write any of that. There are seven lines in this program and you probably have no idea what any of it means.

 So where do we start? Let's begin from line 1:
 ```Java
class Main
 ```
 This isn't going to mean much to us until we get further down the line, but right now all you need to know is that Java requires a "main" class to function. It's where your main method is.

 I can already hear you asking:
 > What on earth is a main method?

 Well a main method is just