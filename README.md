# Numeral System Converter

Java program that converts numbers between different numeral systems (bases 2-36).

Rest of the input Instructions are in the programm itself after you start it

It doesnt really have any error handling, can be usefull for stuff like homework though

## What it does

- Converts any number to decimal
- Converts decimal numbers to any base between 2 and 36
- Supports common bases like binary (2), octal (8), decimal (10), and hexadecimal (16) and anything in between and up to 36?

## Requirements

No idea, i used it on java 21 and it worked

- Java 21 or higher
- Maven 3.x

## Installation

You could just paste it into any IDE and run it from there I think, but this way you can start the programm in the terminal (I only tested it on debian)

### 1. Clone the repository
```bash
git clone https://github.com/forloopinarow/Numeral-System-Converter.git
cd Numeral-System-Converter
```

### 2. Fix Java version (if needed)

If you're using Java 21, edit `pom.xml` and change the compiler source and target from `25` to `21`:

Just use your editor of choice, i used nano

```xml
<maven.compiler.source>21</maven.compiler.source>
<maven.compiler.target>21</maven.compiler.target>
```

Yeah nvm you have to do it I think, no Idea why tho, but as of now it worked when I used Debian

(Pretty sure these instructions are wrong, cant figure out the problem rn, please just ask Claude or someone for help, the main problem here is that maven is compiling 25, and the programm was written in 21 I think, just switch 21 with the version youre using, but you cant use a version under 21, since java cant compile code written under java 21 since the code was written in 21, only works down i think)

(Maybe just ask claude for this part, since I dont quite understand it aswell, im just guessing half of the stuff here rn)

### 3. Build the project
```bash
mvn clean package
```

### 4. Run it
```bash
java -cp target/BaseConversion-1.0-SNAPSHOT.jar org.example.Main
```

## Optional: Run from any terminal directory (It worked for me, no guarantees tho)

1. Create a script:
```bash
mkdir -p ~/.local/bin
nano ~/.local/bin/numeral-converter
```

2. Add this to the file:
```bash
#!/bin/bash
java -cp ~/Numeral-System-Converter/target/BaseConversion-1.0-SNAPSHOT.jar org.example.Main "$@"
```

3. Make it executable:
```bash
chmod +x ~/.local/bin/numeral-converter
```

4. Add to PATH (if not already there):
```bash
echo 'export PATH="$HOME/.local/bin:$PATH"' >> ~/.bashrc
source ~/.bashrc
```

Now you can just type `numeral-converter` into any terminal I believe

## Uninstall

If you want to remove the project from your system:

### 1. Delete the project files
```bash
rm -rf ~/Numeral-System-Converter
```

### 2. Delete the script (if you created one)
```bash
rm ~/.local/bin/numeral-converter
```

### 3. (Optional) Remove from PATH

If you want to clean up your `.bashrc`, open it:
```bash
nano ~/.bashrc
```

Find and delete this line:
```bash
export PATH="$HOME/.local/bin:$PATH"
```

Then reload:
```bash
source ~/.bashrc
```
