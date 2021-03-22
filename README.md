#Lexical analyzer 🈶
A lexical analyzer using ANTLR and Gradle as build tool. :)

### 🔧 Pre requisites
* Gradle
* Java 11

### 🏃🏻 How to run
Clone the project and at the root folder choose which command you want to run:

* #### Run application Task
  ![runnner](https://user-images.githubusercontent.com/36551957/111943075-6dbfd680-8ab3-11eb-848e-fa545549a6f2.gif)
    To start the application execute the following command: ```gradle run```

* #### Generate Antlr Files
    To start the Antlr4 files execute the following command: ```gradle antlrbuild```

### 📃 Grammar File
The grammar file are located on the following path: ```src/main/antlr/minipascal.g4```, feel free to change it if you need to. Remember to run the ``` gradle antlrbuild``` to see the changes at the program execution.

###⛏ Code File
This file will be analyzed by the Tokenizer generated from the grammar file. The current extension is .mp (reference to minipascal), feel free to change the extension and the content. Location: ```src/main/java/tcc/lexer/inputs/code.mp ```

###🐘 Gradle Structure
To add the AntlR4 dependency on this application we've used the gradle as build tool, from there we made the execution easier and faster  in some cases while testing. Check out the file ```build.gradle``` for more information.

###🛠 How it works?
In computer science, lexical analysis, lexing or tokenization is the process of converting a sequence of characters (such as in a computer program or web page) into a sequence of tokens (strings with an assigned and thus identified meaning).
![image](https://user-images.githubusercontent.com/36551957/111941776-92667f00-8ab0-11eb-95e7-bf1843490126.png)
for more information check out [this.](https://web.stanford.edu/class/archive/cs/cs143/cs143.1128/lectures/01/Slides01.pdf)

###📡 Contributions
Feel free to open any type of issue or contact me at my social networks!